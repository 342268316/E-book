# 第04节：Hello_world
前几节我们讲了JDK的安装与配置环境和开发工具的下载,那么接下来我们要在下载好的开发工具上写下我们第一个案例HelloWorld

### 一、创建项目
1. 打开idea软件，点击界面上的Create New Project  
 ![Image text](../images/0103_create.png)
2. 出现以下界面，选中Java，然后选择jdk，最后点击Next，进行下一步  
 ![Image text](../images/0103_create2.png)  
3. 这里是选择生成项目时是否创建java文件，勾选上Java Hello World后会生成一个默认的Hello world文件，点击Next进行下一步  
 ![Image text](../images/0103_create3.png)  
4. 给项目命名，默认是untiled，自己填个名字吧，最后点击finish  
 ![Image text](../images/0103_create4.png)  
5. 项目创建完成

### 二、创建类与运行项目
 1. 点击src——>new——>package，创建一个文件包，并给包命名，与Eclipse的包类似；  
 ![Image text](../images/0103_create5.png)  
 2. 在包下面创建java类文件，点击包名——>New——>Java Class;  
 ![Image text](../images/0103_create6.png)  
 3. 写入代码  
 ![Image text](../images/0103_create7.png)  
 4. 运行java文件，点击上方工具栏中的Run——>Run......;
 出现以下弹框，点击要运行的文件名，这里是Hello;
 ![Image text](../images/0103_status.png)  
 ![Image text](../images/0103_status2.png)  
 5. 运行成功  
 * 注：这里只是教学如何运行项目，让同学们对运行项目的流程有所了解


### 三、在控制台输出Hello world

开始学习任何一门编程语言做的第一件事都习惯性地输出Hello_world。前三节我们已经安装和配置好了开发环境，本节就从一个Hello_world案例开始。

``` java
public class Hello {
    public static void main(String[] args) {
        // 注释：在控制台输出Hello World

        /*
            下面的代码，
            可以在控制台输出Hello World
        */ 

        System.out.println("Hello World!");
    }
}
```

### 四、代码讲解

在上面的程序当中，我们创建了一个名为Main的类，Main类中有个HelloWorld方法。类和方法的概念我们会在第三章详细讲解，这里大家只要知道main方法是整个程序的入口方法。所有的程序都从这里开始执行。我们输出的Hello world其实只需要一行代码。

``` java
System.out.println("Hello World!");
```

### 五、注释

代码中有一部分用作程序的备注，这些内容不被执行，他们就是注释

* 单行注释
``` js
//我是单行注释
```
* 多行注释
``` js
/* 
我是多行注释
我是多行注释
我是多行注释
 */
```
关于注释，我们后续还有进一步的讲解。

### 六、总结

本章我们对Java的有了初步的了解，并安装和配置了Java开发环境，大家不必对代码做过多的理解，在后续的章节中我们会对各类知识点做系统的讲解。

