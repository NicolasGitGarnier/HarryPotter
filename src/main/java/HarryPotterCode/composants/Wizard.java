package HarryPotterCode.composants;
import java.util.List;
import java.util.Scanner;

import lombok.*;

import static HarryPotterCode.composants.Wand.getCore;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Wizard extends Character{

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
        setHealth(health);
        setDefence(defence);
        setDamage(damage);
        setAccuracy(accuracy);
        setPotionBonus(potionBonus);
    }

    public static Wizard createWizard(int health, int defence, int damage, int accuracy, int potionDamage, String firstName, String lastName, Pet pet, Wand wand, House house, List<Spell> knownSpells, List<Potion> potions) {
        Wizard wizard = new Wizard(health, defence, damage, accuracy, potionDamage, firstName, lastName, pet, wand, house, knownSpells, potions);
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
            wizard.setPotionBonus(potionDamage + 5);
        }
        return wizard;
    }
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
                int newHealth = wizard.getHealth() + 10;
                wizard.setHealth(newHealth);
                System.out.println("* Your health has been increased to " + newHealth + ". *");
            }
            case 2 -> {
                int newDamage = wizard.getDamage() + 5;
                wizard.setDamage(newDamage);
                System.out.println("* Your damage has been increased to " + newDamage + ". *");
            }
            case 3 -> {
                int newDefense = wizard.getDefence() + 5;
                wizard.setDefence(newDefense);
                System.out.println("* Your defense has been increased to " + newDefense + ". *");
            }
            case 4 -> {
                int newPotionBonus = wizard.getPotionBonus() + 5;
                wizard.setPotionBonus(newPotionBonus);
                System.out.println("* Your potion bonus has been increased to " + newPotionBonus + ". *");
            }
            default -> System.out.println("* Invalid choice. Enter a number. *");
        }
    }

    @Override
    public String toString() {
        StringBuilder spells = new StringBuilder();
        for (Spell spell : knownSpells) {
            spells.append(spell.getName()).append(", ");
        }
        if (spells.length() > 0) {
            spells = new StringBuilder(spells.substring(0, spells.length() - 2));
        }
        return "Wizard{" +
                "firstName = " + firstName +
                ", lastName = " + lastName +
                ", wand = " + wand +
                ", house = " + house  +
                ", pet = " + pet +
                ", health = " + getHealth() +
                ", defence = " + getDefence() +
                ", damage = " + getDamage() +
                ", accuracy = " + getAccuracy() +
                ", potionBonus = " + getPotionBonus() +
                ", knownSpells = " + spells +
                ", potions = " + potions +
                '}';
    }

    public String Stats() {
        StringBuilder spells = new StringBuilder();
        return  "*--------Your Stats--------*" +
                "\n" +
                " Name : " + getFirstName() + " Last Name : " + getLastName() + "\n" +
                " Health : " + getHealth() + "\n" +
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

