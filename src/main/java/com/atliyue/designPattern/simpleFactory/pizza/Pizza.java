package com.atliyue.designPattern.simpleFactory.pizza;

public abstract class Pizza {

    private String name;
    //׼��
    public abstract  void pre();
    public   void brok(){
        System.out.println(name+"�����׶�");
    }
    public   void cut(){
        System.out.println(name+"���н׶�");
    }
    public   void box(){
        System.out.println(name+"����׶�");
    }
    public void  setName(String name){
        this.name = name;
    }
}
