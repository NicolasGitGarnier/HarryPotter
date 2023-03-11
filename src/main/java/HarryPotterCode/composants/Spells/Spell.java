package HarryPotterCode.composants.Spells;

import HarryPotterCode.composants.Characters.Wizard;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

@Data
@EqualsAndHashCode(callSuper = true)
public class Spell extends AbstractSpell {
    public Spell(String name, int succesChance) {
        super(name, succesChance);
    }

    // --------------- LearnSpells --------------- //
    public static void learnWingardium(List<Spell> knownSpells) {
        Scanner sc = new Scanner(System.in);
        String spell = null;
        while (spell == null) {
            System.out.println("Enter Wingardium Leviosaaa if you want to learn it :");
            String choice = sc.nextLine();
            if ("Wingardium Leviosaaa".equals(choice)) {
                //SuccesChance = 90. Wizard accuracy = 5. So 95% chance of succed to cast a spell.
                Spell wingardiumLeviosa = new Spell("Wingardium Leviosa", 90);
                knownSpells.add(wingardiumLeviosa);
                spell = choice;
            } else {
                System.out.println("* You failed to learn that spell. *");
            }
        }
        System.out.println("* You have succed to learned the spell Wingardium Leviosa *");
    }

    // --------------- Spell Mechanic(s) --------------- //
    public static boolean castSpell(Spell spell, Wizard wizard){
        int spellCastChance = spell.getSuccesChance() + wizard.getAccuracy(); // Calculating the accuracy + chance cast of the spell.
        int random = new Random().nextInt(spellCastChance); // Calculate the chance to succed the casting of the spell.
        boolean castSucces = false;
        if (random <= spellCastChance){
            castSucces = true;
            System.out.println("* (Your score (if above -> fail) : " + random + "/" + spellCastChance + "."); //For me to see if it works during battle tests
        }else{
            System.out.println("* (Your score (if above -> fail) : " + random + "/" + spellCastChance + "."); //For me to see if it works during battle tests
        }
        return castSucces;
    }
}
