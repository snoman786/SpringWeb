<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring MVC Form Handling .</title>
<style type="text/css">
.error {
	color: red;
}
</style>
</head>
<body>
	<h2>Student Information</h2>
	<form:form method="POST" action="register" commandName="student">
		<table>
			<tr>
				<td><form:label path="name">Name : </form:label></td>
				<td><form:input path="name" /></td>
				<td><form:errors path="name" cssClass="error"/></td>
			</tr>
			<tr>
				<td><form:label path="age">Age: </form:label></td>
				<td><form:input path="age" /></td>
				<td><form:errors path="age" cssClass="error"/></td>
			</tr>
			<tr>
				<td><form:label path="emailId">Email Id :</form:label></td>
				<td><form:input path="emailId" /></td>
				<td><form:errors path="emailId" cssClass="error"/></td>
			</tr>
			<tr>
				<td><form:label path="profession">Profession: </form:label></td>
				<td><form:select path="profession" items="${professionList}" /></td>
			</tr>
			
			<tr>
				<td><form:label path="phoneNumber">Phone Number : </form:label></td>
				<td><form:input path="phoneNumber" /></td>
				<td><form:errors path="phoneNumber" cssClass="error"/></td>
			</tr>
			
			<tr>
				<td><form:label path="birthday">birthday(MM/dd/yyyy) : </form:label></td>
				<td><form:input path="birthday" placeholder="MM/dd/yyyy"/></td>
				<td><form:errors path="birthday" cssClass="error"/></td>
			</tr>

			<tr>
				<td colspan="2"><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form:form>
</body>

</html>