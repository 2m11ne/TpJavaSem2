import java.util.Scanner;
public class rech_rep {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String Texte,mot1,mot2,x;
        int l,p;
        System.out.println("donner un chaine de charactere");
        Texte=sc.nextLine();
        System.out.println("donner mot1");
        mot1=sc.nextLine();
        System.out.println("donner mot2");
        mot2=sc.nextLine();
        if (Texte.indexOf(mot1)==-1) {
<<<<<<< HEAD
            System.out.println(mot1+" n'existe pas dans le texte");     
        }
        else{
                Texte=new StringBuffer.(replace(mot1, mot2));
                System.out.println("le nouveau texte est"+ x);   
=======
            System.out.println(mot1+" n'existe pas dans le texte");
        }
        else{
            l=mot1.length();
                p=Texte.indexOf(mot1);
                x=Texte.replace(mot1, mot2);
                System.out.println("le nouveau texte est"+ x);
>>>>>>> d6b5d12d95ce6681e32f67f7e9fd2b671564be30
        }
    }
}
