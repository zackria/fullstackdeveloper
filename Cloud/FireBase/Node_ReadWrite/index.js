const fs = require('firebase-admin');

const serviceAccount = require('./key.json');

fs.initializeApp({
 credential: fs.credential.cert(serviceAccount),
  databaseURL: "https://iqra-c28da-default-rtdb.firebaseio.com"
});

const db = fs.firestore(); 

async function run(){
	// get collection
	const querySnapshot = await db.collection('users').get();
	const queryData = querySnapshot.docs.map(doc => doc.data())
	console.log("queryData "+ JSON.stringify(queryData, null, 2));

	if (queryData.size===0) {
	  console.log('No such document!');
	} else {
	  console.log('Document data:', queryData);
	}

	for(var i=0; i<queryData.length ;i++ ){
		console.log(queryData[i]);
		console.log(queryData[i]["last"]);
	}
}

run().catch(e => { console.error(e); process.exit(-1); })




