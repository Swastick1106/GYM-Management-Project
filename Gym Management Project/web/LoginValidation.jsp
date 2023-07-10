<%-- 
    Document   : LoginValidation
    Created on : 27-Apr-2023, 6:02:14 pm
    Author     : IDEAPAD GAMING
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Validation Login</title>
    </head>
    <body>
         <%
        // Retrieve the form data
        String fullName = request.getParameter("fullName");
        String fatherName = request.getParameter("fatherName");
        String motherName = request.getParameter("motherName");
        // Add remaining form fields based on your requirements

        // Database connection details
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JavaLabProj?characterEncoding=latin1", "root", "Ramos@9248");

            // Insert the data into the database
            String insertQuery = "INSERT INTO personal2(full_name, father_name, mother_name) VALUES (?, ?, ?)";
            pstmt = con.prepareStatement(insertQuery);
            pstmt.setString(1, fullName);
            pstmt.setString(2, fatherName);
            pstmt.setString(3, motherName);
            // Set values for remaining fields

            pstmt.executeUpdate();
        } catch (Exception e) {
           
                out.println(e);
            }  
    
             
        %>
    </body>
    </body>
</html>
