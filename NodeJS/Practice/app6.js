var events = require('events');

var eventEmitter = new events.EventEmitter();

function ringBell(){
	console.log("Ring ring ring");
}
function response(){
	console.log("Welcome");
}
eventEmitter.on("doorOpen",ringBell);
eventEmitter.on("Welcome",response);
eventEmitter.emit("doorOpen");
eventEmitter.emit("Welcome");
