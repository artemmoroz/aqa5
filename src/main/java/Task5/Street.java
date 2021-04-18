import javafx.scene.input.TouchEvent;

import java.util.ArrayList;

public class Street {
    public static void main(String[] args) {
        Townhouse house1 = new Townhouse();
        house1.setPeopleCount(4);
        house1.setS(75.8);
        house1.setFlatNumber(2);
        Flat h1 = (Flat)house1;

        Apartments house2 = new Apartments();
        house2.setPeopleCount(2);
        house2.setS(45.3);
        house2.setFlatNumber(50);
        Flat h2 = (Flat)house2;

        Cottage house3 = new Cottage();
        house3.setPeopleCount(5);
        house3.setS(130.5);
        Flat h3 = (Flat)house3;
        ArrayList<Flat> street = new ArrayList<Flat>();
        street.add(h1);
        street.add(h2);
        street.add(h3);

        double paymentsSum = 0;
        for (Flat house: street){
            double housePayment = house.getPayment(house.getS(), house.getPeopleCount());
            System.out.println(house.getClass().getName() + " " + housePayment);
            paymentsSum +=housePayment;
        }
        System.out.println("Street payments: "+ paymentsSum);

    }
}
