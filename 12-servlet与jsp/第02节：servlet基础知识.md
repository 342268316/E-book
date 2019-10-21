# 第02节：servlet基础知识

### 一、创建servlet类
上节我们了解了servlet概述和启动项目，本节我们来学习一下如何编辑servlet类
* 右键点击src目录 new => package 创建一个包（例如com.xiaozhoubg）
* 右键点击包目录 new => servlet创建之后代码如下所示。

``` java
package com.xiaozhoubg;

import java.io.IOException;


public class Servlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}

```

* 同时修改web->WEB-INF->web.xml文件如下所示：

``` xml
<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns="http://xmlns.jcp.org/xml/ns/javaee"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/web-app_4_0.xsd"
         version="4.0">
    <servlet>
        <servlet-name>Servlet</servlet-name>
        <servlet-class>com.xiaozhoubg.Servlet</servlet-class>
    </servlet>
    <servlet-mapping>
        <servlet-name>Servlet</servlet-name>
        <url-pattern>/test</url-pattern>
    </servlet-mapping>
</web-app>
```

### 二、引入servlet相关类

如果servlet类报错，说明没有添加servlet相关模块，按如下操作添加模块。

* 点击菜单 File => Project Structure
* 选择Modules
* 点击【+】选择Library，选择tomcat

### 三、编辑servlet类

修改servlet类如下所示,可以处理常用的请求方法：

``` java
package com.xiaozhoubg;
import java.io.IOException;
public class Servlet extends javax.servlet.http.HttpServlet {
    // 接收post请求
    protected void doPost(javax.servlet.http.HttpServletRequest request, 
    javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doGet(request,response);
    }
    //接受get请求
    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.getWriter().write("hello servlet");
    }
    //接受put请求
    //接受delete请求
    //在开放中常用post和get请求，很少使用put和delete请求
}

```

启动项目，访问http://localhost:8080/test，可以看到网页中显示hello servlet。
