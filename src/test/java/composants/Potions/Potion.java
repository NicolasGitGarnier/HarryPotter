package composants.Potions;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Potion {
    private String name;
    private int values; //Represent the int of increasing stats.

}
