# 第05节：servlet监听器

### 一、监听器概述

servlet中的点挺起是用于监听HttpServletRequest，HttpSeesion，ServletContext，主要作用如下所示：

* 监听web对象的创建与销毁
  * ServletContextListener
  * HttpSessionListener
  * ServletRequestListener
* 监听web对象的属性变化
  * ServletContextAttributeListener
  * HttpSessionAttributeListener
  * ServletRequestAttributeListener
* 监听session绑定javaBean操作
  * HttpsessionBindingListener
  * HttpSessionActivationListener

