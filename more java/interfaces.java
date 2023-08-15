package com.company;

public class interfaces {
    public static void main(String[] args) {
        //a group of related methods with empty bodies;
        //no objects of interfaces;
        //keyword "implements " is used when you are implementing interfaces;
        interface Bicycle {
            void applyBrake(int decrement);
            void speedup(int increment);
        }
        class avonCycle implements Bicycle{
            int speed=7;

            @Override
            public void applyBrake(int decrement) {

            }

            public void setSpeed(int speed) {
                this.speed = speed;
            }
        }
    }
}
