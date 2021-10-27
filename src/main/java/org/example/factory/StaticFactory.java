package org.example.factory;


import org.example.service.TypeService;

/**
 * 定义静态工厂类
 *
 */
public class StaticFactory {
    /**
     * 定义对应的静态方法
     * @return
     */
    public static TypeService createService(){
        return new TypeService();
    }
}
