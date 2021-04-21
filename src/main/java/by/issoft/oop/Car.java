package by.issoft.oop;

import lombok.Data;

//@Data
public abstract class Car {

    protected int tankLevel = 436;

    public Car(int tankLevel) {
        this.tankLevel = tankLevel;
    }


    public abstract void playMusic();

    public void drive(){
        tankLevel = tankLevel -32;
        if(tankLevel >0){
            childMethod();
            System.out.println(this.getClass()
                    .getSimpleName() + " drive");
        }
    }

    protected abstract void childMethod();

    protected void refill(){
        System.out.println("xxxx");
    }

    public void setTankLevel(int tankLevel) {
        this.tankLevel = tankLevel;
    }
}
