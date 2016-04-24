//console.log(process.argv);
var sum = 0;
var i ;

for(i = 2;i<process.argv.length;i++){
	sum = sum + Number(process.argv[i]);
}
console.log(sum);