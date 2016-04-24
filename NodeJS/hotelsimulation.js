console.log("Hotel");


function placeAnorder(orderNumber){

	console.log("Order Number is " + orderNumber);

	cookAndDeliverFood(function (){
		console.log("Delivering order Number " + orderNumber);

	});
}

// Simulating a 5 second operation

function cookAndDeliverFood(callback){

	setTimeout(callback,5000);
	
}

//Simulate user web request

placeAnorder(1);
placeAnorder(2);
placeAnorder(3);
placeAnorder(4);
placeAnorder(5);
placeAnorder(6);
