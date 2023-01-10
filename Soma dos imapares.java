import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int soma, n, n1;
        soma = 0;

        System.out.println("Introduz o numero: ");
        n = sc.nextInt();
        System.out.println("Introduz o numero");
        n1 = sc.nextInt();
        sc.close();

        if (n < n1) {
            for (int i = n; i < n1; i++) {
                if (i % 2 != 0) {
                    soma = soma + i;
                }
            }

        }
        else if (n1 < n) {
            for (int i = n1; i < n; i++) {
                if (i % 2 != 0) {
                    soma = soma + i;
                }
            }

        }
        System.out.println("soma = " + soma);
    }
}