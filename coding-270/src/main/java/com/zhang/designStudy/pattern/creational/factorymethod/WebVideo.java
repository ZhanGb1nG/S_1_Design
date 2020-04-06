package com.zhang.designStudy.pattern.creational.factorymethod;

/**
 * 抽象产品类具体实现类
 *
 * @Author ZhanG_b1nG
 * @Date 2020/4/5 19:03
 * @Version 1.0
 **/
public class WebVideo extends Video {
    @Override
    public void produce() {
        System.out.println("学习Web课程");
    }
}
