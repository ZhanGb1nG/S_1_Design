package com.zhang.designStudy.creational.simplefactory;

/**
 * TODO
 *
 * @Author ZhanG_b1nG
 * @Date 2020/4/5 19:05
 * @Version 1.0
 **/
public class VideoFactory {
    public Video getVideoFactory(Class c) {
        Video video = null;
        try {
            video = (Video) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }

    public Video getVideoFactory(String videoName) {
        if ("java".equalsIgnoreCase(videoName)) {
            return new JavaVideo();
        } else if ("web".equalsIgnoreCase(videoName)) {
            return new WebVideo();
        } else {
            return null;
        }
    }
}
