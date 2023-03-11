package HarryPotterCode.composants.Characters;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AbstractEnemy extends Character {
    public AbstractEnemy(int maxHealth,int health, int defence, int damage, int accuracy) {
        super(maxHealth,health , defence, damage, accuracy);
    }
}
