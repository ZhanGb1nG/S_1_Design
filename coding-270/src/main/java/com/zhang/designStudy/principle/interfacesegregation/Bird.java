package com.zhang.designStudy.principle.interfacesegregation;

/**
 * 接口隔离原则，鸟实现吃和飞两个接口
 *
 * @Author ZhanG_b1nG
 * @Date 2020/3/30 22:52
 * @Version 1.0
 **/
public class Bird implements IEatAnimalAction, IFlyAnimalAction {

    @Override
    public void eat() {
        System.out.println("eat");
    }

    @Override
    public void fly() {
        System.out.println("fly");
    }
}
