package HarryPotterCode;

import HarryPotterCode.composants.*;
import java.util.Scanner;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome into Harry Potter's World...");
        // Creating the main character
        System.out.print("Enter your first name : ");
        String firstName = sc.nextLine();
        System.out.print("Enter your last name : ");
        String lastName = sc.nextLine();

        Wand wand = new Wand(Wand.getCore(), Wand.getWandSize());
        Wizard wizard = new Wizard( firstName, lastName, null, wand, SortingHat.assignHouse(), new ArrayList<>(),new ArrayList<>() );

        //Start of the aventure
        System.out.println("");
        System.out.println("");
        System.out.println("________________________________________________________________________________________________");
        System.out.println("  _____                _ _               _               _                 _                  ");
        System.out.println(" |  __ \\              | | |             | |     /\\      | |               | |                 ");
        System.out.println(" | |__) |__  _   _  __| | | __ _ _ __ __| |    /  \\   __| |_   _____ _ __ | |_ _   _ _ __ ___ ");
        System.out.println(" |  ___/ _ \\| | | |/ _` | |/ _` | '__/ _` |   / /\\ \\ / _` \\ \\ / / _ \\ '_ \\| __| | | | '__/ _ \\");
        System.out.println(" | |  | (_) | |_| | (_| | | (_| | | | (_| |  / ____ \\ (_| |\\ V /  __/ | | | |_| |_| | | |  __/");
        System.out.println(" |_|   \\___/ \\__,_|\\__,_|_|\\__,_|_|  \\__,_| /_/    \\_\\__,_| \\_/ \\___|_| |_|\\__|\\__,_|_|  \\___|");
        System.out.println("________________________________________________________________________________________________");
        System.out.println("Hi "+ wizard.getFirstName() + " " + wizard.getLastName()+ ".");
        System.out.println("Welcome to Hogwart !");
        System.out.println("Your wand is made of "+ wand.getCore() + " and is "+wand.getWandSize()+ " cm long.");
        System.out.println("You are in the " + wizard.getHouse()+ " house.");
        //Choose your Pet
        Pet pet = Pet.getPet();
        wizard.setPet(pet);
        System.out.println("Now, you own a " + pet.name().toLowerCase() + ".");
        System.out.println("Let's start the adventure !");

    }
}