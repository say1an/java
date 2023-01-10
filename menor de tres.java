import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n1, n2, n3, menor;

        System.out.println("Introduz o 1 numero: ");
        n1 = sc.nextInt();
        System.out.println("Introduz o 2 numero: ");
        n2 = sc.nextInt();
        System.out.println("Introduz o 3 numero: ");
        n3 = sc.nextInt();

        if (n1 < n2 && n1 < n3) {
            menor = n1;
        }
        else if (n2 < n3) {
            menor = n2;
        }
        else {
            menor = n3;
        }
        System.out.println("Menor: " + menor);
        sc.close();
    }
}