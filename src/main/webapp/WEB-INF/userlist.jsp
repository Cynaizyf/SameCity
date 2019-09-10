<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <title>用户管理</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/statics/css/style.css">
    <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/login.js"></script>
</head>
<table align="center">
    <form>
        <h1 align="center">用户管理</h1>
        <tr>
            <td><input name="queryone" type="text" id="queryone" class="in-1" placeholder="输入文字搜索"></td>
            <td><input type="button" value="查询" onclick="finds()"/></td>
        </tr>
    </form>
</table>
<table border="2" align="center">
    <tbody>
    <tr>
        <th>用户名</th>
        <th>密码</th>
        <th>电话号码</th>
        <th>Email</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${userList}" var="user">
        <tr>
            <td>${user.username}</td>
            <td>${user.password}</td>
            <td>${user.phone}</td>
            <td>${user.email}</td>
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