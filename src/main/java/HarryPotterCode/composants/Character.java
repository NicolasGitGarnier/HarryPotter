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
    private int potionDamage;

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
            damage = (this.damage + this.potionDamage) - (( target.getDefence() / 100 ) * this.damage + this.potionDamage);
        } else {
            // Enemy attack wizard
            damage = this.damage - (target.getDefence() * ( target.getDamage() / 100 ));
        }
        target.setHealth(target.getHealth() - damage);
        return damage;
    }

}
