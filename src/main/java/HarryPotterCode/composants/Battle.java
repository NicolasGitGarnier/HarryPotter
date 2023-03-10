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
import lombok.SneakyThrows;

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
        while(!isFinished){ //To define if the battle is finished or not. It is finish when the wizard or enemy is dead.
            //Player turn.
            System.out.println("***\n" + "Your health :" + wizard.getHealth());
            System.out.println(enemy.getName() + " health : " + enemy.getHealth() + "\n" + "***");
            System.out.println("* ----- Your turn ----- *");
            Thread.sleep(2000);
            System.out.println("Choose your action : (Enter a number)\n" +
                    "1. Cast a Spell\n" +
                    "2. Use a potion");
            String choice = sc.nextLine();
            switch(choice){
                case "1" -> {
                    //ChooseSpell in Wizard.java, others spells function in Spell.java
                    Spell spell = wizard.chooseSpell(wizard.getKnownSpells());// Wizard need to choose a spell in his list of spells.
                    boolean castSucces = Spell.castSpell(spell, wizard);// We defined if the wizard succed to cast his spell.
                    if(castSucces){// If he succes, then he attack.
                        wizard.damageCalc(enemy);
                        System.out.println(enemy.getName() + " -" + wizard.damageCalc(enemy) + " damage");
                        Thread.sleep(1000);
                        System.out.println("***\n" + "Your health :" + wizard.getHealth());
                        System.out.println(enemy.getName() + " health : " + enemy.getHealth() + "\n" + "***");
                        Thread.sleep(2000);
                    }
                }
                case "2" -> {
                    //usePotion(); // créé la fonction usepotion
                }
            }
            isDead(wizard, enemy);//Check if battle is finished.
            //Enemy turn.
            if (!isFinished) {
                System.out.println("* ----- Enemy turn  ------ *");
                enemy.damageCalc(wizard);
                System.out.println(wizard.getFirstName() + " " + wizard.getLastName() + " -" + enemy.damageCalc(wizard) + " damage");
                Thread.sleep(1000);
                System.out.println("***\n" + "Your health : " + wizard.getHealth());
                System.out.println(enemy.getName() + " health : " + enemy.getHealth() + "\n" + "***");
                Thread.sleep(2000);
                isDead(wizard, enemy);//Check if battle is finished.
            }

        }
    }

    // --------------- Function(s) used in Battle main code --------------- //
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
