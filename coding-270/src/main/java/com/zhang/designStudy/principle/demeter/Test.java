package com.zhang.designStudy.principle.demeter;

/**
 * 迪米特原则学习测试类
 *
 * @Author ZhanG_b1nG
 * @Date 2020/4/4 11:10
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.getCourseNumber(new TeamLeader());
    }
}
