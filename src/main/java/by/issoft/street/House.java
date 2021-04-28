package by.issoft.street;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;

@Data
@Accessors(chain = true)
public abstract class House extends CalculableStore {

    int number;
    int coefficient;


    public House(int number, int coefficient) {
        this.number = number;
        this.coefficient = coefficient;
    }

    @Override
    public double calculateCost() {
        return super.calculateCost()*coefficient;
    }
}
