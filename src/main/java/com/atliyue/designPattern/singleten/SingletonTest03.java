package com.atliyue.designPattern.singleten;

/**
 * ����ʽ���̲߳���ȫ��
 * ʵ�ʿ����в�ʹ������ģʽ
 */
public class SingletonTest03 {
    public static void main(String[] args) {
        Singleton3 singleton = Singleton3.getSingleton();
        Singleton3 singleton1 = Singleton3.getSingleton();
        System.out.println(singleton==singleton1);
        System.out.println("singleton��hashCode"+singleton.hashCode());
        System.out.println("singleton1��hashCode"+singleton1.hashCode());
    }

}

class Singleton3{
    //������ʵ��
    private static Singleton3 singleton3;
    //1.˽�й��췽��
    private  Singleton3(){
    }

    //�ṩ�ⲿ���õķ���
    public static Singleton3 getSingleton(){
        if (singleton3==null){
            singleton3 = new Singleton3();
        }
        return singleton3;
    }
}