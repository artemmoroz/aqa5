package by.issoft.street;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Flat extends Calculable{

    int number;
    int square;
    int people;

    public Flat(int number, int square, int people) {
        this.number = number;
        this.square = square;
        this.people = people;
    }

    public double calculateCost() {
        return square*people*10;
    }
}
