package HarryPotterCode;

import HarryPotterCode.composants.*;
import java.util.Scanner;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenue dans le monde des sorciers...");

        // Creating the main character
        System.out.print("Entrez votre prénom : ");
        String firstName = sc.nextLine();
        System.out.print("Entrez votre nom de famille : ");
        String lastName = sc.nextLine();

        Wand wand = new Wand(Wand.getCore(), Wand.getWandSize());
        Wizard wizard = new Wizard( firstName, lastName, null, wand, SortingHat.assignHouse(), new ArrayList<>(),new ArrayList<>() );

        //Start of the aventure
        System.out.println("");
        System.out.println("");
        System.out.println("Bonjour "+ wizard.getFirstName() + " " + wizard.getLastName() + ", et bienvenue à Poudlard !");
        System.out.println("Votre baguette magique est en "+ wand.getCore() + " de taille "+wand.getWandSize());
        System.out.println("Vous appartenez à la maison " + wizard.getHouse());
        System.out.println("Que l'aventure commence !");
        System.out.println("________________________________________________________________________________________________");
        System.out.println("  _____                _ _               _               _                 _                  ");
        System.out.println(" |  __ \\              | | |             | |     /\\      | |               | |                 ");
        System.out.println(" | |__) |__  _   _  __| | | __ _ _ __ __| |    /  \\   __| |_   _____ _ __ | |_ _   _ _ __ ___ ");
        System.out.println(" |  ___/ _ \\| | | |/ _` | |/ _` | '__/ _` |   / /\\ \\ / _` \\ \\ / / _ \\ '_ \\| __| | | | '__/ _ \\");
        System.out.println(" | |  | (_) | |_| | (_| | | (_| | | | (_| |  / ____ \\ (_| |\\ V /  __/ | | | |_| |_| | | |  __/");
        System.out.println(" |_|   \\___/ \\__,_|\\__,_|_|\\__,_|_|  \\__,_| /_/    \\_\\__,_| \\_/ \\___|_| |_|\\__|\\__,_|_|  \\___|");
        System.out.println("________________________________________________________________________________________________");


    }
}