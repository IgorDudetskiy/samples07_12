<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>
<p><%=new java.util.Date()%>
</p>

<h1>Information about student</h1>
<form action="Servlet1" method="post">
    First name:<input name="firstname"/>
    <br>
    Last name: <input name="lastname"/>
    <br>
    Student type: <input type="radio" name="student" value="student" checked/> Student
    <input type="radio" name="student" value="nostudent"/>NoStudent

    Language: <select name="language">
    <option>java</option>
    <option>python</option>
    <option>javaScript</option>
    <option>ruby</option>
</select>
<br>
    Completed courses:
    <input type="checkbox" name="courses" value="core" > Core
    <input type="checkbox" name="courses" value="marathon" > Marathon
    <input type="checkbox" name="courses" value="internShip" > InternShip
<br>
    <input type="submit" value="Ok"/>


</form>

</body>
</html>