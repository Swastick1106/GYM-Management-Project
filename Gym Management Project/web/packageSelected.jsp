<%-- 
    Document   : packageSelected
    Created on : 27-Apr-2023, 9:59:51 pm
    Author     : IDEAPAD GAMING
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gym Emporium</title>
    </head>
    <body>
        <% 
            try{  
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JavaLabProj?characterEncoding=latin1","root","Ramos@9248"); 
  
                PreparedStatement stmt=con.prepareStatement("insert into Package values(?,?,?)");  
                
                stmt.setString(1,request.getParameter("username"));
                stmt.setString(2,request.getParameter("email"));
                stmt.setString(3,request.getParameter("package"));
  
                int i=stmt.executeUpdate();  
                response.sendRedirect("thankyoupage.jsp");
  
                con.close();  
  
            }catch(Exception e){ 
                out.println(e);
            }  
    
             
        %>
    </body>
</html>
