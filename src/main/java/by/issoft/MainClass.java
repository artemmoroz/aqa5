package by.issoft;

import by.issoft.oop.Car;
import by.issoft.oop.RacingCar;
import by.issoft.oop.TruckCar;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Arrays;
import java.util.List;

@Data
@Accessors(chain = true)
public class MainClass {

    public static void main(String[] args) {
      //  Car car = new Car(435);
//        car.drive();

        RacingCar racingCar = new RacingCar();
        racingCar.drive();
        racingCar.playMusic();

        TruckCar truckCar = new TruckCar(43);
        truckCar.drive();
        truckCar.playMusic();
       // racingCar.race();

//        List<Car> cars = Arrays.asList(car, racingCar);
//        for(Car c: cars){
//            c.drive();
//        }
//        repair(car);
//        repair(racingCar);
    }

    public static void repair(Car car){
        System.out.println("repainr " + car);
    }

}
