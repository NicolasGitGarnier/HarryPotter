package HarryPotterCode;

import HarryPotterCode.composants.Characters.Wizard;
import HarryPotterCode.composants.Levels.*;
import HarryPotterCode.composants.Others.SortingHat;
import HarryPotterCode.composants.Spells.Spell;
import HarryPotterCode.composants.WandStuff.Wand;

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
        Wand wand = new Wand();
        wand.getCore();
        wand.setSize(wand.getWandSize());
        Wizard wizard = new Wizard(22, 0,5, 0, 10, firstName, lastName, null, wand, SortingHat.assignHouse(), new ArrayList<>(), new ArrayList<>());

        /* Only use : for me when i skip levels and test my latest level release.
        Spell.learnWingardium(wizard.getKnownSpells());
        Spell.learnAccio(wizard.getKnownSpells());
        Spell.learnExpectoPatronum(wizard.getKnownSpells());
        Spell.learnSectumsempra(wizard.getKnownSpells());*/
        // --------------- Chapters --------------- //
        Levels(wizard);

    }
    private static void Levels(Wizard wizard) throws InterruptedException {
        // --------------- Introduction --------------- //
        Introduction introduction = new Introduction();
        introduction.runi(wizard);
        // --------------- Level 1 --------------- //
        Level1 level1 = new Level1(wizard);
        level1.run1(wizard);
        // --------------- Level 2 --------------- //
        Level2 level2 = new Level2(wizard);
        level2.run2(wizard);
        // --------------- Level 3 --------------- //
        Level3 level3 = new Level3(wizard);
        level3.run3(wizard);
        // --------------- Level 4 --------------- //
        Level4 level4 = new Level4(wizard);
        level4.run4(wizard);
        // --------------- Level 5 --------------- //
        Level5 level5 = new Level5(wizard);
        level5.run5(wizard);
        // --------------- Level 6 --------------- //
        Level6 level6 = new Level6(wizard);
        level6.run6(wizard);
        /*// --------------- Level 7 --------------- //
        if (!wizard.isHavePastDarkSide()) {
            Level7 level7 = new Level7(wizard);
            level7.run7(wizard);
        } else {
            Level7Darkside level7Darkside = new Level7Darkside(wizard);
            level7Darkside.run7(wizard);
        }*/
    }
}