public class exercice4 {
    public static void main(String[] args) {
        int n1, n2;
        n1 = Methode.lectureN();
        n2 = Methode.lectureN();

        float[][] M = new float[n1][n2];
        Methode.remplirMat(M, n1, n2);

        for (int i = 0; i < n1; i++) {
            float somme = Methode.CalculSomme(M, n2, i);
            System.out.println("Somme de la ligne " + i + " = " + somme);
        }
    }s
}