package com.company;

public class Bird extends Animal implements Fly {
    @Override
    public void fly() {
        System.out.println("鸟儿飞");
    }
}
