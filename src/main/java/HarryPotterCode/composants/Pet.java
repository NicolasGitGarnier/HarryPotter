package HarryPotterCode.composants;
import java.util.Scanner;
public enum Pet {
    OWL,
    RAT,
    CAT,
    TOAD,
    ;

    public static Pet getPet() {
        Scanner sc = new Scanner(System.in);
        Pet pet = null;

        int choix = 0;
        while(pet == null) {
            System.out.println("Lequel de ces 4 créatures souhaite-tu avoir pour tes 7 années d'études ? (entre le numéro) \n" +
                    "1. Owl \n" +
                    "2. Rat \n" +
                    "3. Cat \n" +
                    "4. Toad \n");

            if (sc.hasNextInt()) {
                choix = sc.nextInt();
                if (choix < 1 || choix > 4) {
                    System.out.println("Veuillez entrer un entier compris entre 1 et 4.");
                }
            } else {
                System.out.println("Veuillez entrer un entier compris entre 1 et 4.");
                sc.next();
            }
            String choice = "";
            switch (choix) {
                case 1:
                    choice = String.valueOf(OWL);
                    break;
                case 2:
                    choice = String.valueOf(RAT);
                    break;
                case 3:
                    choice = String.valueOf(CAT);
                    break;
                case 4:
                    choice = String.valueOf(TOAD);
                    break;
            }
            for (Pet p : Pet.values()) {
                if (choice.equals(p.name())) {
                    pet = p;
                    break;
                }
            }
        }
            return pet;
    }
}

