window.addEventListener('DOMContentLoaded', () => {
    // console.log("hiiii");
   let arr = [{ name: "prajwal", contact: "987456321", date: "12-06-2022", symptoms: "fever", specialist: "xyz" }];


    let psubmit = document.querySelector("#sub");

    psubmit.addEventListener('click', () => {
        let pname = document.querySelector("#nam").value;
        let pcontact = document.querySelector("#con").value;
        let pdate = document.querySelector("#dat").value;
        let psymptoms = document.querySelector("#sym").value;
        let pspecialist = document.querySelector("#spe").value;
        let obj = { name: pname, contact: pcontact, date: pdate, symptoms: psymptoms, specialist: pspecialist };
        arr.push(obj);

        console.log(arr);
    });
	
	
	
});