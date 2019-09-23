# 第04节：Hello_world

### 一、在控制台输出Hello world

开始学习任何一门编程语言做的第一件事都习惯性地输出Hello_world。前三节我们已经安装和配置好了开发环境，本节就从一个Hello_world案例开始。

``` java
public class Main {
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

### 二、代码讲解

在上面的程序当中，我们创建了一个名为Main的类，Main类中有个main方法。类和方法的概念我们会在第三章详细讲解，这里大家只要知道main方法是整个程序的入口方法。所有的程序都从这里开始执行。我们输出的Hello world其实只需要一行代码。

``` java
System.out.println("Hello World!");
```

#### 注释

代码中有一部分用作程序的备注，这些内容不被执行，他们就是注释

* 单行注释
* 多行注释

关于注释，我们后续还有进一步的讲解。

### 三、总结

本章我们对Java的有了初步的了解，并安装和配置了Java开发环境，大家不必对代码做过多的理解，在后续的章节中我们会对各类知识点做系统的讲解。

