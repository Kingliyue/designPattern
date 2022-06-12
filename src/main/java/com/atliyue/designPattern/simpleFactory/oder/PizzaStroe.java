package com.atliyue.designPattern.simpleFactory.oder;

import com.atliyue.designPattern.simpleFactory.factory.SimpleFactory;

public class PizzaStroe {
    public static void main(String[] args) {
        new OderPizza(new SimpleFactory());
    }
}
