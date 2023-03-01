package HarryPotterCode.composants;

import lombok.experimental.UtilityClass;

@UtilityClass
public class SortingHat {
    public static House assignHouse() {
        // Generate a random number between 0 and 4
        int randomNum = (int) (Math.random() * 5);
        // Assign a house based on the random number
        if (randomNum == 0) {
            return House.HUFFLEPUFF;
        } else if (randomNum == 1) {
            return House.GRYFFINDOR;
        } else if (randomNum == 2) {
            return House.RAVENCLAW;
        } else {
            return House.SLYTHERIN;
        }
    }
}
