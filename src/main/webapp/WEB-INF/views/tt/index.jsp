<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Hello World!</h2>
</h2><a href="${pageContext.request.contextPath}/login">tt</a>
<table align="center" border="1" length="500">
  <tr><td width="80">账号</td><td width="80">密码</td><td width="80">姓名</td>
  <c:forEach var="c" items="${c}">
     <tr>
     <td>${c.userId}</td>
     <td>${c.password}</td>
     <td>${c.name}</td>
     </tr>
  </c:forEach>

${sessionScope.username1}
${requestScope.username1}
</table>
</body>
</html>
