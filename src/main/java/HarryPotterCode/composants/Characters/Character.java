package HarryPotterCode.composants.Characters;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@Getter
@Setter
public class Character {
    private int maxHealth; //Total health by character. Used to reset the health of characters after each battle.

    private int health; //Variable health used in the battle.
    private int defence;
    private int damage;
    private int accuracy;
    private int potionBonus;

    @Setter
    private String name;

    public Character(int maxHealth,int health, int defence, int damage, int accuracy) {
        this.maxHealth = maxHealth;
        this.health = health;
        this.defence = defence;
        this.damage = damage;
        this.accuracy = accuracy;
    }



    public int damageCalc(Character target) {
        int damage;
        if (target instanceof Enemy) {
            // Wizard attack enemy.
            // Defence is a % reduction damage. I took accuracy to add to the calcul of damage. But it is my personal choice.
            // wizard.totalDamage - ( (enemy.defence/100) * wizard.totalDamage )
            // And wizard.totalDamage = wizard.damage + wizard.accuracy
            damage = ( (this.damage + this.accuracy) - ((target.getDefence() / 100) * (this.damage + this.accuracy)) );
        } else {
            // Enemy attack wizard.
            damage = ( this.damage - ((target.getDefence() / 100) * this.damage) ); //enemy.damage - ( (wizard.defence/100) * enemy.damage )
        }
        //target.setHealth( target.getHealth() - damage );
        return damage;
    }
}

