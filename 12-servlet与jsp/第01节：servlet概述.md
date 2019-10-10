# 第01节：servlet概述

### 一、什么是servlet



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
