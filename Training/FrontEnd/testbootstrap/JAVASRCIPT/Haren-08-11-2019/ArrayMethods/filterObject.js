var items=[
    {
        name: "lipstick",
        id:1,
        price:499
    },

    {
        name: "liner",
        id:2,
        price:699
    },

    {
        name: "watch",
        id:3,
        price:7500
    },

    {
        name: "trimmer",
        id:4,
        price:1200
   }
]

var item= items.filter(pri=> pri.price>1000)
console.log(items)
console.log(item)

console.log("Adding 50 in price without modifying originol array");
var item1= items.map(p=>
    {
    return {
        name: p.name,
        price: p.price+50,
        id:  p.id   
        } 
    }
    )
console.log(items)
console.log(item1)

console.log("Adding 70 in price by modifying originol array");
var item2= items.map(p=>
    {
        p.price= p.price+70;
        return p;
    }
    )
console.log(items)
console.log(item2)

console.log("Checking if element is present or not");

var chocolates=["dairyMilk", "Ferrero","Munch","20-20","Perk"]
var hasFerrero= chocolates.includes("Ferrero");
console.log(hasFerrero)

console.log("Checking if given object is an array");
var i=5;
var isArray= Array.isArray(chocolates)
console.log("array status "+ isArray);




