package com.atliyue.designPattern.factoryMethod.factory;

import com.atliyue.designPattern.factoryMethod.pizza.CheesePizza;
import com.atliyue.designPattern.factoryMethod.pizza.GreekPizza;
import com.atliyue.designPattern.factoryMethod.pizza.Pizza;

public class ShPizzaFactory extends FactoryMethod {
    Pizza pizza;
    public Pizza createPizza(String pizzaType) {

        if("cheesePizza".equals(pizzaType)){
            pizza = new CheesePizza();
            pizza.setName("上海cheesePizza");
        }else if ("greekPizza".equals(pizzaType) ){
            pizza = new GreekPizza();
            pizza.setName("上海greekPizza");
        }
        return pizza;
    }
}
