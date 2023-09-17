<%-- 
    Document   : login
    Created on : 27-Apr-2023, 11:24:31 am
    Author     : IDEAPAD GAMING
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Cool Login form | By Code Info</title>
  <link rel="stylesheet" href="style.css">
   <!-- Font Awesome Cdn Link -->
   <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"/>
   <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;600&display=swap"/>
   <style>
*{
    margin: 0;
    padding: 0;
    box-sizing: border-box;
    font-family: "Poppins", sans-serif;
}
body{
    display: flex;
    justify-content: center;
    align-items: center;
    min-height: 100vh;
    background: tomato;
}
.container{
    width: 100%;
    display: flex;
    max-width: 850px;
    background: #fff;
    border-radius: 15px;
    box-shadow: 0 10px 15px rgba(0, 0, 0, 0.1);
}
.login{
    width: 400px;
}
form{
    width: 250px;
    margin: 60px auto;
}
h1{
    margin: 20px;
    text-align: center;
    font-weight: bolder;
    text-transform: uppercase;
}

p{
    text-align: center;
    margin: 10px;
}
hr{
    border-top: 2px solid tomato;
}

.pic img{
    width: 450px;
    height: 100%;
    border-top-right-radius: 15px;
    border-bottom-right-radius: 15px;
}

form label{
    display: block;
    font-size: 16px;
    font-weight: 600;
    padding: 5px;
}
input{
    width: 100%;
    margin: 2px;
    border: none;
    outline: none;
    padding: 8px;
    border-radius: 5px;
    border: 1px solid gray;
}
button{
    border: none;
    outline: none;
    padding: 8px;
    width: 252px;
    color: #fff;
    font-size: 16px;
    cursor: pointer;
    margin-top: 20px;
    border-radius: 5px;
    background: tomato;
}
button:hover{
    background: rgba(214, 86, 64, 1);
}
p{
    margin: 20px;
}
a{
    color: black;
    text-decoration: none;
}

   </style>
</head>
<body>
    <div class="container">
        <div class="login">
            <form action="LoginValidation2.jsp">
                <h1>Login</h1>
                <hr>
                <p>Explore the World of Fitness!</p>
                <label>Email</label>
                <input type="text" placeholder="abc@exampl.com" name="email">
                <label>Password</label>
                <input type="password" placeholder="enter your password!" name="password">
                <button>Submit</button>
                <p>
                    <a href="#"></a>
                </p>
            <closeform></closeform></form>
        </div>
        <div class="pic">
            <img src="https://wallpapercave.com/wp/wp2957853.jpg">
        </div>
    </div>

</body>
</html>
