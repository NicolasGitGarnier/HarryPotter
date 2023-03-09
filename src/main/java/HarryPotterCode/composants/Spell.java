package HarryPotterCode.composants;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

@Data
@EqualsAndHashCode(callSuper = true)
public class Spell extends AbstractSpell{
    public Spell(String name, int succesChance) {
        super(name, succesChance);
    }

    public static void learnWingardium(List<Spell> knownSpells) {
        Scanner sc = new Scanner(System.in);
        String spell = null;
        while (spell == null) {
            System.out.println("Enter Wingardium Leviosaaa if you want to learn it :");
            String choice = sc.nextLine();
            if ("Wingardium Leviosaaa".equals(choice)) {
                Spell wingardiumLeviosa = new Spell("Wingardium Leviosa", new Random().nextInt(98) + 3); /* random number between 97 and 100 */
                knownSpells.add(wingardiumLeviosa);
                spell = choice;
            } else {
                System.out.println("* You failed to learn that spell. *");
            }
        }
        System.out.println("* You have succed to learned the spell Wingardium Leviosa *");
    }

}
