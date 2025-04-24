import java.util.Scanner;
public class methode {
    public static int LectureN() {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.println("donner un entier");
            while (!scanner.hasNextInt()) {
                System.out.println("donner un entier");
                scanner.next();
            }
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("lentier nest pas positif");
            }
        } while (n <= 0);
        return n;
    }
    public static int Compter(int n) {
        String ch = Integer.toString(n); 
        int s = 0;
        for (int i = 0; i < ch.length(); i++) {
            s = s + 1;
        }
        return s;
    }
    public static int Addition (int a , int b) {
        int s = a + b;
        return s;
    }
    public static int Subtraction (int a , int b) {
        int su = a - b;
        return su;
    }
    public static int Multiplication (int a , int b) {
        int m = a * b;
        return m;
    }
    public static int Division (int a , int b) {
        int d = a / b;
        return d;
    }
}