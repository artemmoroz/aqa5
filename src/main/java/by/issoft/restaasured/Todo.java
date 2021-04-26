package by.issoft.restaasured;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Todo {

    int userId;
    int id;
    String title;
    boolean completed;

}
