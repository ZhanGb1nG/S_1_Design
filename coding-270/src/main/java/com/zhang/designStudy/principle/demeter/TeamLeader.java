package com.zhang.designStudy.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO
 *
 * @Author ZhanG_b1nG
 * @Date 2020/4/4 11:11
 * @Version 1.0
 **/
public class TeamLeader {
    public void getCourseNumber() {
        List<Course> list = new ArrayList<Course>();
        for (int i = 0; i < 20; i++) {
            list.add(new Course());
        }
        System.out.println("课程数：" + list.size());
    }
}
