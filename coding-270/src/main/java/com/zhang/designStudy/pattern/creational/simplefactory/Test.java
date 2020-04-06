package com.zhang.designStudy.pattern.creational.simplefactory;

/**
 * 简单工厂学习测试类
 *
 * @Author ZhanG_b1nG
 * @Date 2020/4/5 19:04
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        Video video = new JavaVideo();
        video.produce();
        // 使用工厂创建
        VideoFactory videoFactory = new VideoFactory();
        Video video1 = videoFactory.getVideoFactory("web");
        if (video1 == null) {
            return ;
        }
        video1.produce();
        // 通过clss创建
        Video video2 = videoFactory.getVideoFactory(JavaVideo.class);
        video2.produce();

    }

}
