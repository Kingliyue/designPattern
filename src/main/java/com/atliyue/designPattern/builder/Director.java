package com.atliyue.designPattern.builder;

public class Director {
    private HouseBuilder builder;

    public void setBuilder(HouseBuilder builder) {
        this.builder = builder;
    }

    public Director(HouseBuilder builder) {
        this.builder = builder;
    }


    //建造房子具体交给指挥者
    public House constructHouse(){
        builder.builderBasic();
        builder.builderWall();
        builder.builderRoofed();
       return builder.builder();
    }

}
