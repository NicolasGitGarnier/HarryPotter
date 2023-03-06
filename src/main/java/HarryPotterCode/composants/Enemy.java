package HarryPotterCode.composants;

public class Enemy extends AbstractEnemy{
    private Enemy(int health, int defence, int damage, int accuracy, String name) {
        super(health, defence, damage, accuracy);
        setName(name);
    }
    public static Enemy Détraqueur() {
        return new Enemy(10, 0, 15, 20,  "Détraqueur");
    }
    public static Enemy DoloresOmbrage() {
        return new Enemy(200, 40, 3, 10,  "Dolores Ombrage");
    }
    public static Enemy Mangemort() {
        return new Enemy(30, 5, 15, 20,  "Mangemort");
    }
    public static Enemy BelatrixLestrange() {
        return new Enemy(50, 40, 30, 25,  "Belatrix Lestrange");
    }

}
