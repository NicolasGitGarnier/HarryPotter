package HarryPotterCode.composants;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AbstractEnemy extends Character{
    public AbstractEnemy(int health, int defence, int damage, int accuracy) {
        super(health, defence, damage, accuracy);
    }
}
