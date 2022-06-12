package com.atliyue.designPattern.simpleFactory.factory;

import com.atliyue.designPattern.simpleFactory.pizza.CheesePizza;
import com.atliyue.designPattern.simpleFactory.pizza.GreekPizza;
import com.atliyue.designPattern.simpleFactory.pizza.Pizza;

import java.util.Scanner;

/**
 * 简单工厂（对象的逻辑判断）
 */
public class SimpleFactory {
    private Pizza pizza;
    public Pizza createPizza(String pizzaType){
        if("cheesePizza".equals(pizzaType)){
            pizza = new CheesePizza();
            pizza.setName("中国的披萨");
        }else if ("greekPizza".equals(pizzaType)){
            pizza = new GreekPizza();
            pizza.setName("外国的披萨");
        }
        return pizza;
    }


}
