var piValue=Math.PI;
console.log(piValue);

console.log(Math.round(10.5));
console.log(Math.round(10.6));
console.log(Math.round(10.4));

console.log("Math.floor " + Math.floor(10.5));
console.log("Math.ceil " + Math.ceil(10.5));
console.log("Math.power " + Math.pow(2,3));
console.log("Math.sqrt " + Math.sqrt(16));
console.log("Math.random " + Math.random());
console.log("Math.random " + Math.ceil(100*Math.random()));
console.log("Math.min " + Math.min(10.5, 9, 11, 2.5));
console.log("Math.max " + Math.max(10.5, 9, 11, 2.5));
console.log("Math.absolute " + Math.abs(-16));


//Operators

console.log("=========Operators============");
var str= "10";
var num=10;

console.log("Use of Strict Equal to===");
if(str===num)
	{
	console.log("Equals");
	}
else
	{
	console.log("Not Equals");
	}	



console.log("Use of Strict not Equal to !==");
if(str!==num)
	{
	console.log("Not Equals");
	}
else
	{
	console.log("Equals");
	}	


console.log("Use of Ter Operator");
var age=22;
var voting= age>=18 ? "Eligble" : "Not Eligble"
console.log(voting);

