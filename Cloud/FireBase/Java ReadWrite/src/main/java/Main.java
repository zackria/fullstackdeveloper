import com.google.api.core.ApiFuture;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;


public class Main {

    public static Logger logger = LoggerFactory.getLogger(Main.class);

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

            FirebaseOptions options = builder.setCredentials(credentials)
                    .setDatabaseUrl(URL_LINK)
                    .build();
            FirebaseApp.initializeApp(options);

            Firestore db = FirestoreClient.getFirestore();

            DocumentReference docRef = db.collection("users").document("alovelace1");
            // Add document data  with id "alovelace" using a hashmap
            Map<String, Object> data = new HashMap<>();
            data.put("first", "Ada1");
            data.put("last", "Lovelace1");
            data.put("born", 1853);
            //asynchronously write data
            ApiFuture<WriteResult> result = docRef.set(data);
            // ...
            // result.get() blocks on response
            logger.info("Update time : " + result.get().getUpdateTime());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
