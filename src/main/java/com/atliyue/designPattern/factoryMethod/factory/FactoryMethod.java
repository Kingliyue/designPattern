package com.atliyue.designPattern.factoryMethod.factory;

import com.atliyue.designPattern.factoryMethod.pizza.Pizza;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * ������������ʵ�����Ĺ������ͽ����жϣ������ഴ������
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
                System.out.println("�˳�����");
                break;
            }

        }while (true);
    }
    private String getPizzaType() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("�����붩�����������ͣ�");
            return bufferedReader.readLine();
        }catch (Exception e){

        }

        return "";
    }
}
