package HarryPotterCode.composants;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
public class Character {
    private int health;
    private int defence;
    private int damage;
    private int accuracy;
    private int potionBonus;

    @Setter
    private String name;

    public Character(int health, int defence, int damage, int accuracy) {
        this.health = health;
        this.defence = defence;
        this.damage = damage;
        this.accuracy = accuracy;
    }

    public int attack(Character target) {
        int damage;
        if (target instanceof Enemy || target instanceof Boss) {
            // Wizard attack enemy
            //Defence is a % reduction damage
            damage = (this.damage + this.potionBonus) - (( target.getDefence() / 100 ) * (this.damage + this.potionBonus));
        } else {
            // Enemy attack wizard
            damage = this.damage - (target.getDefence() * ( target.getDamage() / 100 ));
        }
        target.setHealth(target.getHealth() - damage);
        return damage;
    }

}
