package HarryPotterCode.composants.Characters;
import java.util.List;
import java.util.Scanner;

import HarryPotterCode.composants.*;
import HarryPotterCode.composants.Potions.Potion;
import HarryPotterCode.composants.Spells.Spell;
import HarryPotterCode.composants.WandStuff.Wand;
import HarryPotterCode.composants.Others.House;
import HarryPotterCode.composants.Others.Pet;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Wizard extends Character {
    private String firstName;
    private String lastName;
    private Pet pet;
    private Wand wand;
    private House house;
    private List<Spell> knownSpells;
    private List<Potion> potions;

    public Wizard(int health, int defence, int damage, int accuracy, int potionBonus, String firstName, String lastName, Pet pet, Wand wand, House house, List<Spell> knownSpells, List<Potion> potions) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pet = pet;
        this.wand = wand;
        this.house = house;
        this.knownSpells = knownSpells;
        this.potions = potions;
        setMaxHealth(health);
        setDefence(defence);
        setDamage(damage);
        setAccuracy(accuracy);
        setPotionBonus(potionBonus);
    }

    public static Wizard createWizard(int health, int defence, int damage, int accuracy, int potionBonus, String firstName, String lastName, Pet pet, Wand wand, House house, List<Spell> knownSpells, List<Potion> potions) {
        Wizard wizard = new Wizard(health, defence, damage, accuracy, potionBonus, firstName, lastName, pet, wand, house, knownSpells, potions);
        if (house == House.SLYTHERIN) {
            wizard.setDamage(damage + 5);
        }
        if (house == House.GRYFFINDOR) {
            wizard.setDefence(defence + 5);
        }
        if (house == House.RAVENCLAW) {
            wizard.setAccuracy(accuracy + 5);
        }
        if (house == House.HUFFLEPUFF) {
            wizard.setPotionBonus(potionBonus + 5);
        }
        if (pet == Pet.OWL) { // marche pas les pets jsp pourquoi
            wizard.setMaxHealth(health + 10);
        }
        if (pet == Pet.RAT) {
            wizard.setAccuracy(accuracy + 5);
        }
        if (pet == Pet.CAT) {
            wizard.setDamage(damage + 5);
        }
        if (pet == Pet.TOAD) {
            wizard.setPotionBonus(potionBonus + 5);
        }
        return wizard;
    }
    public void attack(Character target) throws InterruptedException {
        Battle battle = new Battle(this, (Enemy) target);
        battle.start();
    }

    // --------------- Spell --------------- //
    public Spell chooseSpell(List<Spell> knownSpells) { //Choose a spell use in battle loop.
        Scanner sc = new Scanner(System.in);
        System.out.println("* Choose a spell to cast: (Enter a number) *");
        int index = 1; // Start at 1, so the choices start with 1. and not 0.
        for (Spell spell : knownSpells) { //Choice like this : 1. Wingardium Leviosa.
            System.out.println(index++ + ". " + spell.getName());
        }
        int choice = sc.nextInt();//Look for a number as an answer.
        return knownSpells.get(choice - 1);// -1 to select the right choice according to the user because List start at indices 0.
    }

    // --------------- Potion --------------- //
    public Potion choosePotion(List<Potion> potions) { //Choose a potion use in battle loop.
        Scanner sc = new Scanner(System.in);
        System.out.println("* Choose a potion to use: (Enter a number) *");
        int index = 1; // Start at 1, so the choices start with 1. and not 0.
        for (Potion potion : potions) { //Choice like this : 1. PotionName
            System.out.println(index++ + ". " + potion.getName());
        }
        int choice = sc.nextInt();//Look for a number as an answer.
        return potions.get(choice - 1);// -1 to select the right choice according to the user because List start at indices 0.
    }
    // --------------- Levels --------------- //
    public static void levelUp(Wizard wizard) {
        Scanner sc = new Scanner(System.in);
        System.out.println("* Congrat's, choose the stat you want to level up : (Enter a number) *");
        System.out.println("1. Health\n" +
                "2. Damage\n" +
                "3. Defense\n" +
                "4. Potion Bonus Efficacy");
        int choice = sc.nextInt();
        switch (choice) {
            case 1 -> {
                int newHealth = wizard.getMaxHealth() + 10;
                wizard.setMaxHealth(newHealth);
                System.out.println("* Your health has been increased by 10. *");
                System.out.println(wizard.Stats());
            }
            case 2 -> {
                int newDamage = wizard.getDamage() + 5;
                wizard.setDamage(newDamage);
                System.out.println("* Your damage has been increased to by 5. *");
                System.out.println(wizard.Stats());
            }
            case 3 -> {
                int newDefense = wizard.getDefence() + 5;
                wizard.setDefence(newDefense);
                System.out.println("* Your defense has been increased by 5. *");
                System.out.println(wizard.Stats());
            }
            case 4 -> {
                int newPotionBonus = wizard.getPotionBonus() + 5;
                wizard.setPotionBonus(newPotionBonus);
                System.out.println("* Your potion bonus has been increased by 5. *");
                System.out.println(wizard.Stats());
            }
            default -> System.out.println("* Invalid choice. Enter a number. *");
        }
    }

    // --------------- Stats --------------- //
    public String Stats() {
        StringBuilder spells = new StringBuilder();
        return  "*--------Your Stats--------*" +
                "\n" +
                " Name and Last Name : " + getFirstName() + " " + getLastName() + "\n" +
                " Health : " + getMaxHealth() + "\n" +
                " Defence : " + getDefence() + "\n" +
                " Damage : " + getDamage() + "\n" +
                " Accuracy : " + getAccuracy() + "\n" +
                " Potion Bonus Efficacity : " + getPotionBonus() + "\n" +
                " House : " + getHouse() + "\n" +
                " Pet : " + getPet() + "\n" +
                " Wand : " + getWand() + "\n" +
                "*--------------------------*" ;
    }

    public void defend() {}

}

