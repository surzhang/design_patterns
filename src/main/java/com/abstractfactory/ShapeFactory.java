package com.abstractfactory;

/**
 * @author zyk
 * @version 1.0
 * @fileName ShapeFactory
 * @description :TODO
 * @date 2022/2/8 15:11
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return (Shape) new Circle1();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return (Shape) new Rectangle1();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return (Shape) new Square1();
        }
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
