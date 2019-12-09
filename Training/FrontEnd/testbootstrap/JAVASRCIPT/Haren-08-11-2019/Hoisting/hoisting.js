console.log("JS does all global varriable declaration to the top, hence we'll get undefined instead of error for value varriable");
console.log(value)
var value=10

console.log("===Functions")

console.log("JS does all local varriable declaration to the begining of fuction, hence we'll get undefined instead of error for num varriable inside function");
function check()
{
    console.log(num)
    var num=20
    console.log(num)
}

check()