package com.abstractfactory;

/**
 * @author zyk
 * @version 1.0
 * @fileName AbstractFactory
 * @description :TODO 为 Color 和 Shape 对象创建抽象类来获取工厂。
 * @date 2022/2/8 15:10
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
