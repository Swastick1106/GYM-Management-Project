<%-- 
    Document   : gymPackages
    Created on : 27-Apr-2023, 6:52:59 pm
    Author     : IDEAPAD GAMING
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
        <head>
        <title>Emporium Packages</title>
        <style>
            
            body{
                background-image: url("https://media.istockphoto.com/id/953047628/photo/gym-background-with-equipment.jpg?s=612x612&w=0&k=20&c=fPGr6b3T0Lh6LNPqdtTNMdyGEt5ocqM1qtI1GfdsWF0=");
                background-size: cover;
                background-repeat: none;
                background-attachment: fixed;
            }
            .mainDiv{
                background-color: white;
                border: 2px solid black;
                border-radius: 10px 10px 10px 10px;
                margin: 10%;
                height: 2000px;
            }
            .headingDiv{

                background-image: url("https://t4.ftcdn.net/jpg/01/13/65/71/360_F_113657105_Bktota7BzQ5cEUcZb4l0D4qSD2Sw08P2.jpg");
                background-size: cover ;
                width: 97.5%;
                height: 15%;
                margin-left: 15px;

                margin-top: 15px;
            }
            #headingMessage{
                position: absolute;
                top: 270px;
                left: 245px;
                font-family: 'Poppins medium';
                font-size: 55px;
                color: white;
            }
            hr{

                position: absolute;
                margin-top: 16%;
                margin-left: 5%;
                border: 2px solid rgb(255, 255, 255);
                box-shadow: 1px 1px 1px 1px white;
                width: 47%;
            }
            td{
                padding: 5px;

            }
            table{
                margin-top: 3%;
                width: 85%;
            }
            .one{
                font-family: 'Times New Roman', Times, serif; 
            }
            .two{
                font-family: 'Times New Roman', Times, serif; ;
                text-align: center;
                display: block;
                width: 508px;
                padding: 1px;
                font-size: 25px;
                border-radius: 8px;
            }
            .button{
                display: block;
                width: 30%;
                 margin: 22px auto;
            }
            
        </style>
    </head>
    <body>
        <div class="mainDiv">
            <div class="headingDiv">
                <h1 id="headingMessage">Welcome to The Best Gym Of Mysore</h1>
                <i class="fa-duotone fa-cars fa-bounce"></i>
                <hr>
            </div>
            <<h3 align="center" style="font-family: 'Poppins Light'; font-size: 20px">Check out our various services and book now</h3>
            <table border="1" align="center" style="font-family: 'Poppins Light'; padding: 2px; border: 2px solid black;">
                <tr style=" background-color:  rgba(0, 6, 86, 0.885);color:white;" id="row">
                    <th>Package Name</th>
                    <th>Type</th>
                    <th>Duration</th>
                    <th>Fees(Monthly)</th>                
                </tr>
                <tr>
                   
                        <td>NEWBIE</td>
                        <td>Beginners</td>
                        <td>1 Months</td>
                        <td>Rs 500</td>    
                </tr>
                   <tr>
                   
                        <td>NOVICE</td>
                        <td>Beginners</td>
                        <td>3 Months</td>
                        <td>Rs 700</td>    
                </tr>
                    <tr>
                   
                        <td>BEGINNER</td>
                        <td>Beginners</td>
                        <td>6 Months</td>
                        <td>Rs 900</td>    
                </tr>
                    <tr>
                   
                        <td>ADVANCED BEGINNER</td>
                        <td>Beginners</td>
                        <td>8 Months</td>
                        <td>Rs 1000</td>    
                </tr>
                <tr>
                   
                        <td>INTERMEDIATE</td>
                        <td>ADVANCED</td>
                        <td>12 Months</td>
                        <td>Rs 1200</td>    
                </tr>
                <tr>
                   
                        <td>ADVANCED</td>
                        <td>ADVANCED</td>
                        <td>18 Months</td>
                        <td>Rs 1500</td>    
                </tr>
                <tr>
                   
                        <td>PRO</td>
                        <td>ADVANCED</td>
                        <td>24 Months</td>
                        <td>Rs 1800</td>    
                </tr>
                <!--<tr>
                   
                        <td>The Newbie</td>
                        <td>Beginners</td>
                        <td>6 Months</td>
                        <td>Rs 5000</td>    
                </tr>
                <tr>
                   
                        <td>The Newbie</td>
                        <td>Beginners</td>
                        <td>6 Months</td>
                        <td>Rs 5000</td>    
                </tr>
                <tr>
                   
                        <td>The Newbie</td>
                        <td>Beginners</td>
                        <td>6 Months</td>
                        <td>Rs 5000</td>    
                </tr>
                <tr>
                   
                        <td>The Newbie</td>
                        <td>Beginners</td>
                        <td>6 Months</td>
                        <td>Rs 5000</td>    
                </tr>
                <tr>
                   
                        <td>The Newbie</td>
                        <td>Beginners</td>
                        <td>6 Months</td>
                        <td>Rs 5000</td>    
                </tr> -->
                </tr>
            </table> <br><br>
            <center>
      <form action="packageSelected.jsp">
      <div>
        <h1 class="one">Register</h1>
        <p class="two">Kindly fill in this form to register & join the gym</p>
        <p class="two">You can pay the fees in gym</p>
        <label for="username" class="two"><b>Username</b></label>
        <input type="text" placeholder="Enter Your Name"  name="username" class="two"required /><br><br>
        
        <label for="email" class="two"><b>Email</b></label>
        <input type="text"placeholder="Enter Email"name="email" class="two"required/> <br><br>
        
        <label for="pwd" class="two"><b>Package Name</b></label>
        <input  type="text" placeholder="Enter Package Name" name="package" class="two"required /> <br>

        <button type="submit" class="button">Register</button>
      </div>
    </form>
                </center>
        </div>
    </body>
</html>
