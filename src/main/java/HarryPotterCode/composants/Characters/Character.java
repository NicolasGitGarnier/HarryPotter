package HarryPotterCode.composants.Characters;

import lombok.*;

import java.util.Random;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Character {
    private int maxHealth; //Total health by character. Used to reset the health of characters after each battle.
    private int health; //Variable health used in the battle.
    private float defence;
    private int damage;
    private int accuracy;

    @Setter
    private String name;


    public int damageCalc(Character target) {
        int damage;

        if (target instanceof Enemy) {
            // Wizard attack enemy.
            // Defence is a % reduction damage. I took accuracy to add to the calcul of damage. But it is my personal choice.
            damage = Math.round( (this.damage + this.accuracy) - ( (this.damage + this.accuracy) * target.getDefence()) );
        } else {
            // Enemy attack wizard.
            damage = Math.round( (this.damage + this.accuracy) - ( (this.damage + this.accuracy) * target.getDefence()) );
        }
        //target.setHealth( target.getHealth() - damage );
        return damage;
    }
}

