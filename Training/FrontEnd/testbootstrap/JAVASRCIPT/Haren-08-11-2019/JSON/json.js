const person= {
    name: "Harry",
    age:26,
    weight: 66,
    hobbies: ["Roaming", "Cooking", "Sleeping"]
}


const jSonObject= JSON.stringify(person)
console.log("Jason Object: ", jSonObject)

const orgObject= JSON.parse(jSonObject)
console.log(orgObject)

