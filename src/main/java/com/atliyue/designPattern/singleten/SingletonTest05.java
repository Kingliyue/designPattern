package com.atliyue.designPattern.singleten;

/**
 * 懒汉式（线程安全 双重检查）
 * 实际开发中不使用这种模式(效率太低)
 */
public class SingletonTest05 {
    public static void main(String[] args) {
        Singleton5 singleton = Singleton5.getSingleton();
        Singleton5 singleton1 = Singleton5.getSingleton();
        System.out.println(singleton==singleton1);
        System.out.println("singleton的hashCode"+singleton.hashCode());
        System.out.println("singleton1的hashCode"+singleton1.hashCode());
    }

}

class Singleton5{
    //本部类实例
    private static volatile Singleton5 singleton5;
    //1.私有构造方法
    private  Singleton5(){
    }

    //提供外部调用的方法
    public static  Singleton5 getSingleton(){

        if (singleton5==null){
            synchronized(Singleton5.class){
                if(singleton5 == null){
                    singleton5 = new Singleton5();
                }
            }

        }
        return singleton5;
    }
}