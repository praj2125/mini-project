<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>
    Login Page 
  </title>
  <link rel="shortcut icon" href="Images/logo/titlogo.jpg" />
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet"
    integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous" />
   
  <style>
 body{
      background-image:url("https://hometownauthors.com/wp-content/uploads/2020/01/83551573_m-1.jpg");
       height: 100vh;
    background-size: cover;
     background-position: center;
 position: absolute;
    content: '';
    top: 0;
    left: 0;
    height: 100%;
    width: 100%;
           
    }

*{
  font-family: 'Poppins', sans-serif;
}

#sub:hover{
    background: rgb(0, 0, 0);
    color: white;
    
  }
  #sub{
    background: #c9a65a;
    color: white;  
  }

  #msg{
    color:rgb(68, 68, 68);
  }

  h1{
    
    padding-left: 33%;
    color:rgb(68, 68, 68);
  }
  </style>
  	<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
	<script type="text/javascript">
function login(){
	
	if(document.userform.email.value==''){
		alert('Please Enter email');
		document.userform.email.focus();
		return false;
	}
	
	if(!validateEmail(document.userform.email.value)){
		alert('Please Enter Valid Email');
		document.userform.email.focus();
		return false;
	}
	
	if(document.userform.password.value==''){
		alert('Please Enter Password');
		document.userform.password.focus();
		return false;
	}
	
	document.userform.action="<c:url value = "/Login.project"/>";
	document.userform.method="post";
	document.userform.submit();
}

function validateEmail(email) 
{
    var re = /\S+@\S+\.\S+/;
    return re.test(email);
}

</script>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
   <form action="Login.project" >
  <div
  class="row justify-content-center align-items-center"
  style="height: 100vh;">
   <c:if test = "${not empty userform.errorMsg}">
         				<p style="color: red;"> <c:out value = "${userform.errorMsg}"/><p>
      				</c:if>
  <div class="col-4 p-5" style="background:none">
    <h1 style="color:white" >Login</h1>
    <form action="Login.project"  name="userform"  method="post">
    <input
      type="email"
      id="u"
      class="form-control form-control-lg mb-3"
      placeholder=" Email" name="email" required/>
    <input  type="password"
					class="form-control form-control-lg mb-3" id="password" placeholder="Password"
					name="password" required />
    <div>
    
    </div>
     <div class="d-grid gap-2" >
      <button type="submit"   class="btn btn-dark btn-lg btn-block"  onclick="login()"> Login </button>
    </div>
    <br>
    <span id="msg"></span>
    <h6 style="color:white">Don't have an account?</h6>
    <a href="register.jsp" class="text-secondary"> SignUp</a>
      </form>
  </div>

</div>
   </form>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>