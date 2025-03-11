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
	<h2>Employee List</h2>
    <s:iterator value="employees">
        <p>ID: <s:property value="id"/></p>
        <p>Name: <s:property value="name"/></p>
        <p>Email: <s:property value="email"/></p>
        <p>Salary: <s:property value="salary"/></p>
        <p>Designation: <s:property value="designation"/></p>
        <hr/>
    </s:iterator>
</body>
</html>