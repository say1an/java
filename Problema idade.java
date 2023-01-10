import java.util.Locale;
import java.util.Scanner;



 public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int  i1, i2;
        String n1, n2;
        double media;

        System.out.println("Introduz o nome: ");
        n1 = sc.nextLine();
        System.out.println("Introduz a idade: ");
        i1 = sc.nextInt();
        System.out.println("Introduz o 2 nome: ");
        sc.nextLine();
        n2 = sc.nextLine();
        System.out.println("Introduz a 2 idade: ");
        i2 = sc.nextInt();

        media = (double)(i1 + i2) / 2.0;

        System.out.println("A idade media de " + n1 + " e " + n2 + " eh de " + String.format("%.1f", media));

        sc.close();


    }
}