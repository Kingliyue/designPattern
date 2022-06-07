package com.atliyue.designPattern.singleten;

/**
 * ����ʽ���̰߳�ȫ ������
 * ʵ�ʿ����в�ʹ������ģʽ(Ч��̫��)
 */
public class SingletonTest04 {
    public static void main(String[] args) {
        Singleton4 singleton = Singleton4.getSingleton();
        Singleton4 singleton1 = Singleton4.getSingleton();
        System.out.println(singleton==singleton1);
        System.out.println("singleton��hashCode"+singleton.hashCode());
        System.out.println("singleton1��hashCode"+singleton1.hashCode());
    }

}

class Singleton4{
    //������ʵ��
    private static Singleton4 singleton4;
    //1.˽�й��췽��
    private  Singleton4(){
    }

    //�ṩ�ⲿ���õķ���
    public static  Singleton4 getSingleton(){
        synchronized(Singleton4.class){
        if (singleton4==null){
            singleton4 = new Singleton4();
        }

        }
        return singleton4;
    }
}