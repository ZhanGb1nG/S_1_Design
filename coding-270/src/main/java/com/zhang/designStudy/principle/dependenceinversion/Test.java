package com.zhang.designStudy.principle.dependenceinversion;

/**
 * TODO
 *
 * @Author ZhanG_b1nG
 * @Date 2020/3/29 17:42
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        Marry marry = new Marry();
        marry.setiCourse(new JavaCourse());
        marry.study();

        marry.setiCourse(new WebCourse());
        marry.study();

        marry.setiCourse(new VueCourse());
        marry.study();
    }
}
