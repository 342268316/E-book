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
