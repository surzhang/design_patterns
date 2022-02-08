package com.factory;

/**
 * @author zyk
 * @version 1.0
 * @fileName ShapeFactory
 * @description :TODO 创建一个工厂，生成基于给定信息的实体类的对象。
 * @date 2022/2/8 15:00
 */
public class ShapeFactory {
    //使用 getShape 方法获取形状类型的对象
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
