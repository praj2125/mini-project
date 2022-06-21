window.addEventListener('DOMContentLoaded', () => {
let feedBack=[{name:"demo", email:"demo@gmail.com",comment:"good"}];
	let fsubmit=document.querySelector("#subf");
	 fsubmit.addEventListener('click', () => {
		let fname = document.querySelector("#fname").value;
        let femail = document.querySelector("#lname").value;
        let fcomment = document.querySelector("#subject").value;
		let obj = { name: fname, email: femail, comment: fcomment};
        feedBack.push(obj);
		alert("FeedBack submit");
        console.log(feedBack);
		//setTimeout(feedBack,5000);
		window.open("Doct_Index.html");
	 });
	 
});