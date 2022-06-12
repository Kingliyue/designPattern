package com.atliyue.designPattern.simpleFactory.pizza;

public class GreekPizza extends Pizza {

    @Override
    public void pre() {
        System.out.println("外国披萨准备阶段");
    }


}
