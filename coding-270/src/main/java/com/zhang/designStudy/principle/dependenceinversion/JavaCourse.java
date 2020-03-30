package com.zhang.designStudy.principle.dependenceinversion;

/**
 * Java课程学习实现类
 *
 * @Author ZhanG_b1nG
 * @Date 2020/3/29 17:41
 * @Version 1.0
 **/
public class JavaCourse implements ICourse{
    @Override
    public void studyCourse() {
        System.out.println("学习Java课程");
    }
}
