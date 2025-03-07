import java.util.Scanner;
public class exercice6 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);{
            String mot;
            int l = 0;
            System.out.println("donner un mot");
            mot = sc.nextLine();
            for (int i = 0; i < mot.length(); i++) {
                if (mot.charAt(i)== 'a' || mot.charAt(i)== 'e' || mot.charAt(i) == 'i' || mot.charAt(i) == 'o'|| mot.charAt(i) == 'u' || mot.charAt(i) == 'y') {
                    l=l+1;
                }
            }
            System.out.println("le nombre de voyelle est"+l);
        }
    }
}