public class FabriquerMur {

    public static boolean fabriquerMur(int nbSmall, int nbBig, int longueur) {
        // On commence par utiliser le maximum de briques de 5 (les plus grandes)
        while (nbBig > 0 && longueur >= 5) {
            longueur -= 5;
            nbBig--;
        }

        // On utilise ensuite les briques de 1 pour combler le reste
        while (nbSmall > 0 && longueur > 0) {
            longueur--;
            nbSmall--;
        }

        // Si la longueur restante est 0, c'est que le mur a pu être construit
        return longueur == 0;
    }

    // Méthode de vérification (inchangée par rapport à l'énoncé)
    private static void verifier(int nbSmall, int nbBig, int longueur, boolean b) {
        if (fabriquerMur(nbSmall, nbBig, longueur) != b) {
            System.err.println("Test (" + nbSmall + ", " + nbBig + ", " + longueur + ") NON passant.");
        }
    }

    public static void main(String[] args) {
        // Tests de vérification (inchangés par rapport à l'énoncé)
        verifier(3, 1, 8, true);
        verifier(3, 1, 9, false);
        verifier(3, 2, 10, true);
        // ... (autres tests)
    }
}
