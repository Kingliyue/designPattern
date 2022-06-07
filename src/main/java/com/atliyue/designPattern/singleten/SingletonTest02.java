package com.atliyue.designPattern.singleten;

/**
 * 饿汉式（静态代码块）
 * 模式可用，但是会造成浪费内存
 *
 */
public class SingletonTest02 {
    public static void main(String[] args) {
        Singleton2 singleton = Singleton2.getSingleton();
        Singleton2 singleton1 = Singleton2.getSingleton();
        System.out.println(singleton==singleton1);
        System.out.println("singleton的hashCode"+singleton.hashCode());
        System.out.println("singleton1的hashCode"+singleton1.hashCode());
    }

}
class Singleton2{
    //1.私有构造方法
    private  Singleton2(){
    }
    //本部类实例
    private static Singleton2 singleton2;
    static {
        singleton2 = new Singleton2();
    }
    //提供外部调用的方法
    public static Singleton2 getSingleton(){
        return  singleton2;
    }
}