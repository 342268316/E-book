# 第01节：String类

### 一、字符串的不可变性

String类在java.lang包下面，是Object类的直接子类，通过API或者源码可以看到，String类是final修饰的，这说明String类不能被继承。

字符串一旦创建好之后，里面的内容是不能被修改的，jvm会将双引号””中的内容存放在字符串常量池里面，常量池中的对象内容是不可修改的。

``` java
String s1 = "monkey1024";
String s2 = "monkey1024";
s1 = "good";
```

上面代码中，创建s1时，jvm会在常量池中创建一个monkey1024字符串对象，创建s2时，jvm会去常量池中搜索，此时常量池中有monkey024，所以就不创建了，直接让s2指向之前创建的monkey1024。当执行到最后一行时，jvm会在常量池中创建一个good，然后让s1指向这个good，而不是将常量池中的monkey1024修改为good，所以说常量池中的对象内容是不可修改的。

### 二、使用String时需要注意的问题

在工作中尽量不要做字符串频繁的拼接操作。因为字符串一旦创建不可改变，如果频繁拼接，就会在字符串常量池中创建大量的字符串对象，给垃圾回收带来问题。

如果需要做字符串频繁的拼接操作，最好使用StringBuffer或者StringBuilder，这两个类会在本节后面内容讲解。

### 三、String类的常用方法

* char charAt(int index);获取index位置的字符
* boolean contains(CharSequence s);判断字符串中是否包含某个字符串
* boolean endsWith(String endStr);判断是否是以某个字符串结尾
* boolean equalsIgnoreCase(String anotherString);忽略大小写比较两个字符串是否相等
* byte[] getBytes();转换成byte数组
* int indexOf(String str);取得指定字符在字符串的位置
* * int indexOf(String str, int fromIndex);从指定的下标开始取得指定字符在字符串的位置
* * int lastIndexOf(String str);从后面开始取得指定字符在字符串最后出现的的位置
* * int lastIndexOf(String str, int fromIndex);从后面开始指定的下标开始取得指定字符在字符串的位置
* * int length();获取字符串的长度
* * String replaceAll(String s1,String s2);替换字符串中的内容
* * String[] split(String s);根据指定的表达式拆分字符串
* boolean startsWith(String s);判断是否是以某个字符串开始
* String substring(int begin);根据传入的索引位置截子串
* String substring(int beginIndex, int endIndex);根据传入的起始和结束位置截子串
* char[] toCharArray();将字符串转换为char数组
* void toUpperCase();转换为大写
* void toLowerCase();转换为小写
* String trim();去除首尾空格
* String valueOf(Object obj);将其他类型转换为字符串类型

### 四、正则表达式

正则表达式可以用来实现字符串的匹配，例如将一个字符串中左右的小写字母都替换成大写字母，这样的需求就需要正则表达式来完成。

``` java

```

### 五、StringBuffer和StringBuilder

StringBuffer是一个字符串缓冲区，如果需要频繁的对字符串进行拼接时，建议使用StringBuffer。

#### 工作原理

StringBuffer的底层是char数组，如果没有明确设定，则系统会默认创建一个长度为16的char类型数组，在使用时如果数组容量不够了，则会通过数组的拷贝对数组进行扩容，所以在使用StringBuffer时最好预测并手动初始化长度，这样能够减少数组的拷贝，从而提高效率。

#### String与StringBuffer的区别？

String是不可变字符序列，存储在字符串常量池中

StringBuffer的底层是char数组，系统会对该数组进行扩容

StringBuffer的构造方法：

``` java
package com.company;
public class StringBufferTest01 {
    public static void main(String[] args) {
        //构造方法
        StringBuffer sb1 = new StringBuffer();
        //StringBuffer的初始容量
        System.out.println(sb1.capacity());
        //手动指定StringBuffer的长度
        StringBuffer sb2 = new StringBuffer(100);
        System.out.println(sb2.capacity());
        StringBuffer sb3 = new StringBuffer("monkey");
        System.out.println(sb3.capacity());//字符串的length + 16
    }
}
```

#### 使用StringBuffer进行字符串拼接

``` java
package com.company;

public class Main {

    public static void main(String[] args) {
        //初始化StringBuffer
        StringBuffer sb = new StringBuffer(50);
        //追加字符串
        sb.append("http://");
        sb.append("blog.");
        sb.append("xzkeji.");
        sb.append("com");
        System.out.println(sb);
        //插入字符串
        sb.insert(7,"test");
        System.out.println(sb);
        //删除字符串
        sb.delete(7,10);
        System.out.println(sb);
    }
}

```

#### StringBuilder和StringBuffer的区别

通过API可以看到StringBuilder和StringBuffer里面的方法是一样的，那他们有什么区别呢？

* StringBuffer是jdk1.0版本中加入的，是线程安全的，效率低
* StringBuilder是jdk5版本加入的，是线程不安全的，效率高