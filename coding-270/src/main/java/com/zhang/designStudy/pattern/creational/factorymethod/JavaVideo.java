package com.zhang.designStudy.pattern.creational.factorymethod;

/**
 * 抽象产品类具体实现类
 *
 * @Author ZhanG_b1nG
 * @Date 2020/4/5 19:02
 * @Version 1.0
 **/
public class JavaVideo extends Video {
    @Override
    public void produce() {
        System.out.println("学习Java课程");
    }
}
