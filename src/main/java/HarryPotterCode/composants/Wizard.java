package HarryPotterCode.composants;
import java.util.List;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Wizard extends Character{
    private int health;
    private int defence;
    private int damage;
    private int accuracy;
    private int dodge;
    private int potionDamage;

    private String firstName;
    private String lastName;
    private Pet pet;
    private Wand wand;
    private House house;
    private List<Spell> knownSpells;
    private List<Potion> potions;


    public static Wizard createWizard(int health, int defence, int damage, int accuracy, int dodge, int potionDamage, String firstName, String lastName, Pet pet, Wand wand, House house, List<Spell> knownSpells, List<Potion> potions) {
        Wizard wizard = new Wizard(health, defence, damage, accuracy, dodge, potionDamage, firstName, lastName, pet, wand, house, knownSpells, potions);
        if (house == House.SLYTHERIN || pet == Pet.CAT) {
            wizard.setDamage(damage + 5);
        }
        if (house == House.GRYFFINDOR || pet == Pet.OWL) {
            wizard.setDefence(defence + 5);
        }
        if (house == House.RAVENCLAW || pet == Pet.RAT) {
            wizard.setAccuracy(accuracy + 5);
        }
        if (house == House.HUFFLEPUFF || pet == Pet.TOAD) {
            wizard.setPotionDamage(potionDamage + 5);
        }
        return wizard;
    }

    public void defend() {}
    public void attack() {}

}

