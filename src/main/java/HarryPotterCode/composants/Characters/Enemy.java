package HarryPotterCode.composants.Characters;

public class Enemy extends AbstractEnemy {
    private Enemy(int maxHealth, int health, float defence, int damage, int accuracy, String name) {
        super(maxHealth, health, defence, damage, accuracy, name);
    }
    public static Enemy Troll() {
        return new Enemy(20,0, 0.0f, 2, 2, "Troll");
    }
    public static Enemy Basilic() {
        return new Enemy(25,0, 0.1f, 7, 3,  "Basilic");
    }
    public static Enemy Dementor() {
        return new Enemy(30,0, 0.2f, 8, 5,  "Dementor");
    }
   public static Enemy Mangemort() {
        return new Enemy(35,0, 0.3f, 11, 6,  "Mangemort");
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
