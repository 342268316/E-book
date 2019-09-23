package com.company;

public class Student {
    String name ;
    int age;
    Student(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void sayName(){
        System.out.println("我是"+name);
    }
}
