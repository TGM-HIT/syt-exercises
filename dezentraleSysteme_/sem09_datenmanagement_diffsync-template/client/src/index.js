console.log('starting sync service!');

let DiffSyncClient = require('diffsync').Client;

let socket = require('socket.io-client');

let client = new DiffSyncClient(socket('http://localhost:3000'), 'form-data');

let data;
client.on('connected', function(){
    // Die Datenreferenz, welche zum synchronisieren verwendet wird.
    data = client.getData();
    console.log('Verbunden!');
    console.log('Daten akutell:');
    console.log(data);

    // Hier können listener erstellt werden
    // Tipp: document.getElementById('xxx').addEventListener(...)

    // Mit:
    //   client.sync();
    // Werden die Daten mit dem Server synchronisiert

});

client.on('synced', function(){
    // Wird aufgerufen, wenn neue Daten vom Server reinkommen
    console.log('Neue Daten vom Server!');
    console.log('Synchronisierte Daten akutell:');
    console.log(data);

});

client.initialize();


