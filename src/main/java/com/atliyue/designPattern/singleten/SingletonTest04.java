package com.atliyue.designPattern.singleten;

/**
 * 懒汉式（线程安全 加锁）
 * 实际开发中不使用这种模式(效率太低)
 */
public class SingletonTest04 {
    public static void main(String[] args) {
        Singleton4 singleton = Singleton4.getSingleton();
        Singleton4 singleton1 = Singleton4.getSingleton();
        System.out.println(singleton==singleton1);
        System.out.println("singleton的hashCode"+singleton.hashCode());
        System.out.println("singleton1的hashCode"+singleton1.hashCode());
    }

}

class Singleton4{
    //本部类实例
    private static Singleton4 singleton4;
    //1.私有构造方法
    private  Singleton4(){
    }

    //提供外部调用的方法
    public static  Singleton4 getSingleton(){
        synchronized(Singleton4.class){
        if (singleton4==null){
            singleton4 = new Singleton4();
        }

        }
        return singleton4;
    }
}