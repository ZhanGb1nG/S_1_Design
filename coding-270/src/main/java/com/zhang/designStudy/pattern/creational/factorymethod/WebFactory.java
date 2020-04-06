package com.zhang.designStudy.pattern.creational.factorymethod;

/**
 * 具体的工厂实现子类
 *
 * @Author ZhanG_b1nG
 * @Date 2020/4/6 15:36
 * @Version 1.0
 **/
public class WebFactory extends IVideoFactory {
    @Override
    public Video getVideoFactory() {
        return new WebVideo();
    }
}
