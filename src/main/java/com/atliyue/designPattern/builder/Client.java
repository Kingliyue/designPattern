package com.atliyue.designPattern.builder;

public class Client {
    public static void main(String[] args) {
        Director director = new Director(new BuilderComm());
        House house = director.constructHouse();

        System.out.println(house);
        StringBuilder stringBuilder = new StringBuilder();

    }
}
