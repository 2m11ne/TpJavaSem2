import java.util.Scanner;
public class App2 {
    public static void main(String[] args) {
        int[][] M = new int[30][30];
        int nl, nc, i, j;
        int s = 0;
        int p = 1;
        float moy;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Donner nl (max 30):");
            nl = sc.nextInt();
        } while (nl > 30);
        do {
            System.out.println("Donner nc (max 30):");
            nc = sc.nextInt();
        } while (nc > 30);
        System.out.println("Remplir la matrice:");
        for (i = 0; i < nl; i++) {
            for (j = 0; j < nc; j++) {
                System.out.println("M[" + i + "," + j + "] = ");
                M[i][j] = sc.nextInt();
                s = s + M[i][j];
                p = p * M[i][j]; 
            }
        }
        moy = s / (nl * nc);
        System.out.println("La somme :" + s);
        System.out.println("Le produit : " + p);
        System.out.println("La moyenne : " + moy);
    }
}