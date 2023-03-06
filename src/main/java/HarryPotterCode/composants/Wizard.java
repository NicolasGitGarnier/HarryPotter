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
    private int potionDamage;

    private String firstName;
    private String lastName;
    private Pet pet;
    private Wand wand;
    private House house;
    private List<Spell> knownSpells;
    private List<Potion> potions;


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
            wizard.setPotionDamage(potionDamage + 5);
        }
        return wizard;
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
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", wand=" + wand +
                ", house='" + house + '\'' +
                ", pet=" + pet +
                ", health=" + health +
                ", defence=" + defence +
                ", damage=" + damage +
                ", accuracy=" + accuracy +
                ", potionDamage=" + potionDamage +
                ", knownSpells=[" + spells + "]" +
                ", potions=" + potions +
                '}';
    }

    public void defend() {}


}

