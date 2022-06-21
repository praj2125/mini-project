window.addEventListener('DOMContentLoaded', () => {
    console.log("check this always");
let x=["Prajwal@gmail.com","xyz@gmail.com","zzz@gmail.com"];
const num = document.querySelector('#mail');
    
    num.addEventListener('blur', () => {

       let ref=document.querySelector("#mail").value;
       let result = sign(ref);
        console.log(result);

if(result){

document.querySelector("#msg").innerText="Email Already Register";

}
else{
document.querySelector("#msg").innerText="";


}




});

const ref = document.querySelector('#ps2');
ref.addEventListener('blur',()=>{
  
    let pw1=document.querySelector("#ps1").value;
    let pw2=document.querySelector("#ps2").value;
    console.log(pw1);
    console.log(pw2);

    if(pw1 != pw2)  
    {   
    document.querySelector("#msg1").innerText="Passwords did not match"; 
    } else {  
    document.querySelector("#msg1").innerText="Passwords match";
    document.querySelector("#btn").disabled=false;

    }  


 });

 

function sign(y){
let output=false;
for(let i=0;i<x.length;i++){
    if(x[i] ==y){
        output=true;
        return output;
    }
}return output;

}

// function ValidateEmail(y)
// {
// var mail = "/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/";
// let op=false;
// if(y.value== y.match(mail))
// {
//     op=true;
// return op;
// }
// else
// {
// return op;
// }
// }


});