package by.issoft.street;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Street extends CalculableStore {

    String name;

    public Street(String name) {
        this.name = name;
    }
}
