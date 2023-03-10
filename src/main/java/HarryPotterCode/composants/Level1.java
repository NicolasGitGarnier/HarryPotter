package HarryPotterCode.composants;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Level1 {
    private static Wizard wizard;

    public Level1(Wizard wizard) {
        this.wizard = wizard;
    }

    public static void start(String[] args) {
        Enemy troll = Enemy.Troll();
        wizard.attack(troll);
    }
}

