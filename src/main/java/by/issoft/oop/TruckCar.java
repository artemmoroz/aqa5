package by.issoft.oop;

import lombok.Data;
import lombok.experimental.Accessors;


public class TruckCar extends Car{

    int tankLevel;

    public TruckCar(int tankLevel) {
        super(tankLevel);
    }

    @Override
    public void playMusic() {
        System.out.println("no music");
    }

    @Override
    protected void childMethod() {
        System.out.println("----TRUCK-----");
    }


}
