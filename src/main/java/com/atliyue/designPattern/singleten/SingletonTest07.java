package com.atliyue.designPattern.singleten;

/**
 * ����ʽ ��ö���ࣩ
 *
 */
public class SingletonTest07 {
    public static void main(String[] args) {
        Singleton7 singleton = Singleton7.SINGLETON_7;
        Singleton7 singleton1 = Singleton7.SINGLETON_7;
        System.out.println(singleton==singleton1);
        singleton.say();
        System.out.println("singleton��hashCode"+singleton);
        System.out.println("singleton1��hashCode"+singleton1.hashCode());
    }

}

 enum Singleton7{
    SINGLETON_7; //�൱�� private final static ʵ��
      private String name;

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public void say(){
        System.out.println("Сɧ��");
    }


 }
