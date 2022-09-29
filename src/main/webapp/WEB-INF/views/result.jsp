<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Result Here </title>
</head>
<body>
<h2>Submitted Student Information</h2>
      <table>
         <tr>
            <td>Name:</td>
            <td>${alias.name}</td>
         </tr>
         <tr>
            <td>Age:</td>
            <td>${alias.age}</td>
         </tr>
         <tr>
            <td>Email ID:</td>
            <td>${alias.emailId}</td>
         </tr>
         <tr>
            <td>Profession:</td>
            <td>${alias.profession}</td>
         </tr>
         <tr>
            <td>Phone :</td>
            <td>${alias.phoneNumber}</td>
         </tr>
          <tr>
            <td>B'day :</td>
            <td>${alias.birthday}</td>
         </tr>
      </table>  
</body>
</html>