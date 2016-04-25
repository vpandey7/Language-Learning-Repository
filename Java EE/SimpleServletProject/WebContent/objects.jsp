<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Testing Objects</title>
</head>
<body>

<% 
String userName = request.getParameter("name");

if(userName!=null){
	session.setAttribute("sessionUserName", userName);
	application.setAttribute("contextUserName", userName);
	pageContext.findAttribute("hello");
	
}
%>
<br>
User Name in the object is <%=userName %>
<br>
User Name in the session object is <%= session.getAttribute("sessionUserName")%>
<br>
User Name in the context object is <%= application.getAttribute("contextUserName")%>

Hello 1 is <%= pageContext.findAttribute("name")%>

</body>
</html>