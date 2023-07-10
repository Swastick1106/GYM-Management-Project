<%-- 
    Document   : LoginValidation2
    Created on : 27-Apr-2023, 6:31:55 pm
    Author     : IDEAPAD GAMING
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
           try{  
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JavaLabProj?characterEncoding=latin1","root","Ramos@9248"); 
  
                PreparedStatement stmt=con.prepareStatement("SELECT * FROM Gym where email=? AND password=? ");  
                stmt.setString(1,request.getParameter("email"));
                stmt.setString(2,request.getParameter("password"));
                ResultSet rs = stmt.executeQuery();
                
                if(rs.next()){                 
                response.sendRedirect("gymPackages.jsp");
                }
                else{                
                response.sendRedirect("login.jsp");
            }
             stmt.close();
             rs.close();
             con.close();  
  
            }catch(Exception e){ 
                out.println(e);
            }  
    
      %>       
    </body>
</html>
