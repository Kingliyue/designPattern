package com.atliyue.designPattern.singleten;

/**
 * ����ʽ���̰߳�ȫ ˫�ؼ�飩
 * ʵ�ʿ����в�ʹ������ģʽ(Ч��̫��)
 */
public class SingletonTest05 {
    public static void main(String[] args) {
        Singleton5 singleton = Singleton5.getSingleton();
        Singleton5 singleton1 = Singleton5.getSingleton();
        System.out.println(singleton==singleton1);
        System.out.println("singleton��hashCode"+singleton.hashCode());
        System.out.println("singleton1��hashCode"+singleton1.hashCode());
    }

}

class Singleton5{
    //������ʵ��
    private static volatile Singleton5 singleton5;
    //1.˽�й��췽��
    private  Singleton5(){
    }

    //�ṩ�ⲿ���õķ���
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