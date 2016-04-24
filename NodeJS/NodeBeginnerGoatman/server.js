// HTTP Server module
var http = require ('http');
var url = require('url');
function startServer(route,handle){
	function onRequest(request,response){
		var pathname = url.parse(request.url).pathname;
		console.log("Request Received for " + pathname);
		route(handle,pathname);
		response.writeHead(200,{"Content-Type":"text/plain"});
		response.write("Hello from our Server Module");
		response.end();
	}
	http.createServer(onRequest).listen(8888);

	console.log("Server started on port 8888");

}
exports.startServer = startServer;