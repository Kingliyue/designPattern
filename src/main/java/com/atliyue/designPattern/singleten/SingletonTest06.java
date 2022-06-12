package com.atliyue.designPattern.singleten;

/**
 * ����ʽ ����̬�ڲ��ࣩ
 *
 */
public class SingletonTest06 {
    public static void main(String[] args) {
        Singleton6 singleton = Singleton6.getSingleton();
        Singleton6 singleton1 = Singleton6.getSingleton();
        System.out.println(singleton==singleton1);
        System.out.println("singleton��hashCode"+singleton.hashCode());
        System.out.println("singleton1��hashCode"+singleton1.hashCode());
    }

}

class Singleton6{
    //������ʵ��

    //1.˽�й��췽��
    private  Singleton6(){
    }

    private static class singletonInstance{
        private final  static  Singleton6 SINGLETON_6 = new Singleton6();
    }
    //�ṩ�ⲿ���õķ���
    public static  Singleton6 getSingleton(){
        return singletonInstance.SINGLETON_6;
    }
}