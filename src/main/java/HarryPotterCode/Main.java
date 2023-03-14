package HarryPotterCode;

import HarryPotterCode.composants.Characters.Wizard;
import HarryPotterCode.composants.Levels.Introduction;
import HarryPotterCode.composants.Levels.Level1;
import HarryPotterCode.composants.Levels.Level2;
import HarryPotterCode.composants.Others.SortingHat;
import HarryPotterCode.composants.WandStuff.Wand;


import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        // --------------- Initialisation of the character --------------- //
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("");
        System.out.println("*---* Welcome into Harry Potter's World... First of all, who are you ? *---*");
        // Creating the main character
        System.out.print("Enter your first name : ");
        String firstName = sc.nextLine();
        System.out.print("Enter your last name : ");
        String lastName = sc.nextLine();
        // Setting the data of the character
        Wand wand = new Wand(Wand.getCore(), Wand.getWandSize());
        Wizard wizard = Wizard.createWizard(20, 5, new Random().nextInt(3) + 3, 5, 5, firstName, lastName, null, wand, SortingHat.assignHouse(), new ArrayList<>(), new ArrayList<>());

        // --------------- Introduction --------------- //
        Introduction.introduction(wizard);

        // --------------- Level 1 --------------- //
        Level1.level1(wizard);

        // --------------- Level 2 --------------- //
        Level2.level2(wizard);
    }
}