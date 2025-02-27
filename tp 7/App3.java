import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {
        int[][] M = new int[20][30];
        int[] T = new int[20];
        int nl, nc, i, j;
        int sommeMin, sommeMax;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Donner nl (max 20):");
            nl = sc.nextInt();
        } while (nl > 20);
        do {
            System.out.println("Donner nc (max 30):");
            nc = sc.nextInt();
        } while (nc > 30 );
        System.out.println("Remplir la matrice:");
        for (i = 0; i < nl; i++) {
            T[i] = 0; 
            for (j = 0; j < nc; j++) {
                System.out.println("M[" + i + "," + j + "] = ");
                M[i][j] = sc.nextInt();
                T[i] = T[i] + M[i][j]; 
            }
        }
        sommeMin = T[0];
        sommeMax = T[0];
        for (i = 1; i < nl; i++) {
            if (T[i] < sommeMin) {
                sommeMin = T[i];
            }
            if (T[i] > sommeMax) {
                sommeMax = T[i];
            }
        }
        System.out.println("La somme minimale est: " + sommeMin);
        System.out.println("La somme maximale est: " + sommeMax);
    }
}