package com.atliyue.designPattern.factoryMethod.factory;

import com.atliyue.designPattern.factoryMethod.pizza.Pizza;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 工厂方法（对实例化的工厂类型进行判断，由子类创建对象）
 */
public abstract class FactoryMethod {

    abstract Pizza createPizza(String PizzaType);
    private Pizza pizza;
    public  FactoryMethod(){
        do {
            String pizzaType = getPizzaType();
            pizza = createPizza(pizzaType);
            if(pizza != null){
                pizza.pre();
                pizza.brok();
                pizza.cut();
                pizza.box();
            }else {
                System.out.println("退出程序");
                break;
            }

        }while (true);
    }
    private String getPizzaType() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("请输入订制披萨的类型：");
            return bufferedReader.readLine();
        }catch (Exception e){

        }

        return "";
    }
}
