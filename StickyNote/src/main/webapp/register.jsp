<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Form</title>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
		<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<style>
 @import url('https://fonts.googleapis.com/css?family=Montserrat:400,500,600,700|Poppins:400,500&display=swap'); 

* {
    margin: 0;
    padding: 0; 
    box-sizing: border-box;
    user-select: none;
}

*{
  font-family: 'Poppins', sans-serif;
}

.bg-img {
  /*  background-image: url("https://images.unsplash.com/photo-1591462391971-9ffc57b382b9?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTR8fHN0aWNreSUyMG5vdGV8ZW58MHx8MHx8&w=1000&q=80"); */
    background-image: url("https://c0.wallpaperflare.com/preview/51/503/587/laptop-computer-business-table.jpg");
    height: 100vh;
    background-size: cover;
     background-position: center; 
}

.bg-img:after {
    position: absolute;
    content: '';
    top: 0;
    left: 0;
    height: 100%;
    width: 100%;
}

.content {
    position: absolute;
    top: 55%;
    left: 50%;
    z-index: 999;
    text-align: center;
    padding: 40px 32px;
    width: 450px;
    transform: translate(-50%, -50%);
    background: rgba(255, 255, 255, 0.04);
    box-shadow: -1px 4px 28px 0px rgb(124, 124, 124);
}

.content header {
    color: white;
    font-size: 33px;
    font-weight: 600;
    margin: 0 0 35px 0;
    font-family: sans-serif;
}

.field {
    margin-top: 20px;
    position: relative;
    height: 45px;
    width: 100%;
    display: flex;
    background: rgba(255, 255, 255, 0.94);
    font-family: 'Poppins', sans-serif;
}

.field span {
    color: #222;
    width: 40px;
    line-height: 45px;
}

.field input {
    height: 100%;
    width: 100%;
    background: transparent;
    border: none;
    outline: none;
    color: #222;
    font-size: 16px;
    font-family: 'Poppins', sans-serif;
}

.space {
    margin-top: 16px;
}

.show {
    position: absolute;
    right: 13px;
    font-size: 13px;
    font-weight: 700;
    color: #222;
    display: none;
    cursor: pointer;
    font-family: 'Montserrat', sans-serif;
}

.pass-key:valid~.show {
    display: block;
}

.pass {
    text-align: left;
    margin: 10px 0;
}

.pass a {
    color: white;
    text-decoration: none;
    font-family: 'Poppins', sans-serif;
}

.pass:hover a {
    text-decoration: underline;
}


.field input[type="submit"] {
    background: #3498db;
    border: 1px solid #2691d9;
    color: white;
    font-size: 18px;
    letter-spacing: 1px;
    font-weight: 600;
    cursor: pointer;
    font-family: 'Montserrat', sans-serif;
}

.field input[type="submit"]:hover {
    background: #2691d9;
}

.login {
    color: white;
    margin: 20px 0;
    font-family: 'Poppins', sans-serif;
}


.signup {
    margin-top: 20px;
    font-size: 15px;
    color: white;
    font-family: 'Poppins', sans-serif;
}
.an {
   font-size: 15px;
    color: white;
    font-family: 'Poppins', sans-serif;
}

.signup a {
    color: #3498db;
    text-decoration: none;
}

.signup a:hover {
    text-decoration: underline;
}
</style>
</head>
</head>
<body>

   <jsp:include page="header.jsp"></jsp:include>

    <div class="bg-img">
        <div class="content"  class="alert alert-success center" role="alert">
            <header style="color:rgb(56, 56, 56)">Sign Up</header>
              <form action="register.project"  method="post" >
                <div class="field">
                    <span class="fa "></span>
                    <input id="Firstname" type="text" required placeholder="First Name" name="fname" required>
                </div>
                
                 <div class="field">
                    <span class="fa "></span>
                    <input id="Lastname" type="text" required placeholder="Last Name" name="lname" required>
                </div>
                
                <div class="field">
                    <span class="fa "></span>
                    <input id="email" type="text" required placeholder="Email" name="email" required>
                </div>
             
                <div class="field space">
                    <span class="fa "></span>
                    <input id="passi" type="password" class="pass-key" required placeholder="Password" name="password" required minlength="8">
                    <span class="show">SHOW</span>
                </div>
                

                <div class="field">
                    <button type="submit" onclick="signup()" class="but"
                        style="width: 100%; font-weight:bolder; background-color:rgb(82, 82, 83) ;border:none;color: azure;font-size: medium;">Sign up</button>
                        
                </div>
            </form>

            <div class="an">
                Already have an account?
                <a href="Login.jsp" >Login Now</a>
            </div>
        </div>
    </div>
 <jsp:include page="footer.jsp"></jsp:include>
</body>

</html>