<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <base>
    <title>用户列表</title>
</head>
<body><h6><a href="${path}/user/toAddUser">添加用户</a></h6>
<table border="1">
    <tbody>
    <tr>
        <th>id</th>
        <th>姓名</th>
        <th>年龄</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${userList}" var="user">
        <tr>
            <td>${user.user_id}</td>
            <td>${user.user_name }</td>
            <td>${user.user_age }</td>
            <td>
                <a href="">编辑</a>
                <a href="">删除</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>