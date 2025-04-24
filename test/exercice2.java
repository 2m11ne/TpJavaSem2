import java.util.Scanner;
public class Exercice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        String o;
        System.out.println("Donner un entier a ");
        a = sc.nextInt();
        System.out.println("Donner un entier b ");
        b = sc.nextInt();
        System.out.println("loperation (+, -, *, /)");
        sc.nextLine();
        o = sc.nextLine();
        switch(o) {
            case "+":
                System.out.println(int s =methode.Addition(a,b));
                break;
            case "-":
                System.out.println(int su methonde.Soustraction(a,b));
                break;
            case "*":
                System.out.println(int m =methode.Multiplication(a,b));
                break;
            case "/":
                System.out.println(int d= methode.Division(a,b));
                break;
        }
        sc.close();
    }
}

