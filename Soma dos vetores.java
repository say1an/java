import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double soma, media;

        soma = 0;
        media = 0;


        System.out.println("introduz quantos numeros queres: ");
        int n = sc.nextInt();
        double nm[] = new double [n];

        for(int i = 0; i < n; i++){
            System.out.println("Digite um numero: ");
            nm[i] = sc.nextDouble();
        }

        for(int i = 0; i < n; i++) {
            soma = soma + nm[i];
            media = soma / n;
            System.out.println("Valores: " + nm[i]);

        }

        System.out.println("soma = " + soma);
        System.out.println("media: " + media);


    }
}