package HarryPotterCode.composants;

public class Boss extends AbstractEnemy{
    private Boss(int health, int defence, int damage, int accuracy, String name) {
        super(health, defence, damage, accuracy);
        setName(name);
    }
    public static Boss Throll() {
        return new Boss(15, 0, 2, 1 , "Throll");
    }

    public static Boss Basilic() {
        return new Boss(15, 5, 5, 5,  "Basilic");
    }
    public static Boss Voldemort() {
        return new Boss(70, 30, 30, 30,  "Voldemort");
    }

}
