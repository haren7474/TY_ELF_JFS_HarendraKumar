function outer(){
    let a=10;
    function inner() {
        console.log("a is: " + 41)
    }
    return inner();
}

let innerFunc= outer();
innerFunc();