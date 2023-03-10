package HarryPotterCode.composants;

import java.util.Scanner;

import static HarryPotterCode.composants.Characters.Wizard.levelUp;

import HarryPotterCode.composants.Characters.AbstractEnemy;
import HarryPotterCode.composants.Characters.Enemy;
import HarryPotterCode.composants.Characters.Wizard;
import HarryPotterCode.composants.Spells.Spell;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Battle {
    Scanner sc = new Scanner(System.in);
    private Wizard wizard;
    private Enemy enemy;
    private boolean isFinished = false; //True when the battle is finished.

    // --------------- Battle main code --------------- //
    public Battle(Wizard wizard, Enemy enemy){ //Used in attack in Wizard.java
        this.wizard = wizard;
        this.enemy = enemy;
    }

    public void start() throws InterruptedException {
        wizard.setHealth(wizard.getMaxHealth()); //We use health as a temporary variable of the health during the battle.
        enemy.setHealth(enemy.getMaxHealth());// So this health is accurate only inside battles
        System.out.println("* ----- Overall stats ----- *");
        System.out.println("Your health : " + wizard.getHealth());
        System.out.println(enemy.getName() + " health : " + enemy.getHealth());
        System.out.println("* ------------------------- *");
        while(!isFinished){ //To define if the battle is finished or not. It is finish when the wizard or enemy is dead.
            // --------------- Player turn --------------- //
            PlayerTurn();
            // --------------- Enemy turn --------------- //
            EnemyTurn();
        }
    }

    // --------------- Functions used in Battle main code --------------- //
    private void PlayerTurn() throws InterruptedException{
        System.out.println("");
        Thread.sleep(2000);
        System.out.println("* ----- Your turn ----- *");
        int choice; //Force the user to enter 1 or 2, unless it doesn't work.
        do {
            System.out.println("Choose your action : (Enter a number)\n" +
                    "1. Cast a Spell\n" +
                    "2. Use a potion");
            while (!sc.hasNextInt()) {
                System.out.println("Error, please enter 1 or 2.");
                sc.next();
            }
            choice = sc.nextInt();
        } while (choice != 1 && choice != 2);
        sc.nextLine();
        switch(choice){ //Action depending on the choice of the user
            case 1 -> {
                CastSpell(); //Cast a spell
            }
            case 2 -> {
                UsePotion(); //Use a potion
            }
        }
        isDead(wizard, enemy);//Check if battle is finished.
    }
    private void EnemyTurn() throws InterruptedException {
        if (!isFinished) {
            System.out.println("");
            System.out.println("* ----- Enemy turn  ------ *");
            System.out.println("* " + enemy.getName() + " attacked you ! *");
            enemy.damageCalc(wizard);
            System.out.println(wizard.getFirstName() + " " + wizard.getLastName() + " -" + enemy.damageCalc(wizard) + " damage");
            wizard.setHealth(wizard.getHealth() - enemy.damageCalc(wizard));
            Thread.sleep(1000);
            System.out.println("     ***\n" + "Your health : " + wizard.getHealth());
            System.out.println(enemy.getName() + " health : " + enemy.getHealth() + "\n" + "     ***");
            Thread.sleep(2000);
            isDead(wizard, enemy);//Check if battle is finished.
        }
    }
    private void CastSpell() throws InterruptedException {
        //ChooseSpell in Wizard.java, others spells function in Spell.java
        Spell spell = wizard.chooseSpell(wizard.getKnownSpells());// Wizard need to choose a spell in his list of spells.
        boolean castSucces = Spell.castSpell(spell, wizard);// We defined if the wizard succed to cast his spell.
        if(castSucces){// If he succes to cast the spell he attack.
            if(spell.getName().equals("Wingardium Leviosa")) { // If he uses Wingardium Leviosa.
                System.out.println("* You levitate an eavy object over " + enemy.getName() + "'s head and... *");
                Thread.sleep(500);
                System.out.println("*  ! BOUM ! *");
            }
            wizard.damageCalc(enemy); //Calculate damages
            System.out.println(enemy.getName() + " -" + wizard.damageCalc(enemy) + " damage");
            enemy.setHealth(enemy.getHealth() - wizard.damageCalc(enemy));//Modification of the Health of the enemy.
            Thread.sleep(1000);
            System.out.println("     ***\n" + "Your health :" + wizard.getHealth());
            System.out.println(enemy.getName() + " health : " + enemy.getHealth() + "\n" + "     ***");
            Thread.sleep(2000);
        }else{
            System.out.println("* You missed ... *");
        }
    }
    private void UsePotion() throws InterruptedException {
        //To Do
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
