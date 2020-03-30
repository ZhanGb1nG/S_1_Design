package com.zhang.designStudy.principle.openclose;

/**
 * @Description 开闭原则测试类
 * @Author ZhanG_b1nG
 * @Date 2020/3/16 21:30
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
//        ICourse iCource = new Course(1, "vue课程学习", 12.11);
        ICourse iCource = new DiscountCourse(1, "vue课程学习", 12.11);
        DiscountCourse discountCourse = (DiscountCourse) iCource;
        // 课程ID：1， 课程名称：vue课程学习，原价：12.11， 课程价格：9.688
        System.out.println("课程ID：" + discountCourse.getId() + "， 课程名称：" + discountCourse.getName() + "，原价："
                + discountCourse.getOriginPrice() + "， 课程价格：" + discountCourse.getPrice());
    }
}