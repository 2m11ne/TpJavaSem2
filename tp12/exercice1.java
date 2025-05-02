import java.util.*;

public class exercice1 {
    static double sum(double[] tab, int n) {
        double somme = 0;
        for (int i = 0; i < n; i++) {
            somme += tab[i];
        }
        return somme;
    }
    static void increment(double[] tab, double val, int n) {
        for (int i = 0; i < n; i++) {
            tab[i] += val;
        }
    }
    static void display(double[] tab, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(tab[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer la taille du tableau : ");
        int n = sc.nextInt();
        double[] tab = new double[1000];
        for (int i = 0; i < n; i++) {
            System.out.print("tab[" + i + "] = ");
            tab[i] = sc.nextDouble();
        }
        System.out.println("Affichage du tableau : ");
        display(tab, n);

        System.out.println("Somme du tableau = " + sum(tab, n));
        System.out.println("Entrer une valeur à ajouter à chaque élément : ");
        double val = sc.nextDouble();
        increment(tab, val, n);
        System.out.println("Tableau après incrément : ");
        display(tab, n);
    }
}
