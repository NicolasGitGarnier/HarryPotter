package HarryPotterCode.composants;

import java.util.Scanner;

import static HarryPotterCode.composants.Wizard.levelUp;
import HarryPotterCode.composants.Spell;

public class Battle {
    Scanner sc = new Scanner(System.in);

    private Wizard wizard;
    private Enemy enemy;
    private boolean isFinished = false; //True when the battle is finished

    private void battle(){
        while(!isFinished){
            //Player turn
            System.out.println("Choose your action :\n" +
                    "1. Cast a Spell\n" +
                    "2. Use a potion");
            String choice = sc.nextLine();
            switch(choice){
                case "1" -> {
                    Spell spell = wizard.chooseSpell(wizard.getKnownSpells());
                    Spell.castSpell(spell, wizard);
                    wizard.attack(enemy);
                }
                case "2" -> {
                    //usePotion(); // créé la fonction usepotion
                }
            }
            isDead(wizard, enemy);
            //Enemy turn
            if (!isFinished) {
                enemy.attack(wizard);
                isDead(wizard, enemy);
            }

        }
    }

    private void isDead(Wizard wizard, AbstractEnemy enemy){
        if (wizard.getHealth() <= 0){
            System.out.println("* You have been defeated by " + enemy.getName() +" ! *");
            isFinished = true; // End of the battle
        } else if (enemy.getHealth() <= 0){
            System.out.println("* You have defeated " + enemy.getName() + " ! *");
            levelUp(wizard);
            isFinished = true; // End of the battle
        }
    }
}
