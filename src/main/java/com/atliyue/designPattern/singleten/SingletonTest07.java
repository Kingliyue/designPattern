package com.atliyue.designPattern.singleten;

/**
 * 懒汉式 （枚举类）
 *
 */
public class SingletonTest07 {
    public static void main(String[] args) {
        Singleton7 singleton = Singleton7.SINGLETON_7;
        Singleton7 singleton1 = Singleton7.SINGLETON_7;
        System.out.println(singleton==singleton1);
        singleton.say();
        System.out.println("singleton的hashCode"+singleton);
        System.out.println("singleton1的hashCode"+singleton1.hashCode());
    }

}

 enum Singleton7{
    SINGLETON_7; //相当于 private final static 实例
      private String name;

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public void say(){
        System.out.println("小骚逼");
    }


 }
