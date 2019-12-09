var a;
var b=10;
var a=20;
console.log("a= ",a)
var a=30;
console.log("a= ",a)

if(10<20)
{
    var c=40;
    console.log("c inside if block: ",c)
}

console.log("c outside if block: ",c)


for(var i=0; i<4; i++)
{
    var d=50;
    console.log("d inside for loop: ",d)
}

console.log("d outside for loop: ",d)


//let Keyword
let p;
let q=20;
//let p=40; We can't re-declare with let
p=40;
console.log("p: ",p)

if(10<20)
{
    let r=40;
    console.log("r inside if block: ",r)
}

//console.log("r outside if block: ",r)// Let keyword maintains the block scope, it can't be used outside


//const Keyword

//const x; //Only Declaration is not possible

const x= [10,20,30]
//x={}; //Can not re-assign
x.push(40) //Possible
console.log(x)




//
var data= [10,20,,,45];
for(let i=0; i<data.length;i++)
{
    console.log(data[i])
}