# 第08节：servlet注解

### servlet3.0新特性之注解

在servelet3.0规范中允许在定义 Servlet、Filter 与 Listener 三大组件时使用注解，而不用在web.xml 进行注册了。Servlet3.0 规范允许 Web 项目没有 web.xml 配置文件。  
使用servlet3.0时需要jdk6+，tomcat7+  

#### servlet注解

在3.0规范中使用@WebServlet()注解注册一个servlet，该注解中有多个属性，常用属性如下：  

属性名|类型|说明
|:-|:-:|-:|
urlPatterns|String[]|相当于url-pattern的值
value|String[]|与 urlPatterns 意义相同，不能与 urlPatterns 属性同时使用
name|String|相当于servlet-name的值
loadOnStartup|int|相当于loadOnStartup，默认值为-1
initParams|WebInitParam[]|相当于init-param标签。其类型为另一个注解 WebInitParam 数组