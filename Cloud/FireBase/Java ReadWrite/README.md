### Firebase helps you build and run successful apps Backed by Google and loved by app development teams - from startups to global enterprises

###Firebase Settings
Navigate to [https://console.firebase.google.com/](https://console.firebase.google.com/)
Firebase Console --> Project Overview --> Project Settings --> Service Accounts --> Generate new private key

###Important: You need to generate the private key and store as serviceAccountKey.json in the src --> resources folder

### Update #1  in `Main.java` & `ReadDataMain.java` URL_LINK https://<< YourcustomURL >>.firebaseio.com/

### Update #2  in `Main.java` & `ReadDataMain.java` String keyLocation = "/Users/<username>/Documents/Development/FireBaseDemo/src/main/resources/serviceAccountKey.json";

###Firebase Firestore Database
Data is Stored in Firestore Database

### Read & Write example is available in this project

### Read more about Firebase and accessing the API in java
[https://firebase.google.com/docs/firestore/quickstart](https://firebase.google.com/docs/firestore/quickstart)

### You can add Firebase to an APP, Game, Server, etc.,
[https://firebase.google.com/docs/admin/setup](https://firebase.google.com/docs/admin/setup)
