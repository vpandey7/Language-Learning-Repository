function mainFunction(anotherFunction,value){
	anotherFunction(value);
}

mainFunction(function (stuff){console.log(stuff);},"Hello");