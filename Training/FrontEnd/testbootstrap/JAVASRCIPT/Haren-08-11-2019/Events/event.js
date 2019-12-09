let p= document.createElement("p"); //Global so that only once it is created

function greet(message){
    let name="Harendra"
    alert(message + " " + name)
    alert(`${message} ${name}`)
    console.log(`2+2= ${2+2} "Hello" , 'Hello'`)
}

function changeFont(){
let element=document.getElementById("test")
element.style.fontSize="25px"
}


function orgFont(){
    let element=document.getElementById("test")
    element.style.fontSize="12px"
    }


function showData(){
        console.log('key pressed')
    }

function showElement(){
    //let p= document.createElement("p"); Make it global to create element only once
    p.textContent="P is created"
    document.body.appendChild(p)
}

let el= document.getElementById("tes")
el.onclick=function(){
    alert("Clicked Tes!!!")
}

//Another Way
let ele= document.getElementById("tess")
ele.addEventListener('click', function(){
    alert("Tess Clicked!!!!!!!")
})