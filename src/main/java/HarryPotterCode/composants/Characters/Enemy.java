package HarryPotterCode.composants.Characters;

public class Enemy extends AbstractEnemy {
    private Enemy(int maxHealth, int health, float defence, int damage, int accuracy, String name) {
        super(maxHealth, health, defence, damage, accuracy, name);
    }
    public static Enemy Troll() {
        return new Enemy(20,0, 0.0f, 4, 0 , "Troll");
    }
    public static Enemy Basilic() {
        return new Enemy(30,0, 0.1f, 2, 2,  "Basilic");
    }
    public static Enemy Detraqueur() {
        return new Enemy(60,0, 0.2f, 10, 2,  "Détraqueur");
    }
   public static Enemy Mangemort() {
        return new Enemy(70,0, 0.3f, 20, 5,  "Mangemort");
    }
    public static Enemy BelatrixLestrange() {
        return new Enemy(80,0, 0.35f, 25, 10,  "Belatrix Lestrange");
    }
    public static Enemy Voldemort() {
        return new Enemy(150,0, 0.5f, 30, 20,  "Voldemort");
    }
    public static Enemy DoloresOmbrage() {
        return new Enemy(500,0, 0.99f, 1, 0,  "Dolores Ombrage");
    }

}
