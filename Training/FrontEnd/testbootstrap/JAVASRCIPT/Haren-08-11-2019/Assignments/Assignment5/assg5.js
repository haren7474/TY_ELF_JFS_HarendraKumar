document.writeln("=====This is my Unordered List of Technologies Using Create Element=====")
var myUlist= document.createElement("ul")

var li1= document.createElement("li") 
li1.textContent="Java"

var li2= document.createElement("li")
li2.textContent="C++"

var li3= document.createElement("li")
li3.textContent="Python"

var li4= document.createElement("li")
li4.textContent="C#"

var li5= document.createElement("li")
li5.textContent="R"

myUlist.appendChild(li1)
myUlist.appendChild(li2)
myUlist.appendChild(li3)
myUlist.appendChild(li4)
myUlist.appendChild(li5)

document.body.appendChild(myUlist)

//document.writeln("=====This is my Unordered List of Technologies Using innerHTML=====")
var myUnList= `<ul>
    <li>Java</li>
    <li>C++</li>
    <li>R</li>
</ul>`

var divElement= document.getElementById("add")
divElement.innerHTML=myUnList


document.writeln("=====This is my ordered List of Technologies Using Create Element=====")
var myOlist= document.createElement("ol")

var li1= document.createElement("li") 
li1.textContent="Java"

var li2= document.createElement("li")
li2.textContent="C++"

var li3= document.createElement("li")
li3.textContent="Python"

var li4= document.createElement("li")
li4.textContent="C#"

var li5= document.createElement("li")
li5.textContent="R"

myOlist.appendChild(li1)
myOlist.appendChild(li2)
myOlist.appendChild(li3)
myOlist.appendChild(li4)
myOlist.appendChild(li5)

document.body.appendChild(myOlist)


//document.writeln("=====This is my Ordered List of Technologies Using innerHTML=====")
var myOrList= `<ol>
    <li>Java</li>
    <li>C++</li>
    <li>R</li>
</ol>`

var divElement= document.getElementById("olAdd")
divElement.innerHTML=myOrList


//document.writeln("=====This is my Student Table=====")

var myTable= `<table style="width:50%" border="1">
<tr>
  <th>Name</th>
  <th>Age</th>
  <th>Address</th>
  <th>DOB</th>
</tr>
<tr>
  <td>Harendra</td>
  <td>26</td>
  <td>Bangalore</td>
  <td>23 Sep</td>
</tr>
<tr>
  <td>Swati</td>
  <td>26</td>
  <td>Delhi</td>
  <td>4 June</td>
</tr>
</table>`

var divTab= document.getElementById("tableAdd")
divTab.innerHTML=myTable