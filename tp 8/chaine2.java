import java.util.Scanner;

public class Correction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i1, i2, pos;
        StringBuffer text;
        String ch, mot1, mot2;

        do {
            System.out.println("Donnez une chaine ne dépasse pas 50 caractères");
            ch = sc.nextLine();
        } while (ch.length() > 50);

        do {
            System.out.println("Donnez le mot1 ne dépasse pas 10 caractères");
            mot1 = sc.nextLine();
            System.out.println("Donnez le mot2 ne dépasse pas 10 caractères");
            mot2 = sc.nextLine();
        } while (mot1.length() > 10 || mot2.length() > 10);

        text = new StringBuffer(ch);
        i1 = mot1.length();
        i2 = mot2.length();

        while (text.indexOf(mot1) != -1) {
            pos = text.indexOf(mot1);
            text.delete(pos, pos + i1);
            text.insert(pos, mot2);
        }

        System.out.println(text);
    }
}