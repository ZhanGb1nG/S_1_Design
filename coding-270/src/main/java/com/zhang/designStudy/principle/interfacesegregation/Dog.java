package com.zhang.designStudy.principle.interfacesegregation;

/**
 * 接口隔离原则，狗实现吃和游泳两个接口
 *
 * @Author ZhanG_b1nG
 * @Date 2020/3/30 22:50
 * @Version 1.0
 **/
public class Dog implements IEatAnimalAction, ISwimAnimalAction {
    @Override
    public void eat() {
        System.out.println("eat");
    }

    @Override
    public void swim() {
        System.out.println("swim");
    }
}
