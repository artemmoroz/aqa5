package by.issoft.street;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class MainClass {

    public static void main(String[] args) {
        Street lenina = new Street("Lenina");

        AppartmentHouse appartmentHouse = new AppartmentHouse(1);
        appartmentHouse.addCalculable(new Flat(1, 40, 2));
        appartmentHouse.addCalculable(new Flat(2, 50, 3));
        appartmentHouse.addCalculable(new Flat(3, 140, 1));
        appartmentHouse.addCalculable(new Flat(4, 90, 2));
        lenina.addCalculable(appartmentHouse);

        TownHouse townHouse = new TownHouse(2);
        townHouse.addCalculable(new Flat(1, 130, 5));
        townHouse.addCalculable(new Flat(2, 130, 3));
        lenina.addCalculable(townHouse);


        Cottage cottage = new Cottage(3);
        cottage.addCalculable(new Flat(1, 270, 3));
        lenina.addCalculable(cottage);


        Bakery bakery = new Bakery();
        lenina.addCalculable(bakery);

        Office office = new Office();
        lenina.addCalculable(office);

        System.out.println("Total cost for "+lenina.getName() + " is "+lenina.calculateCost());

    }
}
