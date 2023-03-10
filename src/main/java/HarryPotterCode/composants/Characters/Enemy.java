package HarryPotterCode.composants.Characters;

public class Enemy extends AbstractEnemy {
    private Enemy(int health, int defence, int damage, int accuracy, String name) {
        super(health, defence, damage, accuracy);
        setName(name);
    }
    public static Enemy Troll() {
        return new Enemy(15, 0, 2, 1 , "Troll");
    }

    public static Enemy Basilic() {
        return new Enemy(15, 5, 5, 5,  "Basilic");
    }
    public static Enemy Voldemort() {
        return new Enemy(70, 30, 30, 30,  "Voldemort");
    }
    public static Enemy Détraqueur() {
        return new Enemy(10, 0, 15, 20,  "Détraqueur");
    }
    public static Enemy DoloresOmbrage() {
        return new Enemy(200, 70, 3, 10,  "Dolores Ombrage");
    }
    public static Enemy Mangemort() {
        return new Enemy(30, 20, 15, 20,  "Mangemort");
    }
    public static Enemy BelatrixLestrange() {
        return new Enemy(50, 40, 30, 25,  "Belatrix Lestrange");
    }

}