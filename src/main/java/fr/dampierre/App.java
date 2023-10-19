package fr.dampierre;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {

        int salaireHoraire = 15;
        Scanner clavier = new Scanner(System.in);

        System.out.print("Veuillez entrer un nombre d'heures entre 0 et 42 : ");

        int nbHeuresTravaillés = clavier.nextInt();

        while (nbHeuresTravaillés < 0 || nbHeuresTravaillés > 42) {
            System.out.print("Veuillez entrer un nombre d'heures entre 0 et 42 : ");
            nbHeuresTravaillés = clavier.nextInt();
        }

        int salaireHebdo = salaireHoraire * nbHeuresTravaillés;

        System.out.println("Votre salaire hebdomadaire est de " + salaireHebdo + " euros");
    }
    
}
