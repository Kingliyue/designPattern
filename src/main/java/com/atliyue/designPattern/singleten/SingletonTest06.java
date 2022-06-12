package com.atliyue.designPattern.singleten;

/**
 * 懒汉式 （静态内部类）
 *
 */
public class SingletonTest06 {
    public static void main(String[] args) {
        Singleton6 singleton = Singleton6.getSingleton();
        Singleton6 singleton1 = Singleton6.getSingleton();
        System.out.println(singleton==singleton1);
        System.out.println("singleton的hashCode"+singleton.hashCode());
        System.out.println("singleton1的hashCode"+singleton1.hashCode());
    }

}

class Singleton6{
    //本部类实例

    //1.私有构造方法
    private  Singleton6(){
    }

    private static class singletonInstance{
        private final  static  Singleton6 SINGLETON_6 = new Singleton6();
    }
    //提供外部调用的方法
    public static  Singleton6 getSingleton(){
        return singletonInstance.SINGLETON_6;
    }
}