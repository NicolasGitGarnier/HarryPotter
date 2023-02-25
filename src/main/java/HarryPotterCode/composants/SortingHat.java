package HarryPotterCode.composants;

public class SortingHat {
    public static House assignHouse() {

        // Generate a random number between 0 and 99
        int randomNum = (int) (Math.random() * 100);

        // Assign a house based on the random number
        if (randomNum == 0) {
            return House.SLYTHERIN;
        } else if (randomNum == 1) {
            return House.GRYFFINDOR;
        } else if (randomNum == 2) {
            return House.RAVENCLAW;
        } else {
            return House.HUFFLEPUFF;
        }
    }
}
