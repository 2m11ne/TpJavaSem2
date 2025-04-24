import java.util.Scanner;

public class Methode {
    public static int lectureN() {
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("donner un entier strictement positive");
            n = sc.nextInt();
        } while (n <= 0);
        sc.close();
        return n;
    }

    public static void remplirTab(int n) {
        n = lectureN();
        int t[] = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= n; i++) {
            System.out.println("donner entier numero" + i);
            t[i] = sc.nextInt();
            sc.close();
        }
    }

    public static void remplacer(int x1, int x2, int[] t, int n) {
        for (int i = 0; i <= n; i++) {
            if (t[i] == x1) {
                t[i] = x2;
            }
        }
    }

    public static void affichetab(int[] t, int n) {
        for (int i = 0; i <= n; i++) {
            System.out.println(t[i] + "/n");
        }
    }

    public static void main(String[] args) {
        int n;
        n = lectureN();
    }
    public static void remplirTabinf(float[]t , int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= n; i++){
            do {
                System.out.println("donner la valeur de case n "+i);
                t[i] = sc.nextFloat();
                } while (n>20);
                sc.close();
    }
    }
        public static int lectureN2() {
            int n;
            Scanner sc = new Scanner(System.in);
            do {
                System.out.println("donner un entier strictement positive");
                n = sc.nextInt();
            } while (n < 10);
            sc.close();
            return n;
        }
        public static void remplirTab(int[] t, int n) {
            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < n; i++) {
                do {
                    System.out.println("Donner un entier positif pour t[" + i + "]:");
                    t[i] = sc.nextInt();
                } while (t[i] <= 0);
            }
        }
        public static int[] CreerTpair(int[] t, int n) {
            int[] temp = new int[n];
            int j = 0;
            for (int i = 0; i < n; i++) {
                if (t[i] % 2 == 0) {
                    temp[j] = t[i];
                    j++;
                }
            }
            int[] T_pair = new int[j];
            for (int i = 0; i < j; i++) {
                T_pair[i] = temp[i];
            }
            return T_pair;
        }
        public static int[] CreerTimpair(int[] t, int n) {
            int[] temp = new int[n];
            int j = 0;
            for (int i = 0; i < n; i++) {
                if (t[i] % 2 != 0) {
                    temp[j] = t[i];
                    j++;
                }
            }
            int[] T_impair = new int[j];
            for (int i = 0; i < j; i++) {
                T_impair[i] = temp[i];
            }
            return T_impair;
        }
        public static void afficheTab(int[] t) {
            for (int i = 0; i < t.length; i++) {
                System.out.print(t[i] + " ");
            }
            System.out.println();
        }
        public static void remplirMat(float[][] mat, int n1, int n2) {
            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < n1; i++) {
                for (int j = 0; j < n2; j++) {
                    System.out.print("Donner M[" + i + "][" + j + "] : ");
                    mat[i][j] = sc.nextFloat();
                }
            }
        }
        public static float CalculSomme(float[][] mat, int n2, int i) {
            float somme = 0;
            for (int j = 0; j < n2; j++) {
                somme += mat[i][j];
            }
            return somme;
        }
        }
