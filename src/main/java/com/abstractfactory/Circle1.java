package com.abstractfactory;

import com.factory.Shape;

/**
 * @author zyk
 * @version 1.0
 * @fileName Circle
 * @description :TODO
 * @date 2022/2/8 14:59
 */
public class Circle1 implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
