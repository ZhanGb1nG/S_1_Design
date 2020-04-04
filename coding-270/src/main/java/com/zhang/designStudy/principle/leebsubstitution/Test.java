package com.zhang.designStudy.principle.leebsubstitution;

/**
 * 里氏替换原则学习测试类<br>
 * 开闭原则的重要实现之一
 *
 * @Author ZhanG_b1nG
 * @Date 2020/4/4 11:43
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        SendEmailService sendEmailService = new SendEmailService();
        ICustomer iCustomer = new CommonCustomer("张胖胖", "盼花儿我爱你！");
        sendEmailService.sendEmail(iCustomer);
        sendEmailService.sendEmail(new VipCustomer("张兵兵", "盼花儿我爱你！"));
    }
}
