package com.atliyue.designPattern.singleten;

/**
 * 懒汉式（线程安全 加锁）
 * 实际开发中不使用这种模式(效率太低)
 */
public class SingletonTest04_2 {
    public static void main(String[] args) {
        Singleton4_2 singleton = Singleton4_2.getSingleton();
        Singleton4_2 singleton1 = Singleton4_2.getSingleton();
        System.out.println(singleton==singleton1);
        System.out.println("singleton的hashCode"+singleton.hashCode());
        System.out.println("singleton1的hashCode"+singleton1.hashCode());
    }

}

class Singleton4_2{
    //本部类实例
    private static Singleton4_2 singleton4_2;
    //1.私有构造方法
    private  Singleton4_2(){
    }

    //提供外部调用的方法
    public static synchronized  Singleton4_2 getSingleton(){
        if (singleton4_2==null){
            singleton4_2 = new Singleton4_2();
        }

        return singleton4_2;
    }
}