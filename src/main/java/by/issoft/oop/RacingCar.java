package by.issoft.oop;

import lombok.Data;
import lombok.experimental.Accessors;

//@Data
//@Accessors(chain = true)
public class RacingCar extends Car{


    public RacingCar() {
        super(500);
    }

    @Override
    public void playMusic() {
        System.out.println("playing cd");
    }

    @Override
    protected void childMethod() {
        System.out.println("***RAICING***");
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("4363463");
    }
}
