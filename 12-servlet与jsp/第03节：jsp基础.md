# 第03节：jsp基础

### 一、jsp概述

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