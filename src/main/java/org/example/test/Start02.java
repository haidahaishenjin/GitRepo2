package org.example.test;

import org.example.controller.TypeController;
import org.example.dao.TypeDao;
import org.example.dao.UserDao;
import org.example.service.TypeService;
import org.example.service.UserService;
import org.example.service.UserService02;
import org.springframework.beans.TypeConverter;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Type;

/**
 * IOC 容器 Bean对象的实例化方式
 * 1. 构造器实例化
 *      Bean对象需要提供空构造
 * 2.静态工厂实例化
 * 3.实例化工厂实例化
 */
public class Start02 {
    public static void main(String[] args) {

        BeanFactory factory = new ClassPathXmlApplicationContext("spring02.xml");
        //构造器实现
        TypeDao typeDao=(TypeDao) factory.getBean("typeDao");
        typeDao.test();

        //静态工厂实例化
        TypeService typeService= (TypeService) factory.getBean("typeService");
        typeService.test();

        //实例化工厂实例化
        TypeController typeController=(TypeController) factory.getBean("typeController");
        typeController.test();

    }
}
