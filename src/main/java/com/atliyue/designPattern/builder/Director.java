package com.atliyue.designPattern.builder;

public class Director {
    private BuilderComm builder;

    public void setBuilder(BuilderComm builder) {
        this.builder = builder;
    }

    public Director(BuilderComm builder) {
        this.builder = builder;
    }


    //���췿�Ӿ��彻��ָ����
    public House constructHouse(){
        builder.builderBasic();
        builder.builderWall();
        builder.builderRoofed();
       return builder.builder();
    }

}
