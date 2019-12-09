// function first(){
//     setTimeout(function(){
//         console.log("First function executed")
//     }, 5000)
   
// }

// function second(){
//     console.log("Second function executed")
// }

// first()
// second()



console.log("Passing a function as an argument to another function is Callback Function, e.g. setTimeout function");

function first(callback1, callback2){
    setTimeout(function()
    {
        console.log("First function executed")
        callback1()
        callback2()
    }, 2000)
   
}

function second(){
    console.log("Second function executed")
}

function third(){
    console.log("Third function executed")
}

first(second, third)
