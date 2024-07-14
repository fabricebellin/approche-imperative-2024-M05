package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demande un nombre à l'utilisateur
        System.out.print("Veuillez entrer un nombre : ");
        int nombre = scanner.nextInt();

        // Afficher les 10 nombres suivants
        System.out.println("Les 10 nombres suivants sont :");
        for (int i = 1; i <= 10; i++) {
            System.out.print((nombre + i) + " ");
        }

        // Fermer le scanner
        scanner.close();
    }
}
