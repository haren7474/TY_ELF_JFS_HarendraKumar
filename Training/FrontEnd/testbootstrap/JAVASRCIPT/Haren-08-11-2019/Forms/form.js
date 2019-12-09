function validateForm(){
   let loginForm=  document.forms['loginForm']
    console.log(loginForm);

let userNameEle= document.forms["loginForm"]['username']
let passwordEle= document.forms["loginForm"]['password']


if(userNameEle.value.trim().length > 5){
    let pEle= document.getElementById("pele")
    pEle.style.display="none"
   }
else{
    let pEle= document.getElementById("pele")
    pEle.style.display="block"

}

if(passwordEle.value.trim().length>5){
    let pElem= document.getElementById("passwordMsg")
    pElem.style.display="none"
   
}
else{
    let pElem= document.getElementById("passwordMsg")
    pElem.style.display="block"

}
  
if(userNameEle.value.trim().length>5 && passwordEle.value.trim().length>5)
{
    alert("Logged in")
    return true
}
else{
    return false
} 
}
