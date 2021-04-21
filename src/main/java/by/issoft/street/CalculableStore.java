package by.issoft.street;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;

@Data
@Accessors(chain = true)
public class CalculableStore extends Calculable{

    List<Calculable> calculables = new ArrayList<>();

    public void addCalculable(Calculable house){
        calculables.add(house);
    }

    public double calculateCost() {
        return calculables.stream().mapToDouble(h->h.calculateCost()).sum();
    }
}
