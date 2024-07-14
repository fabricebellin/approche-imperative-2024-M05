package fr.algorithmie;

public class AffichageIdentite {
    public static void main(String[] args) {
        int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] array2 = {-1, 12, 17, 14, 5, -9, 8, 18, 6, -8, 4, 13, 5, 7, -2, 8, -1};

        // Vérifier si les tableaux ont la même longueur
        if (array1.length != array2.length) {
            System.err.println("Erreur : Les tableaux doivent avoir la même longueur.");
            return; // Quitter le programme si les longueurs sont différentes
        }

        int[] arrayMix = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            arrayMix[i] = array1[i] + array2[i];
        }

        System.out.println("Somme des éléments des deux tableaux :");
        for (int i = 0; i < arrayMix.length; i++) {
            System.out.print(arrayMix[i] + " "); // Espace après chaque élément
        }
        System.out.println(); // Nouvelle ligne pour la lisibilité
    }
}
