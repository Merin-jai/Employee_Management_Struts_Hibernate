<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h1>Add Employee</h1>
    <form action="<s:url action='addEmployee'/>" method="post">
        <label for="name">Name:</label>
        <input type="text" name="employee.name" value="<s:property value='employee.name'/>" required />
        <br />
        <label for="email">Email:</label>
        <input type="email" name="employee.email" value="<s:property value='employee.email'/>" required />
        <br />
        <label for="designation">Designation:</label>
        <input type="text" name="employee.designation" value="<s:property value='employee.designation'/>" required />
        <br />
        <label for="salary">Salary:</label>
        <input type="number" name="employee.salary" value="<s:property value='employee.salary'/>" required />
        <br />
        <button type="submit">Submit</button>
    </form>
</body>
</html>