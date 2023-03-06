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
        this.health = 10;
        this.defence = 0;
        this.damage = 2;
        this.accuracy = 5;
    }

    public int attack(Character target) {
        int damage;
        if (target instanceof Enemy) {
            // Wizard attack enemy
            damage = (this.damage + this.potionDamage) - (target.getDefence() * (this.damage + this.potionDamage) / 100);
        } else {
            // Enemy attack wizard
            damage = target.getDamage() - (this.defence * target.getDamage() / 100);
        }
        target.setHealth(target.getHealth() - damage);
        return damage;
    }
}
