package com.zhang.designStudy.principle.dependenceinversion;

/**
 * vue课程学习实现类
 *
 * @Author ZhanG_b1nG
 * @Date 2020/3/29 17:42
 * @Version 1.0
 **/
public class VueCourse implements ICourse{
    @Override
    public void studyCourse() {
        System.out.println("学习vue课程");
    }
}
