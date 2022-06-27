package com.atliyue.designPattern.builder;

/**
 * 具体实现建造的房子
 */

public class BuilderHight extends HouseBuilder {

    public void builderBasic() {
        System.out.println("高楼打地基");
    }

    public void builderWall() {
        System.out.println("高楼垒墙");
    }

    public void builderRoofed() {
        System.out.println("高楼盖屋顶");
    }

}
