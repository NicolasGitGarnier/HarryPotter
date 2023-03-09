package HarryPotterCode;

import HarryPotterCode.composants.*;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;



public class Main {
    public static void main(String[] args) throws InterruptedException {
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
        //Start of the aventure
        System.out.println("________________________________________________________________________________________________");
        System.out.println("  _____                _ _               _               _                 _                  ");
        System.out.println(" |  __ \\              | | |             | |     /\\      | |               | |                 ");
        System.out.println(" | |__) |__  _   _  __| | | __ _ _ __ __| |    /  \\   __| |_   _____ _ __ | |_ _   _ _ __ ___ ");
        System.out.println(" |  ___/ _ \\| | | |/ _` | |/ _` | '__/ _` |   / /\\ \\ / _` \\ \\ / / _ \\ '_ \\| __| | | | '__/ _ \\");
        System.out.println(" | |  | (_) | |_| | (_| | | (_| | | | (_| |  / ____ \\ (_| |\\ V /  __/ | | | |_| |_| | | |  __/");
        System.out.println(" |_|   \\___/ \\__,_|\\__,_|_|\\__,_|_|  \\__,_| /_/    \\_\\__,_| \\_/ \\___|_| |_|\\__|\\__,_|_|  \\___|");
        System.out.println("________________________________________________________________________________________________");
        System.out.println("");
        System.out.println("* Hello "+ wizard.getFirstName() + " " + wizard.getLastName()+ ". *\n"+
                "* Welcome to Poudlard ! *\n"+
                "* Your wand is made of "+ wand.getCore() + " and is "+wand.getWandSize()+ " cm long. *\n"+
                "* You are in the " + wizard.getHouse()+ " house. *");
        System.out.println("");
        //Choose your Pet
        Pet pet = Pet.getPet();
        wizard.setPet(pet);
        System.out.println("* Great now you own a " + pet.name().toLowerCase() + ". *");
        System.out.println("");
        System.out.println(wizard.Stats());
        System.out.println("");
        Thread.sleep(1000);
        System.out.println("* Let's start the adventure ! *");
        System.out.println("");
        System.out.println("* You are now in the first grade at Poudlard. Here is your first class. *\n"+
                "- Teacher - Welcome to class every one, let's learn your first easy spell : Wingardium Leviosa.");
        Spell.learnWingardium(wizard.getKnownSpells());
        System.out.println("* Bilan des statistiques :" +wizard.toString()+" *");

    }
}