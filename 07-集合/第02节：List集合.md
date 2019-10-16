# 第02节：List集合

上一节我们简单了解了集合，本节详细讲解List集合

有序，有下标，元素可重复
有序collection（也称为序列 ）。 该界面的用户可以精确控制列表中每个元素的插入位置。 用户可以通过整数索引（列表中的位置）访问元素，并搜索列表中的元素。

与set不同，列表通常允许重复的元素。 更正式地，列表通常允许元素e1和e2成对使得e1.equals(e2) ，并且如果它们允许空元素，它们通常允许多个空元素，list集合的特点就是有序和可重复。


### List特有的方法

List中除了Collection里面的方法以外，内部还有一些方法，通过这些方法，开发者可以更方便的操作List接口的实现类。List接口是继承Collection接口，所以Collection集合中有的方法，List集合也继承过来。
使用for循环遍历数组

```java

 import java.util.ArrayList;
 import java.util.List;
 import java.util.Iterator;
 List list=new ArrayList();
		list.add("a");
		list.add("b");
		list.add("d");
		list.add("a");


		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

```


使用ListIterator完成需求，判断一个list里是否有c，如果有就像集合里添加1234
```java

import java.util.List;
import java.util.ListIterator;

public class ListTest {

    public static void main(String[] args){
        List list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        ListIterator lsititer = list.listIterator();
        while (lsititer.hasNext()){
            String s = (String)lsititer.next();
            if("c".equals(s)){
                //不能使用list中的add方法要使用ListIterator中的add方法
                lsititer.add("1234");
            }
        }
	System.out.println(list);

```
List集合移除对象的注意事项：比如我想移除List集合里的奇数，用for循环不能将奇数都移除掉，因为用for循环时，List里的对象的位置会往前移，会漏掉；用foreach也不能将奇数都移除掉，因为用foreach时不能改变集合的长度，会报java.util.ConcurrentModificationException当前集合改变异常；用迭代器则可以把所有的奇数都移除掉，因为用迭代器时，List里对象的位置是不变的，所以能全部移除掉。

4、List集合的调优：List集合本质就是可变长度的数组，它的默认初始容量是10，负载因子是0.5，如果要做List集合的调优的话，根据实际的业务场景制定初始容量即可。

5、拆箱与装箱：将基本数据类型转换为引用数据类型，被专业称为装箱的过程；将引用数据类型转换为基本数据类型，被专业称为拆箱的过程。

```java
 List list=new ArrayList<>();
		//new Integer(23):将基本数据类型转换为引用数据类型，被专业称为装箱的过程
		list.add(34);
		list.add(new Integer(23));
		list.add(new Integer(35));
		list.add(new Integer(9));
		list.add(new Integer(274));
		
		for (int i = 0; i < list.size(); i++) {
			Object obj = list.get(i);
			if(obj instanceof Integer) {
				Integer tt=(Integer)obj;
				//tt.intValue():将引用数据类型转换为基本数据类型，被称为拆箱
				int iv = tt.intValue();
				if(iv%2==0) {
					System.out.println(iv);
				}
			}

```