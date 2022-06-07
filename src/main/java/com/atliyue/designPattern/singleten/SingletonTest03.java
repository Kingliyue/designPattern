package com.atliyue.designPattern.singleten;

/**
 * 懒汉式（线程不安全）
 * 实际开发中不使用这种模式
 */
public class SingletonTest03 {
    public static void main(String[] args) {
        Singleton3 singleton = Singleton3.getSingleton();
        Singleton3 singleton1 = Singleton3.getSingleton();
        System.out.println(singleton==singleton1);
        System.out.println("singleton的hashCode"+singleton.hashCode());
        System.out.println("singleton1的hashCode"+singleton1.hashCode());
    }

}

class Singleton3{
    //本部类实例
    private static Singleton3 singleton3;
    //1.私有构造方法
    private  Singleton3(){
    }

    //提供外部调用的方法
    public static Singleton3 getSingleton(){
        if (singleton3==null){
            singleton3 = new Singleton3();
        }
        return singleton3;
    }
}