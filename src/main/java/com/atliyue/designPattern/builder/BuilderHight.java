package com.atliyue.designPattern.builder;

/**
 * ����ʵ�ֽ���ķ���
 */

public class BuilderHight extends HouseBuilder {

    public void builderBasic() {
        System.out.println("��¥��ػ�");
    }

    public void builderWall() {
        System.out.println("��¥��ǽ");
    }

    public void builderRoofed() {
        System.out.println("��¥���ݶ�");
    }

}
