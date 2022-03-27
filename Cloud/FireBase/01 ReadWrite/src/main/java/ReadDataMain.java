import com.google.api.core.ApiFuture;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

public class ReadDataMain {

    public static Logger logger = LoggerFactory.getLogger(ReadDataMain.class);

    public static void main(String[] args) {

        //TODO URL_LINK to be updated
        final String URL_LINK = "https://<firebasename>-default-rtdb.firebaseio.com/";

        //Firebase Console --> Project Overview --> Project Settings --> Service Accounts --> Generate new private key
        
        //TODO keyLocation to be updated
        String keyLocation = "/Users/<username>/Documents/Development/FireBaseDemo/src/main/resources/serviceAccountKey.json";

        logger.info("Main Class Running");
        try {
            // Use a service account
            InputStream serviceAccount = new FileInputStream(keyLocation);
            GoogleCredentials credentials = GoogleCredentials.fromStream(serviceAccount);
            FirebaseOptions.Builder builder = FirebaseOptions.builder();

            FirebaseOptions options = builder.setCredentials(credentials).setDatabaseUrl(URL_LINK).build();
            FirebaseApp.initializeApp(options);

            Firestore db = FirestoreClient.getFirestore();

            // asynchronously retrieve all users
            ApiFuture<QuerySnapshot> query = db.collection("users").get();
            // ...
            // query.get() blocks on response
            QuerySnapshot querySnapshot = query.get();
            List<QueryDocumentSnapshot> documents = querySnapshot.getDocuments();
            for (QueryDocumentSnapshot document : documents) {
                System.out.println("User: " + document.getId());
                System.out.println("First: " + document.getString("first"));
                if (document.contains("middle")) {
                    System.out.println("Middle: " + document.getString("middle"));
                }
                System.out.println("Last: " + document.getString("last"));
                System.out.println("Born: " + document.getLong("born"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
