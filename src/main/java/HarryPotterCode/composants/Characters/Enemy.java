package HarryPotterCode.composants.Characters;

public class Enemy extends AbstractEnemy {
    private Enemy(int maxHealth,int health, int defence, int damage, int accuracy, String name) {
        super(maxHealth, health, defence, damage, accuracy);
        setName(name);
    }
    public static Enemy Troll() {
        return new Enemy(20,0, 0, 4, 10 , "Troll");
    }
    public static Enemy Basilic() {
        return new Enemy(30,0, 10, 5, 5,  "Basilic");
    }
    public static Enemy Voldemort() {
        return new Enemy(70,0, 30, 30, 30,  "Voldemort");
    }
    public static Enemy Detraqueur() {
        return new Enemy(10,0, 0, 15, 20,  "Détraqueur");
    }
    public static Enemy DoloresOmbrage() {
        return new Enemy(200,0, 70, 3, 10,  "Dolores Ombrage");
    }
    public static Enemy Mangemort() {
        return new Enemy(30,0, 20, 15, 20,  "Mangemort");
    }
    public static Enemy BelatrixLestrange() {
        return new Enemy(50,0, 40, 30, 25,  "Belatrix Lestrange");
    }

}
