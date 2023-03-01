package HarryPotterCode.composants;

import lombok.Data;

@Data
public class AbstractEnemy extends Character{
    public AbstractEnemy(int health, int defence, int damage, int accuracy, int dodge) {
        super(health, defence, damage, accuracy, dodge);
    }
}
