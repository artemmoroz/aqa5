package by.issoft.street;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
public class Flat implements Calculable{

    int number;
    int square;
    int people;

    public Flat(int number, int square, int people) {
        this.number = number;
        this.square = square;
        this.people = people;
    }

    @Override
    public double calculateCost() {
        return square*people*10;
    }
}
