# 第04节：Map集合

上一节学习了set集合，这一节我们学习Map集合。

其提供的是key到value的映射,Map中不能包含相同的key值,每个key只能影射一个相同的value.key值还决定了存储对象在映射中的存储位置.但不是key对象本身决定的,而是通过散列技术进行处理,可产生一个散列码的整数值,散列码通常用作一个偏移量,该偏移量对应分配给映射的内存区域的起始位置,从而确定存储对象在映射中的存储位置.Map集合包括Map接口以及Map接口所实现的类.

#### Map接口

 数据都是键值对，2种遍历方式，keySet、EntrySet
              HashMap–类：键值都可以为null值，线程不安全的
              Hashtable–类：键和值都不能为null值，线程安全的
              TreeMap–类：键不能为null值，value值可以为null值
               按照数据的自然顺序存放（升序），数据类型需要兼容，不能存放null
                      数字：从小到大顺序
                     英文：字典顺序顺序
                     类：需要实现comparable接口或者自定义比较器comparator

Map接口概述
* 查看API可以知道：
* 将键映射到值的对象
* 一个映射不能包含重复的键
* 每个键最多只能映射到一个值

Map接口和Collection接口的不同

* Map是双列的,Collection是单列的
* Map的键唯一,Collection的子体系Set是唯一的
* Map集合的数据结构值针对键有效，跟值无关;Collection集合的数据结构是针对元素有效


添加功能
* V put(K key,V value):添加元素。
* 如果键是第一次存储，就直接存储元素，返回null
* 如果键不是第一次存在，就用值把以前的值替换掉，返回以前的值

```java

import java.util.HashMap;
import java.util.Map;
 
public class Demo1_Map {
 
	public static void main(String[] args) {
		Map<String, Integer> map=new HashMap<>();
		Integer i1=map.put("张三", 23);
		Integer i2=map.put("李四", 24);
		Integer i3=map.put("王五", 25);
		Integer i4=map.put("赵六", 26);
		Integer i5=map.put("张三", 26);//把被覆盖的元素返回
		System.out.println(map);
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
		System.out.println(i5);
	}

```

删除功能
* void clear():移除所有的键值对元素
* V remove(Object key)：根据键删除键值对元素，并把值返回

```java


import java.util.HashMap;
import java.util.Map;
 
public class Demo1_Map {
 
	public static void main(String[] args) {
		Map<String, Integer> map=new HashMap<>();
		map.put("张三", 23);
		map.put("李四", 24);
		map.put("王五", 25);
		map.put("赵六", 26);
		
		Integer i1Value=map.remove("张三"); 
		System.out.println(i1Value);
		System.out.println(map);

```