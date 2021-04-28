package by.issoft.street;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;

@Data
@Accessors(chain = true)
public class CalculableStore2 implements Calculable{

    List<Calculable> calculables = new ArrayList<>();

    public void addCalculable(Calculable calc){
        calculables.add(calc);
    }

    public double calculateCost() {
        return calculables.stream().mapToDouble(x->x.calculateCost()).sum();
    }
}
