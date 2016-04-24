console.log(__filename);
console.log(__dirname);

function printStuff(){
	console.log("This was from setTime");
}
//setTimeout(printStuff,5000);
setInterval(printStuff,2000);