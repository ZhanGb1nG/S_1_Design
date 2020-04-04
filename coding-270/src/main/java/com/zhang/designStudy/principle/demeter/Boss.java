package com.zhang.designStudy.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO
 *
 * @Author ZhanG_b1nG
 * @Date 2020/4/4 11:10
 * @Version 1.0
 **/
public class Boss {
    /**
     * 获取课程数<br>
     *     直接传入团队leader获取课程数
     *
     * @param teamLeader
     * @Date 2020/4/4 11:17
     * @return void
     * @Author ZhanG_b1nG
     */
    public void getCourseNumber(TeamLeader teamLeader) {
//        List<Course> list = new ArrayList<Course>();
//        for (int i = 0; i < 20; i++) {
//            list.add(new Course());
//        }
        teamLeader.getCourseNumber();
    }
}
