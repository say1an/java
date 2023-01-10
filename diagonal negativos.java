import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, q;

        System.out.println("Qual a ordem da matriz: ");
        a = sc.nextInt();


        int m[][] = new int[a][a];

        for (int i = 0; i < a; i++){
            for(int j = 0; j < a; j++){
                System.out.println("Elementos [" + i + "," + j + "]");
                 m[i][j] = sc.nextInt();
            }
        }

        System.out.println("Diagonal principal: ");

        for(int i = 0; i < a; i++){
            System.out.print(m[i][i] + " ");
        }
        System.out.println();

        q = 0;

        for (int i = 0; i < a; i++){
            for(int j = 0; j < a; j++) {
                if(m[i][j] < 0){
                    q++;
                }
            }
        }

        System.out.println("Quantidade de negativos: " + q);

    }
}