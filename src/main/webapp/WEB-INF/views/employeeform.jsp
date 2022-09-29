<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<style type="text/css">
.error {
	color: red;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Page</title>
</head>
<body>
	<h2>Fill Employee Information Here</h2>
	<form:form method="POST" action="employee" commandName="employee">

		<table>
			<tr>
				<td><form:label path="id">Id : </form:label></td>
				<td><form:input path="id" /></td>
				<td><form:errors path="id" cssClass="error" /></td>
			</tr>
			<tr>
				<td><form:label path="name">Name : </form:label></td>
				<td><form:input path="name" /></td>
				<td><form:errors path="name" cssClass="error" /></td>
			</tr>
			<tr>
				<td><form:label path="role">Employee Role : </form:label></td>
				<td><form:select path="role">
						<form:option value="" label="Select Role" />
						<form:option value="ceo" label="CEO" />
						<form:option value="developer" label="Developer" />
						<form:option value="manager" label="Manager" />
					</form:select></td>
				<td><form:errors path="role" cssClass="error" /></td>
			</tr>
			
			<tr>
				<td><form:label path="address.hNo">House No : </form:label></td>
				<td><form:input path="address.hNo" /></td>
			</tr>
			<tr>
				<td><form:label path="address.street">Street Name : </form:label></td>
				<td><form:input path="address.street" /></td>
			</tr>

			<tr>
				<td colspan="2"><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>