package com.zhang.designStudy.principle.openclose;

/**
 * @Description 开闭原则测试实现类
 * @Author ZhanG_b1nG
 * @Date 2020/3/16 21:23
 * @Version 1.0
 **/
public class Course implements ICourse{
    private Integer id;
    private String name;
    private Double price;

    public Course(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }
}
