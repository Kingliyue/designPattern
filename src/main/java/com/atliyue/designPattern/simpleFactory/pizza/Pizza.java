package com.atliyue.designPattern.simpleFactory.pizza;

public abstract class Pizza {

    private String name;
    //准备
    public abstract  void pre();
    public   void brok(){
        System.out.println(name+"制作阶段");
    }
    public   void cut(){
        System.out.println(name+"刀切阶段");
    }
    public   void box(){
        System.out.println(name+"打包阶段");
    }
    public void  setName(String name){
        this.name = name;
    }
}
