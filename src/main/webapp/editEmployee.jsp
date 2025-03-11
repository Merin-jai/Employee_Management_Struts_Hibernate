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
    <h2>Edit Employee Details</h2>
    
    <!-- Form to edit employee -->
    <s:form action="updateEmployee" method="post">
        
        <!-- Hidden field for employee ID -->
        <s:hidden name="employee.id" value="%{employee.id}" />

        <!-- Employee Name -->
        <s:textfield label="Name" name="employee.name" value="%{employee.name}" required="true" />

        <!-- Employee Email -->
        <s:textfield label="Email" name="employee.email" value="%{employee.email}" required="true" />

        <!-- Employee Designation -->
        <s:textfield label="Designation" name="employee.designation" value="%{employee.designation}" required="true" />

        <!-- Employee Salary -->
        <s:textfield label="Salary" name="employee.salary" value="%{employee.salary}" required="true" />

        <!-- Submit button -->
        <s:submit value="Update Employee" />

        <!-- Display any validation errors -->
        <s:fielderror />

    </s:form>
    
    <!-- Link to go back to the list of employees -->
    <a href="<s:url action='listEmployees' />">Back to Employee List</a>
<
</body>
</html>