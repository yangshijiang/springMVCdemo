<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<body>
<h2>Hello spring mvc!${pageContext.request.contextPath}
</h2><a href="/tt/index">tt</a>

${sessionScope.username1}
${requestScope.username1}
</body>
</html>
