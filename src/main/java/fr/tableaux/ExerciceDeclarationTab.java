package fr.tableaux; // Package spécifié dans l'énoncé

public class ExerciceDeclarationTab {
    public static void main(String[] args) {
        // Déclaration et initialisation du tableau d'entiers
        int[] entiers = {8, 7, 12, 1, -2, 14, 17, 9};

        // Affichage de l'élément d'index 0
        System.out.println("Élément à l'index 0 : " + entiers[0]);

        // Affichage de la longueur du tableau
        System.out.println("Longueur du tableau : " + entiers.length);

        // Affichage de l'élément au dernier index
        int dernierIndex = entiers.length - 1; // Calcul de l'index du dernier élément
        System.out.println("Élément au dernier index : " + entiers[dernierIndex]);
    }
}
