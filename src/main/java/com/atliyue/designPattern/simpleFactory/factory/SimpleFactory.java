package com.atliyue.designPattern.simpleFactory.factory;

import com.atliyue.designPattern.simpleFactory.pizza.CheesePizza;
import com.atliyue.designPattern.simpleFactory.pizza.GreekPizza;
import com.atliyue.designPattern.simpleFactory.pizza.Pizza;

import java.util.Scanner;

/**
 * �򵥹�����������߼��жϣ�
 */
public class SimpleFactory {
    private Pizza pizza;
    public Pizza createPizza(String pizzaType){
        if("cheesePizza".equals(pizzaType)){
            pizza = new CheesePizza();
            pizza.setName("�й�������");
        }else if ("greekPizza".equals(pizzaType)){
            pizza = new GreekPizza();
            pizza.setName("���������");
        }
        return pizza;
    }


}
