<%-- 
    Document   : landingpage.jsp
    Created on : 27-Apr-2023, 11:45:15 am
    Author     : IDEAPAD GAMING
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>FitNess - Home | By Code Info</title>
    <link rel="stylesheet" href="style.css">
    <!-- Font Awesome Iocns cdn link -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css"/>
    <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Philosopher:wght@700&family=Poppins:wght@300;400;500&display=swap"/>
    <style>
*{
  margin: 0;
  padding: 0;
  outline: none;
  border: none;
  text-decoration: none;
  box-sizing: border-box;
  transition: 0.2s linear;
  text-transform: capitalize;
  font-family: "Poppins", sans-serif;
}
body{
  background: #000;
}
.btn{
  margin-top: 2rem;
  width: 150px;
  padding: 12px;
  color: #fff;
  background: tomato;
  font-size: 16px;
  border-radius: 4px;
  cursor: pointer;
}
.btn:hover{
  background: rgba(212, 48, 48, 0.76);
  transition: 0.4s;
}
/* Header */
.header{
  position: fixed;
  top: 0;
  left: 0;
  right: 0;
  z-index: 1000;
  padding: 1.5rem 8%;
  display: flex;
  align-items: center;
  color: #fff;
  justify-content: space-between;
}
.header .logo{
  font-size: 22px;
  font-weight: bolder;
  color: #fff;
  padding-right: 10px;
  margin-right: 20rem;
}
.header .logo i{
  color: #fff;
  padding: 0.5rem;
}
.header .navbar a{
  font-size: 1.1rem;
  margin: 0 1rem;
  color: #fff;
}
.header .navbar a:hover{
  color: #baa6cf;
}
.header .btn{
  background: transparent;
  color: tomato;
  border: 1px solid tomato;
  font-size: 12px;
  padding: 8px;
}

/* Home Section */
.max-width{
  max-width: 1300px;
  padding: 0 80px;
  margin: auto;
}
section{
  padding: 50px 0 50px 0;
}
.home{
  display: flex;
}
.home .max-width{
  width: 100%;
  display: flex;
}
.home .home-content{
  width: 50%;
  padding: 2rem;
}
.home h3{
  color: #fff;
  margin-top: 6rem;
  font-size: 5rem;
  font-family: 'Philosopher', sans-serif;
}
.home p{
  color: rgb(194, 191, 191);
  margin-top: 1rem;
  font-size: 12px;
}
.home .home-image{
  width: 50%;
}
.home .home-image img{
  width: 100%;
  height: 100%;
}
    </style>
</head>
<body>
    <header class="header">
        <a href="#" class="logo">
            <i class="fas fa-dumbbell"></i>Gym Emporium
        </a>
        <nav class="navbar">
            <a href="#">Home</a>
            <a href="#">Services</a>
            <a href="#">Contact</a>
            <a href="#">Pricing</a>
            <a href="#">|</a>
            <a href="login.jsp">Login</a>
            <a href="registration.html" class="btn">Sign Up</a>
        </nav>
    </header>

    <section class="home">
        <div class="max-width">
            <div class="home-content">
                <h3>help for ideal <br> body fitness</h3>
                <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Dicta, numquam, sequi assumenda nam, vel nihil repudiandae omnis eveniet est excepturi atque molestias at dolores fugit!</p>
            </div>
            <div class="home-image">
                <img src="https://img.freepik.com/free-photo/young-fitness-man-studio_7502-5007.jpg" alt="">
            </div>
        </div>
    </section>
</body>
</html>

