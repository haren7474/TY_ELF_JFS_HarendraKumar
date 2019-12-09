var numbers=[100, 200, 300, 400, 500]

var newArray= numbers.filter(function(num, index){
if(num>250)
return true;
else 
return false;
});

console.log(numbers);
console.log(newArray);

//Here number>350 is a boolean so arrow funtion will return boolean here, which is expected by the filter function.
var newArray2= numbers.filter(number=> number>350);
console.log(numbers);
console.log(newArray2);



//Adding 50 in all the numbers of array, for this we use Map method.
//Here val+50 is a value so arrow funtion will return value here, which is expected by the map function.
var newArray3= numbers.map(val=>val+50)
console.log(newArray3);

var newArray4= numbers.map(function(num, index){
    var val= num+30;
    return val;
    });
console.log(newArray4);
