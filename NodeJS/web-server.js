
var http = require('http');

var s = http.createServer(function(req, res){
	console.log("I got a request");

	res.end("Hey,Thanks for calling");
});

s.listen(8080);