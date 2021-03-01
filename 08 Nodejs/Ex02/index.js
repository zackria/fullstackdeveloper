const MongoClient = require('mongodb').MongoClient;
//const url = 'mongodb://localhost:27017';
//mongodb+srv://zack:FK3FVnCIZl2ntGLE@cluster0.adujg.mongodb.net/test

const url = "mongodb+srv://zack:FK3FVnCIZl2ntGLE@cluster0.adujg.mongodb.net/myFirstDatabase?retryWrites=true&w=majority";

// added { useNewUrlParser: true }
MongoClient.connect(url,
    { useNewUrlParser: true, useUnifiedTopology: true }).then(client => {
        const db = client.db('my-db');
        var myobj = { name: "Company Inc", address: "Highway 37" };

        const collection = db.collection('my-collection');

        collection.insertOne(myobj, function(err, res) {
            if (err) throw err;
            console.log("1 document inserted");
          } );

        return collection.find({}).limit(1).toArray();
    })
    .then(response => console.log(response))
    .catch(error => console.error(error));