package by.issoft.street;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

public interface Calculable extends Cloneable, Serializable {

   double calculateCost();
}
