package by.issoft;

import javafx.beans.property.ReadOnlyListWrapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.*;

@Data
@Accessors(chain = true)
public class Collections {


    public static void main(String[] args) {
        Map<String, String> parking = new HashMap<>();
        parking.put("A73", "7472-iu7");
        parking.put("A78", "5479-iu7");
        parking.put("A2", "8595-iu7");

        System.out.println(parking);

        String car1 = parking.get("A78");
        System.out.println(car1);

        parking.remove("A73");

        System.out.println(parking);

        parking.containsKey("A2");
        parking.containsValue("3525-yr7");

        for(String key: parking.keySet()){
            System.out.println(key);
            String car = parking.get(key);
        }

        for(String value: parking.values()){

        }

        for(Map.Entry<String, String> entry: parking.entrySet()){
            System.out.println("*******");
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("*******");
        }



    }

    @Data
    @AllArgsConstructor
    public static class ParkingPlace{
        String num;
        String carNum;
    }

    public static void main44(String[] args) {
        List<String> parkingPlaces = new ArrayList<>();
        List<String> cars = new ArrayList<>();

        //driving
        parkingPlaces.add("A73");
        cars.add("7464-io7");

        //get
        int inx = parkingPlaces.indexOf("A73");
        String car = cars.get(inx);
        ///------------
        List<ParkingPlace> pp = new ArrayList<>();
        pp.add(new ParkingPlace("A73", "7464-io7"));

    }


    public static void main2(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Artem");


        List<String> list2 = new ArrayList<>();
        list1.addAll(list2);
        list1.get(0);
        list1.remove("Vasja");
        list1.contains("Vasja");

        List<String> list3 = new ArrayList<>(Arrays.asList("Artem", "Vasja", "Kolja"));
        list3.add("XXX");

        for (int i = 0; i < list3.size(); i++) {
            String item = list3.get(i);
            System.out.println(item);
        }

        for (String item: list3){
            System.out.println(item);
        }





    }
}
