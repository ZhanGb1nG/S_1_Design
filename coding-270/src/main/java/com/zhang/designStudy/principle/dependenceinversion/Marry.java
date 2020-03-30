package com.zhang.designStudy.principle.dependenceinversion;

/**
 * 具体学习类，只需扩展学习的具体课程类
 *
 * @Author ZhanG_b1nG
 * @Date 2020/3/29 17:43
 * @Version 1.0
 **/
public class Marry{
    private ICourse iCourse;

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void study() {
        iCourse.studyCourse();
    }
}
