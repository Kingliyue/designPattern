package com.atliyue.designPattern.singleten;

/**
 * ����ʽ����̬����飩
 * ģʽ���ã����ǻ�����˷��ڴ�
 *
 */
public class SingletonTest02 {
    public static void main(String[] args) {
        Singleton2 singleton = Singleton2.getSingleton();
        Singleton2 singleton1 = Singleton2.getSingleton();
        System.out.println(singleton==singleton1);
        System.out.println("singleton��hashCode"+singleton.hashCode());
        System.out.println("singleton1��hashCode"+singleton1.hashCode());
    }

}
class Singleton2{
    //1.˽�й��췽��
    private  Singleton2(){
    }
    //������ʵ��
    private static Singleton2 singleton2;
    static {
        singleton2 = new Singleton2();
    }
    //�ṩ�ⲿ���õķ���
    public static Singleton2 getSingleton(){
        return  singleton2;
    }
}