package org.example.test;

import javafx.application.Application;
import org.example.dao.UserDao;
import org.example.service.UserService;
import org.example.service.UserService02;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start01 {
    public static void main(String[] args) {
        //得到Spring的上下文环境
        ApplicationContext ac=new ClassPathXmlApplicationContext("mmmain.xml");
        //通过id属性值得到指定bean对象
        UserService userservice =(UserService) ac.getBean("userService");
        //调用实例化好的javabean中的方法
        userservice.test();

        UserService02 userservice02 =(UserService02) ac.getBean("userService02");
        userservice02.test();

        UserDao userDao=(UserDao) ac.getBean("userDao");
        userDao.test();



    }
}
