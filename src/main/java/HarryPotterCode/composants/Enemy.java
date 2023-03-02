package HarryPotterCode.composants;

public class Enemy extends AbstractEnemy{
    private Enemy(int health, int defence, int damage, int accuracy, int dodge, String name) {
        super(health, defence, damage, accuracy, dodge);
        setName(name);
    }
    public static Enemy Détraqueur() {
        return new Enemy(10, 0, 15, 20, 10, "Détraqueur");
    }
    public static Enemy DoloresOmbrage() {
        return new Enemy(200, 40, 3, 10, 0, "Dolores Ombrage");
    }
    public static Enemy Mangemort() {
        return new Enemy(30, 5, 15, 20, 20, "Mangemort");
    }
    public static Enemy BelatrixLestrange() {
        return new Enemy(50, 40, 30, 25, 15, "Belatrix Lestrange");
    }

}
