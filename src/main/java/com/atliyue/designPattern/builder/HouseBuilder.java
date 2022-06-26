package com.atliyue.designPattern.builder;

/**
 * 
 */
public abstract class HouseBuilder {
        protected House house = new House();
        public abstract void builderBasic();//��ػ�
        public abstract void builderWall();//��ǽ
        public abstract void builderRoofed();//���ݶ�

        public House builder(){
            return house;
        }

}
