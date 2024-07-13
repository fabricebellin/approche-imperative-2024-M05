package fr.tableaux;

public class ExercicesTableauChaines {
    public static void main(String[] args) {
        // 1. Déclaration et initialisation du tableau de chaînes
        String[] villes = {"Paris", "Lyon", "Marseille", "Toulouse", "Bordeaux"};

        // 2. Affichage des éléments du tableau avant modification
        System.out.println("Villes avant modification :");
        for (String ville : villes) { // Utilisation d'une boucle for-each (plus concise)
            System.out.println(ville);
        }

        // 3. Affichage de la longueur du tableau
        System.out.println("\nLongueur du tableau : " + villes.length); // Ajout d'un saut de ligne pour la lisibilité

        // 4. Modification de l'élément à l'index 3
        villes[3] = "Reims"; // L'index commence à 0, donc 3 correspond à la 4ème position

        // 5. Affichage des éléments du tableau après modification
        System.out.println("\nVilles après modification :");
        for (String ville : villes) { // Réutilisation de la boucle for-each
            System.out.println(ville);
        }
    }
}
