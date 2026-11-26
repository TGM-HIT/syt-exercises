/**
 * Created by kevin_000 on 25.11.2017.
 */

// setting up socket.io
let io = require('socket.io')(3000);

// setting up diffsync's DataAdapter
let diffsync    = require('diffsync');
let dataAdapter = new diffsync.InMemoryDataAdapter();

// setting up the diffsync server
let diffSyncServer = new diffsync.Server(dataAdapter, io);


