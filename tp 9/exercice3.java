
    import java.util.Scanner;

    public class exercice3 {
        static Scanner scanner = new Scanner(System.in);
        
        public static void main(String[] args) {
            System.out.println("Donner un entier : ");
            int n = Methode.lectureN();
            int sommeDeChiffres = Methode.somme(n);
            System.out.println("Le nombre de chiffres est : " + sommeDeChiffres);
        }
    }
    class Methode {
        public static int lectureN() {
            return exercice3.scanner.nextInt();
        }
        public static int somme(int n) {
            int somme = 0;
            while (n != 0) {
                somme += n % 10;
                n /= 10;
            }
            return somme;
        }
    }funct