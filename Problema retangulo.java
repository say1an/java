import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double b, h, a, p, d;

        System.out.print("Introduza a base: ");
        b = sc.nextDouble();
        System.out.print("Introduza o retangulo: ");
        h = sc.nextDouble();

        a = b + h;
        p = b + b + h + h;
        d = Math.sqrt(Math.pow(b, 2.0) + Math.pow(h, 2.0));

        System.out.println("Area: " + String.format("%.4f", a));
        System.out.println("Perimetro: " + String.format("%.4f", p));
        System.out.println("Diagonal: " + String.format("%.4f", d));


        sc.close();
    }
}