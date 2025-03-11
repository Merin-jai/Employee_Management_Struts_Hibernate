<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Add Employee</h2>
    <s:form action="addEmployee" method="post">
        Name: <s:textfield name="employee.name" required="true"/><br/>
        Email: <s:textfield name="employee.email" required="true"/><br/>
        Salary: <s:textfield name="employee.salary" required="true"/><br/>
        Designation: <s:textfield name="employee.designation" required="true"/><br/>
        <s:submit value="Add Employee"/>
    </s:form>
</body>
</html>