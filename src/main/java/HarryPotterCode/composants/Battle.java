package HarryPotterCode.composants;

import java.util.Scanner;

import static HarryPotterCode.composants.Wizard.levelUp;

public class Battle {
    Scanner sc = new Scanner(System.in);

    /*private final Wizard wizard;
    private final Enemy enemy;*/
    private boolean isFinished = false; //True when the battle is finished

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
