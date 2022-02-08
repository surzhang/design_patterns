package com.abstractfactory;

/**
 * @author zyk
 * @version 1.0
 * @fileName Blue
 * @description :TODO
 * @date 2022/2/8 15:10
 */
public class Blue implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
