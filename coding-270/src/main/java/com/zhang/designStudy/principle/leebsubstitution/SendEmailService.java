package com.zhang.designStudy.principle.leebsubstitution;

/**
 * 邮件发送服务类
 *
 * @Author ZhanG_b1nG
 * @Date 2020/4/4 11:43
 * @Version 1.0
 **/
public class SendEmailService {
    public void sendEmail(ICustomer iCustomer) {
        System.out.println(iCustomer.getName() + " 发送邮件内容：" + iCustomer.getEmail());
    }
}
