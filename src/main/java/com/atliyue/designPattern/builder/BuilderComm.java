package com.atliyue.designPattern.builder;

import java.nio.Buffer;

/**
 * ����ʵ�ֽ���ķ���
 */

public class BuilderComm extends HouseBuilder {

    public void builderBasic() {
        System.out.println("��ػ�");
    }

    public void builderWall() {
        System.out.println("��ǽ");
    }

    public void builderRoofed() {
        System.out.println("���ݶ�");
    }

}
