package com.atliyue.designPattern.factoryMethod.factory;

import com.atliyue.designPattern.factoryMethod.pizza.CheesePizza;
import com.atliyue.designPattern.factoryMethod.pizza.GreekPizza;
import com.atliyue.designPattern.factoryMethod.pizza.Pizza;

public class BjPizzaFactory extends FactoryMethod {

    @Override
    public Pizza createPizza(String pizzaType) {
        Pizza pizza = null;
        if("cheesePizza".equals(pizzaType)){
            pizza = new CheesePizza();
            pizza.setName("北京cheesePizza");
        }else if ("greekPizza".equals(pizzaType) ){
            pizza = new GreekPizza();
            pizza.setName("北京greekPizza");
        }
        return pizza;
    }
}
