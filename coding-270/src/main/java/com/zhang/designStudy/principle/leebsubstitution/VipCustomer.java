package com.zhang.designStudy.principle.leebsubstitution;

/**
 * vip顾客
 *
 * @Author ZhanG_b1nG
 * @Date 2020/4/4 11:49
 * @Version 1.0
 **/
public class VipCustomer implements ICustomer {
    private String name;
    private String email;

    public VipCustomer() {
    }

    public VipCustomer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getEmail() {
        return this.email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }
}
