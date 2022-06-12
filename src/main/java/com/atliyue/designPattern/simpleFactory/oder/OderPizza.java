package com.atliyue.designPattern.simpleFactory.oder;

import com.atliyue.designPattern.simpleFactory.factory.SimpleFactory;
import com.atliyue.designPattern.simpleFactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * ������������
 */
public class OderPizza {

    SimpleFactory simpleFactory;

    public OderPizza(SimpleFactory simpleFactory) {
        setFactory(simpleFactory);
    }
    public void setFactory(SimpleFactory simpleFactory){
            this.simpleFactory = simpleFactory;
            Pizza pizza;

        do {
            String pizzaType = getPizzaType();
             pizza = this.simpleFactory.createPizza(pizzaType);
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
