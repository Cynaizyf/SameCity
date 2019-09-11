<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <title>修改页面</title>
</head>
<body>
    <form method="post" action="edit">
        <table border="1">

            <tr>
                <td colspan="2">修改用户信息</td>
            </tr>
            <tr>
                <td>姓名</td>
                <td>
                    <input type="text" name="username" value="${c.username }" />
                </td>
            </tr>
            <tr>
                <td>密码</td>
                <td>
                    <input type="password" name="password" value="${c.password }"/>
                </td>
            </tr>
            <tr>
                <td>手机号</td>
                <td>
                    <input type="text" name="phone" value="${c.phone }" />
                </td>
            </tr>
            <tr>
                <td>邮箱</td>
                <td>
                    <input type="text" name="email" value="${c.email }"/>
                </td>
            </tr>

            <tr>
                <td>
                    <a href="${pageContext.request.contextPath}/ssmcrud/fanhui">返回</a>
                </td>
                <td>
                    <input type="submit" value="提交" />
                </td>
            </tr>
        </table>
    </form>
</body>
</html>