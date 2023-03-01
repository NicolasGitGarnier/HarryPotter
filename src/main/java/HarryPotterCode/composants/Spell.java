package HarryPotterCode.composants;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;
import java.util.Scanner;

@Data
@EqualsAndHashCode(callSuper = true)
public class Spell extends AbstractSpell{
    public Spell(String name, int energyCost) {
        super(name, energyCost);
    }

    public static void learnWingardium(List<Spell> knownSpells) {
        Scanner sc = new Scanner(System.in);
        String spell = null;
        while (spell == null) {
            System.out.println("Enter Wingardium Leviosa if you want to learn it :");
            String choice = sc.nextLine();
            switch (choice) {
                case "Wingardium Leviosa":
                    Spell wingardiumLeviosa = new Spell("Wingardium Leviosa", 2);
                    knownSpells.add(wingardiumLeviosa);
                    spell = choice;
                    break;
                default:
                    System.out.println("You failed to learn that spell.");
                    break;
            }
        }
        System.out.println("You have succed to learned the spell: " + spell);
    }
}
