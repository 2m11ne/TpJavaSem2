import java.util.*;

public class exercice3 {
    static void remplir(int[] t, int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Entrer entier " + i + " : ");
            t[i] = sc.nextInt();
        }
    }

    static void trier(int[] t, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (t[i] > t[j]) {
                    int temp = t[i];
                    t[i] = t[j];
                    t[j] = temp;
                }
            }
        }
    }

    static void afficher(int[] t, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(t[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Donner la taille du tableau : ");
        int n = sc.nextInt();
        int[] t = new int[1000];

        remplir(t, n);
        System.out.println("Tableau avant tri : ");
        afficher(t, n);

        trier(t, n);
        System.out.println("Tableau après tri : ");
        afficher(t, n);
    }
}
