<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Student CRUD</title>
</head>
<body>
    <center>
        <h1>Add Student</h1>
        <h2>
            <a href="/add">Add New Student</a>
            &nbsp;&nbsp;&nbsp;
            <a href="/students">List All Students</a>

        </h2>
    </center>
    <div align="center">
        <c:if test="${student != null}">
            <form action="update" method="post">
        </c:if>
        <c:if test="${student == null}">
            <form action="insert" method="post">
        </c:if>
        <table border="1" cellpadding="5">
            <caption>

            </caption>
                <c:if test="${student != null}">
                    <input type="hidden" name="id" value="<c:out value='${student.id}' />" />
                </c:if>
            <tr>
                <th>Title: </th>
                <td>
                    <input type="text" name="firstName" size="45"
                            value="<c:out value='${student.firstName}' />"
                        />
                </td>
            </tr>
            <tr>
                <th>Author: </th>
                <td>
                    <input type="text" name="lastName" size="45"
                            value="<c:out value='${student.lastName}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>Price: </th>
                <td>
                    <input type="text" name="age" size="5"
                            value="<c:out value='${student.age}' />"
                    />
                </td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="Save" />
                </td>
            </tr>
        </table>
        </form>
    </div>
</body>
</html>