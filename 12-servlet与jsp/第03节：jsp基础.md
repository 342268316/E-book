# 第03节：jsp基础

### 一、jsp概述
上节我们学习了编辑servlet类，在web目录下还存在着JSP文件，JSP是什么呢？本节我们就来学习JSP  
JSP全称是Java Server Pages，是一种动态网页技术，JSP其实就是在html中插入了java代码和JSP标签之后形成的文件，文件名以.jsp结尾

### 二、第一个jsp程序

首先使用IDEA创建一个servlet项目，然后将index.jsp文件修改如下，然后启动服务器，就可以看到当前的时间了。

``` jsp
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <%
    Date d = new Date();
    out.write(d.toLocaleString());
  %>
  </body>
</html>
```

### 三、jsp基本语法

* 注释

``` jsp
<!-- html注释：可以在客户端显示 -->
<%-- jsp注释：不能在客户端显示 --%>
```

* 嵌入java代码

``` jsp
<%
    Date d = new Date();
    out.write(d.toLocaleString());
%>
<%! private int a = 10; %>
<%!
    public void m1(){
        System.out.println("m1方法");
    }
%>
<% int a = 1024;%>
<%= a %>
<%= "monkey1024" %>
```

### 四、jsp中的内置对象

在jsp技术中，有些变量是需要声明之后才能应用的，而有些变量不需要在jsp的脚本语言里声明就能够使用的，被称为jsp页面的内置对象，内置对象有request、response、session、application；下面逐个进行介绍。  

一、request对象  

顾名思义，request是处理请求信息的对象；用户和服务器之间进行交互是通过遵守“http协议”进行的，“http协议”又叫“请求与响应”协议，当用户通过在浏览器地址栏里输入服务器的地址和页面的名字来请求该页面时，就向服务器发送了一个请求，这个请求里包含了客户的请求信息，被封装在request对象里，通过request对象的响应方法来调取信息；  

（1）、request对象获取用户的提交信息  

当用户用form表单向服务器提交信息时，该信息会被tomcat封装在request对象里；request通过getRequest()方法来获取这些信息，getRequest（）也是request对象许多方法中最常用的方法，下面用例子来进行说明：  

``` jsp
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html PUBLIC"-//W3C//DTD HTML 4.01 Transitional//EN""http://www.w3.org/TR/htm14/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF -8">
  <title>Insert title here</title>
</head>
<body>
<form action="" method="get" name="form1">
  <input type="text" name="text1" size="30">
  <input type="submit" name="sub1"value="提交">
</form>
<%String str1=request.getParameter("text1");
  try {
    double m = Double.parseDouble(str1);
    double n = Math.sqrt(m);
    out.println(str1 + "的平方跟是：" + n);
  }catch(Exception e){out.println( "请排入一个要计算开方的整数");}
%>
</body>
</html>
```
![n](../images/1203_inp.jpg)  
注意:此处代码的第18行必须加入异常处理，因为当第一次打开页面时变量str1为空值，此时不能作类型转换。  

<!-- （2）处理汉字信息  

当用request对象获取信息时可能出现中文乱码问题，这里可以采用以下办法：对获取的信息作重新编码，如：Stinger str=request.getParameter("name");Byte b[]=str.getByte("ISO-8859-1");str=new String(b);例子如下：   -->

*  getProtocol():获取请求使用的通信协议；
*  getServletPath():获取请求的jsp页面所在的目录；
*  getContentLength():获取http请求的长度；
*  getmethod():获取表单提交信息的方式；
*  getHeader(String s):获取请求中头的一个值；
*  getHeaderNames():获取头名字的一个枚举；
*  getRemoteAddr():获取客户的IP地址；
*  getRemoteHost():获取客户机的名称（如果获取不到就获取IP地址）；
*  getServerName():获取服务器的名称；
*  getServerPort():获取服务器的端口号；
*  getParameterNames():获取表单提交的信息体部分中name参数值的一个枚举；

二、response对象  

和request对象相对应的是response对象，这个对象用来设置服务器对用户的回应信息；  

（1）改变contentType属性的值

在page指令中，contentType属性只能被赋值一次，但在动态的回应用户这方面是极不方便的，而通过response对象的setContentType（String s）方法就可以实现这一点，其中s可以取值为text/html,text/plain,image/gif,image/jpeg,image/x-xbitmap,image/pjpeg,application/x-shockwave-flash,application/vnd.ms-powerpoint,application/vnd.ms-excel,application/msword等，实例如下：

