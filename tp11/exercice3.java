public class exercice3 {
    public static void main(String[] args) {
        int n;
        int[] T = new int[100];
        int[] T_pair;
        int[] T_impair;
        n = Methode.lectureN();
        Methode.remplirTab(T, n);
        T_pair = Methode.CreerTpair(T, n);
        T_impair = Methode.CreerTimpair(T, n);
        System.out.println("Les éléments pairs:");
        Methode.afficheTab(T_pair);
        System.out.println("Les éléments impairs:");
        Methode.afficheTab(T_impair);
    }
}