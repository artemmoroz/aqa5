package by.issoft.street;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Bakery implements Calculable{

    @Override
    public double calculateCost() {
        return 100;
    }
}
