package com.atliyue.designPattern.builder;

import java.nio.Buffer;

/**
 * 具体实现建造的房子
 */

public class BuilderComm extends HouseBuilder {

    public void builderBasic() {
        System.out.println("打地基");
    }

    public void builderWall() {
        System.out.println("垒墙");
    }

    public void builderRoofed() {
        System.out.println("盖屋顶");
    }

}
