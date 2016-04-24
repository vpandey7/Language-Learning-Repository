var fs = require('fs');
var fb = fs.readFileSync(process.argv[2]);
var str = fb.toString();
//console.log(str.length);
var split_lines = str.split("\n");
console.log(split_lines.length-1);
//console.log("?????");
//console.log(fb);z