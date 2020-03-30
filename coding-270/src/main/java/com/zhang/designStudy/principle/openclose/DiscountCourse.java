package com.zhang.designStudy.principle.openclose;

import com.zhang.designStudy.utils.MathExtend;

/**
 * @Description 扩展打折课程
 * @Author ZhanG_b1nG
 * @Date 2020/3/16 21:41
 * @Version 1.0
 **/
public class DiscountCourse extends Course {
    public DiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    /**
     * 获取原价
     *
     * @param
     * @Date 2020/3/16 21:48
     * @return java.lang.Double
     * @Author ZhanG_b1nG
     */
    public Double getOriginPrice() {
        return super.getPrice();
    }

    @Override
    public Double getPrice() {
        return MathExtend.multiply(super.getPrice(), 0.8);
    }
}
