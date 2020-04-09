<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 4/9/2020
  Time: 3:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Registration</title>
    <style>
        .error{
            color: #ff0000;
        }
        .eerorblock{
            color: #000;
            background-color: aquamarine;
            border: 1px solid #ff0000;
            padding: 8px;
            margin: 16px;
        }
    </style>
</head>
<body>
<h1>Registration</h1>

<form:form modelAttribute="registration">
    <form:errors path="name" cssClass="eerorblock" element="div"/>
    <table>
        <tr>
            <td>
                <spring:message code="name"/>:
            </td>
            <td>
                <form:input path="name"/>
            </td>
        </tr>
        <tr >
            <td colspan="2">
                <input type="submit" value="Add Registration">
            </td>

        </tr>
    </table>
</form:form>

</body>
</html>
