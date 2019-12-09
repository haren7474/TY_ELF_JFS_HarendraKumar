console.log(window)
console.log(this)

console.log(window===this)

var a=10;
console.log("a: ",a)
console.log("this.a: ",this.a)
console.log("window.a: ",window.a)


function add(){
    console.log("add method")
}
add()

//window.alert("This website is riskful")
//window.confirm("are you 18+")

var age= window.prompt("enter your age",10)
console.log("age ",age)
