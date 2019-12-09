console.log("===Named function====");
console.log(add(10,30));
function add(a1, a2)
{
    console.log(a1+a2);

}

console.log("===Anonymous function====");
var mult= (function (a1, a2)
{
    console.log(a1*a2);

})
var multi=mult(10,20);



console.log("===Self Invoked or IIFE function, we have to use semicolon here====");
(function(a1, a2)
{
    console.log(a1+a2);

})(1,10)


console.log("===Fat Arrow function====");
var i=5;
var getI= (i=> i*i);
console.log(getI);


var division= (val1, val2)=>{
    var div= val1/ val2
    console.log(div)
}
division(25,5)


var sum= (i,j)=> i+j
var values= sum(10,100)
console.log(values)