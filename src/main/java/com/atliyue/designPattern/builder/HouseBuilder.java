package com.atliyue.designPattern.builder;

/**
 * 
 */
public abstract class HouseBuilder {
        protected House house = new House();
        public abstract void builderBasic();//´òµØ»ù
        public abstract void builderWall();//ÀÝÇ½
        public abstract void builderRoofed();//¸ÇÎÝ¶¥

        public House builder(){
            return house;
        }

}
