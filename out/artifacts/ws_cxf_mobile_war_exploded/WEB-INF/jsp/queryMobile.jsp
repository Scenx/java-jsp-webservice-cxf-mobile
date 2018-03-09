<%--
  @author Scen
  @date 2018/3/9
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>手机号归属地查询网站</title>
</head>
<body>
<form action="queryMobile.action" method="post">
    手机号归属地查询：<input type="text" name="phoneNum" id="phoneNum"/><input type="submit" value="查询"/><br/>
    查询结果：${result}
</form>

</body>
</html>
