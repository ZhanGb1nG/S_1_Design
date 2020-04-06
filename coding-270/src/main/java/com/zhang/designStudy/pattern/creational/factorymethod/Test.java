package com.zhang.designStudy.pattern.creational.factorymethod;

/**
 * 简单工厂学习测试类
 *
 * @Author ZhanG_b1nG
 * @Date 2020/4/5 19:04
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        IVideoFactory iVideoFactory = new JavaFactory();
        Video video = iVideoFactory.getVideoFactory();
        video.produce();

        IVideoFactory iVideoFactory1 = new WebFactory();
        Video video1 = iVideoFactory1.getVideoFactory();
        video1.produce();
    }

}
