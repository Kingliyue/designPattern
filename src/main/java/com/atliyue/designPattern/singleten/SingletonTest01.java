package com.atliyue.designPattern.singleten;

/**
 * 饿汉式（静态变量）
 */
public class SingletonTest01 {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleton();
        Singleton singleton1 = Singleton.getSingleton();
        System.out.println(singleton==singleton1);
        System.out.println("singleton的hashCode"+singleton.hashCode());
        System.out.println("singleton1的hashCode"+singleton1.hashCode());
    }

}
class Singleton{
    //1.私有构造方法
    private  Singleton(){
    }
    //本部类实例
    private final static Singleton singleton= new Singleton();
    //提供外部调用的方法
    public static Singleton getSingleton(){
        return  singleton;
    }
}