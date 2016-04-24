console.log("Hello");

var Vishal = {
	favFood: "Ham",
	favMovie: "Breaking Bad"

};


// Person becomes a reference to Vishal and any changes done on Person would be done to Vishal too.
// This is different behavior which mean everything is a reference in node.
var Person = Vishal;

Person.favFood = "Salad";

console.log(Vishal.favFood);

// Difference between == and ==== important for interviews

console.log(19=='19');// true since compares only values
console.log(19 === '19'); // false as it compares values as well as types and type are integer and string here.
