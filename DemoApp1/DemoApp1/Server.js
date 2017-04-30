/**
 * http://usejsdoc.org/
 */
//var server=http.createServer(function(req,res){
//	res.writeHead(200,{"content-Type":"text/html"});
//	res.end('hello');
//	console.log("Hello Node")
//}).listen(5555);			

var http=require('http');
var fs =require('fs');

function onRequest(req,res){
	if(req.method=='GET' && req.url=='/'){
		res.writeHead(200,{"content-Type":"text/html"});
		fs.createReadStream("./index.html").pipe(res);
	}
	}
http.createServer(onRequest).listen(9999);