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

        Wizard wizard = new Wizard( firstName, lastName, null, null, SortingHat.assignHouse(), new ArrayList<>(),new ArrayList<>() );

        System.out.println("Bonjour "+ wizard.getFirstName() + " " + wizard.getLastName() + ", bienvenue à Poudlard !");
        System.out.println("Le Choipeau Magic vous a attribué à la maison " + wizard.getHouse());

        System.out.println("La baguette magique vous correspondant le mieux est en "+ Wand.getCore() + " et de taille "+Wand.getWandSize());
    }
}