package com.atliyue.designPattern.simpleFactory.pizza;

public class CheesePizza extends Pizza {

    @Override
    public void pre() {
        System.out.println("中国披萨准备阶段");
    }


}
