package principal;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Quanto numeros deseja digitar: ");
        int n = input.nextInt();
        int[] vectA = new int[n];
        int[] vectB = new int[n];
        int[] vectC = new int[n];

        for (int i = 0; i < vectA.length; i++) {
            System.out.println("Digite os numeros do Vetor A");
            vectA[i] = input.nextInt();
        }
        for (int i = 0; i < vectB.length; i++) {
            System.out.println("Digite os numeros do Vetor B");
            vectB[i] = input.nextInt();
        }
        for (int i = 0; i < vectC.length; i++) {
            vectC[i] = vectA[i] + vectB[i];
        }

        for (int i = 0; i < vectC.length; i++) {
            System.out.println("A Soma dos vetores:" + vectC[i]) ;

        }
    }
}