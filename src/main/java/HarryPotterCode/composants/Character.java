package HarryPotterCode.composants;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Character {
    private int health;
    private int defence;
    private int damage;
    private int accuracy;
    private int dodge;

    public Character(int health, int defence, int damage, int accuracy, int dodge) {
        this.health = 10;
        this.defence = 0;
        this.damage = 2;
        this.accuracy = 5;
        this.dodge = 2;
    }

    public void attack() {}
}
