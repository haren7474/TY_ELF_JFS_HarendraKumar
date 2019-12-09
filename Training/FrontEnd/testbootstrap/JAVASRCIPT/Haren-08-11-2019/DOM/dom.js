// var id= document.getElementById("demo")
// console.log(id)

// console.log("content of p: ",id.textContent)

// id.textContent= "Good Evening"
// var modifiedText= id.textContent
// console.log("ModifiedText:", modifiedText)


var pElement= document.querySelector("#demo");
pElement.textContent="I am Harendra Kumar Joshi"

var elements= document.getElementsByClassName("test")
console.log("Elements ", elements)

elements[0].style.color ="red"
pElement.style.fontSize = "40px"

pElement.style.color="orange"


var qElements= document.querySelectorAll(".test")
qElements[1].style.color="blue"
qElements[1].style.fontSize="80px"

console.log("Getting details")
console.log(document.getElementsByTagName("p"))
console.log(document.getElementsByName("head"))


var bElement= document.createElement("button")
bElement.textContent="Button Created"  
document.body.appendChild(bElement) 

var pElement= document.createElement("p")
pElement.textContent="This is a paragraph"

document.body.appendChild(pElement)

document.write("Hello")

var ele= document.getElementById("add")
//ele.className="xyz"
ele.classList="xyz abc"



