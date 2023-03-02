package HarryPotterCode.composants;

public class Boss extends AbstractEnemy{
    private Boss(int health, int defence, int damage, int accuracy, int dodge, String name) {
        super(health, defence, damage, accuracy, dodge);
        setName(name);
    }
    public static Boss Throll() {
        return new Boss(20, 0, 2, 1, 2, "Throll");
    }

    public static Boss Basilic() {
        return new Boss(15, 5, 5, 5, 10, "Basilic");
    }
    public static Boss Voldemort() {
        return new Boss(70, 15, 30, 30, 10, "Voldemort");
    }

}
