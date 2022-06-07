package com.atliyue.designPattern.singleten;

/**
 * ����ʽ����̬������
 */
public class SingletonTest01 {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleton();
        Singleton singleton1 = Singleton.getSingleton();
        System.out.println(singleton==singleton1);
        System.out.println("singleton��hashCode"+singleton.hashCode());
        System.out.println("singleton1��hashCode"+singleton1.hashCode());
    }

}
class Singleton{
    //1.˽�й��췽��
    private  Singleton(){
    }
    //������ʵ��
    private final static Singleton singleton= new Singleton();
    //�ṩ�ⲿ���õķ���
    public static Singleton getSingleton(){
        return  singleton;
    }
}