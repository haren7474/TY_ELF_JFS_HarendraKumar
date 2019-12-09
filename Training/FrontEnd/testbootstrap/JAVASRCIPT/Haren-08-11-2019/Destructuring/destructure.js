let person= {
    name: "Haren",
    age: 20,
    hobbies: ["singing", "dancing"]

}
let {name, hobbies} = person;
console.log("Hobbies ", hobbies)

console.log("===============")
function displayName(personObject){
console.log(personObject.name)
}
displayName(person) 

function display({name, hobbies}){
    console.log(name," ", hobbies)
    }
    display(person)




console.log("======Array Destructuring=========")

let hobbies1=["singing", "dancing","sports"]
let[hobby0, hobby1]= hobbies1;
console.log(hobby0," ", hobby1)


console.log("======joining 2 objects========")

let items= [
    {
        id: 1,
        name: "bag",
        price: 400
    },
    {
        id: 2,
        name: "watch",
        price: 500
    }
]

console.log("Items: ", items)
items[0].id=5;
console.log("After Modification: ", items)


var item= {...items[0]}
console.log("item 0: ", item)

item.id=20;

console.log("item 0: ", item)
console.log("Items: ", items);

let address= {
    city: "Bangalore",
    pincode: 560045
}


let personAddress= {...person, ...address}
console.log(personAddress)



console.log("======joining arrays========")

var arr= [10,20,30,40,50]
var arr1= [60,70,80]
var arrays=[...arr, ...arr1]
console.log("Joined Array: ", arrays)



console.log("======Passing and accepting multiple arguments========")
function sum(...args){
    let value=0;
    for(let i=0; i<args.length;i++) {
        value+= args[i]
    }
    console.log("Sum is: ",value)
}

sum("Hello", 10,20,30);