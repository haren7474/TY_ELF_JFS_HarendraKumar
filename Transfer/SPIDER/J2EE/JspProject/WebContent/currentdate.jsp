<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%!
public int x=10;
public static double d= 20.5;

public void m1()
{
	System.out.println("Inside non static m1()");
}

public static void m2()
{
	System.out.println("Inside  static m2()");
}
%>

<%
Date date= new Date();
String currDate= date.toString();

%>

<h1> This is JSP Dynamic Response</h1>
<h2>
Current Date: <%= currDate %>
</h2>

</body>
</html>