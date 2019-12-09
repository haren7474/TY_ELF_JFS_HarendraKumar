var brands=["Audi","RR","Merc","MF1","Ferrari"]

brands.forEach(function(brand, index){
console.log(index+ "   " + brand);
});

console.log("===For of===");
for (brand of brands) 
{
   console.log(brand+" ")
}

console.log("===For in===");
for (brand in brands) 
{
   console.log(brand+"  "+brands[brand])
}





console.log("===push and pop in array at last index===");

var hobbies=["dance","Write","Eat","Sleep","Repeat"]

console.log(hobbies)

var len=hobbies.push("singing")
console.log("New Array length: "+ len);

console.log(hobbies)
var removed= hobbies.pop();
console.log("removed element: "+ removed);
console.log(hobbies)



console.log("===pushing and poping at first index=====");
console.log("New Array length: "+ hobbies.unshift("Movie"));

console.log(hobbies)
var removedFirst= hobbies.shift();
console.log("removed element: "+ removedFirst);
console.log(hobbies)







console.log("===Finding index of an element in the array===")
var ind= hobbies.indexOf("Eat")
if(ind>-1)
{
    console.log("Present")
}
else
{
    console.log("Not Present")
}

console.log("===Finding index of an element in the array while starting from given index===")
var ind= hobbies.indexOf("Repeat",3)
if(ind>-1)
{
    console.log("Present")
}
else
{
    console.log("Not Present")
}



console.log("===Converting array to String=====")
var str1= hobbies.join()
console.log("Default seperator ",str1)

var str2= hobbies.join('-')
console.log("Given seperator ",str2)
var str= hobbies.join()
console.log("Array still remains same")
console.log(hobbies)





console.log("===adding and removing @given index=====")

//hobbies.splice(startIndex, deleteCount, ElementsTobeAdded)
//splice method modifies your array

//hobbiles.splice(1), this will delete all elments of array 1st index onwards and returns the array of deleted elements
//hobbiles.splice(3,2), this will delete 2 elments of array 3rd index onwards and returns the array of deleted elements
//hobbiles.splice(3,2, "abc", "def", "ghe"), this will delete 2 elments of array 3rd index onwards and returns the array of deleted elements and add given elements strating from 3rd index

console.log(hobbies)
hobbies.splice(2,0,"test", "Check")
console.log(hobbies)


//Slice method does not modify your array, it gives new array
var check=["a","b","c","d","e"]
console.log(check)
console.log("Modified array ",check.slice(1))
console.log(check)

