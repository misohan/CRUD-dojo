<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <center>
            <h1>Students CRUD</h1>
            <h2>
                <a href="/add">Add student</a>
                &nbsp;&nbsp;&nbsp;
                <a href="/students">List All students</a>

            </h2>
        </center>
        <div align="center">
            <table border="1" cellpadding="5">
                <caption><h2>List of students</h2></caption>
                <tr>
                    <th>ID</th>
                    <th>First name</th>
                    <th>Last name</th>
                    <th>Age</th>
                    <th>Action</th>
                </tr>
                <c:forEach var="student" items="${listStudents}">
                    <tr>
                        <td><c:out value="${student.id}" /></td>
                        <td><c:out value="${student.firstName}" /></td>
                        <td><c:out value="${student.lastName}" /></td>
                        <td><c:out value="${student.age}" /></td>
                        <td>
                            <a href="/edit?id=<c:out value='${student.id}' />">Edit</a>
                            &nbsp;&nbsp;&nbsp;&nbsp;
                            <a href="/delete?id=<c:out value='${student.id}' />">Delete</a>
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </div>
</body>
</html>