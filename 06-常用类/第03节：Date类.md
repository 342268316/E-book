# 第03节：Date类型

### 一、获取时间戳

时间戳自 1970年1月1日 00时00分00秒 000毫秒 到当前的毫秒数。

``` java
long now = System.currentTimeMillis();
System.out.println(now);
```

### 二、获取系统当前时间

``` java
package com.company;
import java.util.Date;
public class Main {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println(now);
    }
}

```

### 三、日期格式化

``` java
package com.company;
import java.util.Date;
import java.text.SimpleDateFormat;
public class Main {
    public static void main(String[] args) {
        Date now = new Date();
        SimpleDateFormat fmt = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss SSS");
        String nowTime = fmt.format(now);
        System.out.println(nowTime);
    }
}

```

### 四、将String类型转换为Date类型

``` java
package com.company;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Main {
    public static void main(String[] args) {
        String strTime = "2017年01月01日 00:00:00 000";
        //将String日期转换成日期类型Date
        //String-->Date
        //1.创建日期格式化对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss SSS"); //格式不能随意，应该和上面的字符串格式相同。
        //2.将字符串转换成日期类型
        Date d = new Date();
        try {
            d = sdf.parse(strTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(d);
    }
}

```