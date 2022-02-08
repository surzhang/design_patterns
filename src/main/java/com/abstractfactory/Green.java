package com.abstractfactory;

/**
 * @author zyk
 * @version 1.0
 * @fileName Green
 * @description :TODO
 * @date 2022/2/8 15:09
 */
public class Green implements Color{
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
