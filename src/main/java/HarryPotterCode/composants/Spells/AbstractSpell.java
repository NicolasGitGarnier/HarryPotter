package HarryPotterCode.composants.Spells;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Random;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AbstractSpell {
    private String name;
    private int succesChance;
}
