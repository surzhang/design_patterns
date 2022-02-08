package com.abstractfactory;

import com.factory.Shape;

/**
 * @author zyk
 * @version 1.0
 * @fileName Square
 * @description :TODO
 * @date 2022/2/8 14:58
 */
public class Square1 implements Shape {

    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
