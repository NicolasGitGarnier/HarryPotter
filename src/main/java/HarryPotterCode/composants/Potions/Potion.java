package HarryPotterCode.composants.Potions;

import HarryPotterCode.composants.Characters.Wizard;
import HarryPotterCode.composants.Spells.Spell;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.Scanner;

@Data
@AllArgsConstructor
public class Potion {
    private String name;
    private int values; //Represent the int of increasing stats.

}
