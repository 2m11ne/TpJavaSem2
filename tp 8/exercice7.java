import java.util.Scanner;
public class exercice7{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String mot;
        do{
            System.out.println("donner un verbe");
            mot=sc.nextLine();
        }while (!mot.endsWith("er") || mot.equals("aller"));

        System.out.println("je"+mot.replace("er","e"));
        System.out.println("tu"+mot.replace("er","es"));
        System.out.println("il"+mot.replace("er","e"));
        if(mot.endsWith("ger")){
          System.out.println("nous"+mot.replace("er","eons"));
        }
        else if(mot.endsWith("cer")){
            System.out.println("nous"+mot.replace("cer","çons"));
        }
        else {
            System.out.println("nous"+mot.replace("er","ons"));
        }
        System.out.println("vous"+mot.replace("er","ez"));
        System.out.println("ils"+mot.replace("er","ent"));
        }
    }