package com.atliyue.designPattern.builder;

public class Client {
    public static void main(String[] args) {
        Director director = new Director(new BuilderComm());
        House house = director.constructHouse();

        System.out.println(house);
        System.out.println("__________________________________");

        director.setBuilder(new BuilderHight());
        House house1 = director.constructHouse();
        System.out.println(house1);

    }
}
