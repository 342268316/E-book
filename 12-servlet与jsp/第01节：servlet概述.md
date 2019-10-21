# 第01节：servlet概述

### 一、什么是servlet
上一节我们了解了什么是服务器，并且配置了开发和调试JSP程序的tomcat。  
Servlet 是运行在 Web 服务器或应用服务器上的程序，它是作为来自 Web 浏览器或其他 HTTP 客户端的请求和 HTTP 服务器上的数据库或应用程序之间的中间层。  

使用 Servlet，您可以收集来自网页表单的用户输入，呈现来自数据库或者其他源的记录，还可以动态创建网页。  

Servlet 通常情况下与使用 CGI（Common Gateway Interface，公共网关接口）实现的程序可以达到异曲同工的效果。但是相比于 CGI，Servlet 有以下几点优势：  

* 性能明显更好。
* Servlet 在 Web 服务器的地址空间内执行。这样它就没有必要再创建一个单独的进程来处理每个客户端请求。
* Servlet 是独立于平台的，因为它们是用 Java 编写的。
* 服务器上的 Java 安全管理器执行了一系列限制，以保护服务器计算机上的资源。因此，Servlet 是可信的。
* Java 类库的全部功能对 Servlet 来说都是可用的。它可以通过 sockets 和 RMI 机制与 applets、数据库或其他软件进行交互。


### 二、IDEA创建servlet项目

* 在IDEA中点击File => New => Project
* 勾选Java EE中的Web Application
* next一直到创建完成

### 三、启动服务器

* 在IDEA中点击run菜单，选择Edit Configurations
* 点击左上角的【+】，选择Tomcat Server => Local
* 右侧deployment中点击fix，然后将Application context修改为【/】
* 最后点击OK按钮
* 然后点击Run => Run启动项目
* 在浏览器中访问http://localhost:8080/，可以看到$END$，说明项目已经正常启动
