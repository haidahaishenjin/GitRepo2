package org.example.factory;

import org.example.controller.TypeController;

/**
 * 定义实例化工厂
 */
public class InstanceFactory {
    /**
     * 定义实例化方法
     * @return
     */
    public TypeController createTypeController(){
        return new TypeController();
    }
}
