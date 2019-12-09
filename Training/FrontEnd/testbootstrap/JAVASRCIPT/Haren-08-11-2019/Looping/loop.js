var hobbies=["Sleeping", "Writing" , "Cycling", "Travelling"]

console.log("======For Loop=======")
for(var i=0; i<=hobbies.length;i++)
{
    console.log(hobbies[i] +" ")
}

console.log("======For of Loop, it  gives value=======")
for(var hobby of hobbies)
{
    console.log(hobby + " ")
}

console.log("======For in Loop, it  gives index=======")
for(var index in hobbies)
{
    console.log(index + " ")
}

console.log("======For in Loop, it  gives index, getting values=======")
for(var index in hobbies)
{
    console.log(hobbies[index] + " ")
}

console.log("======Employee object with array and for loop=======")
var employee = {
    name: "Harendra",
    age: 27,
    phone: 9916771904,
    hobbies: ["cooking", "travelling", "adventure"]
    }

var name= employee.name;
console.log(name);

var age= employee["age"];
console.log(age);

for(var emp of hobbies)
{
    console.log(emp + " ")
}
