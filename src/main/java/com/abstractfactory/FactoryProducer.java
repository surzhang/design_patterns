package com.abstractfactory;

/**
 * @author zyk
 * @version 1.0
 * @fileName FactoryProducer
 * @description :TODO 创建一个工厂创造器/生成器类，通过传递形状或颜色信息来获取工厂。
 * @date 2022/2/8 15:19
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        } else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }
}