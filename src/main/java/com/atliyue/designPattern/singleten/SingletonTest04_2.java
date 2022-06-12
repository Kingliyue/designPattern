package com.atliyue.designPattern.singleten;

/**
 * ����ʽ���̰߳�ȫ ������
 * ʵ�ʿ����в�ʹ������ģʽ(Ч��̫��)
 */
public class SingletonTest04_2 {
    public static void main(String[] args) {
        Singleton4_2 singleton = Singleton4_2.getSingleton();
        Singleton4_2 singleton1 = Singleton4_2.getSingleton();
        System.out.println(singleton==singleton1);
        System.out.println("singleton��hashCode"+singleton.hashCode());
        System.out.println("singleton1��hashCode"+singleton1.hashCode());
    }

}

class Singleton4_2{
    //������ʵ��
    private static Singleton4_2 singleton4_2;
    //1.˽�й��췽��
    private  Singleton4_2(){
    }

    //�ṩ�ⲿ���õķ���
    public static synchronized  Singleton4_2 getSingleton(){
        if (singleton4_2==null){
            singleton4_2 = new Singleton4_2();
        }

        return singleton4_2;
    }
}