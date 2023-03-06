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

    @Setter
    private String name;

    public Character(int health, int defence, int damage, int accuracy) {
        this.health = 10;
        this.defence = 0;
        this.damage = 2;
        this.accuracy = 5;
    }

    public void attack() {}
}
