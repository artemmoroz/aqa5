package by.issoft.street;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public abstract class Calculable {

    public abstract double calculateCost();
}
