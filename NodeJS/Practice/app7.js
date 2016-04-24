var fs = require('fs');
fs.readFile('input.txt',function(err,data){
	if(err){
		console.log(err);
	}
	else{
		console.log("Async data is " +data.toString());
	}

});

var sd = fs.readFileSync('input.txt');
console.log("Data from Sync reading is " + sd.toString());
console.log("This is the end");
