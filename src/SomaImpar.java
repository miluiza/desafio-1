import java.util.Scanner;

public class SomaImpar {
    public static void main(String[] args) {
        int n, impar = 0;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Digite um número de 1 à 1000");
            n = scan.nextInt();
            for (int i = 1; i <= n; i++) {
                if (i%2 == 1) impar = impar + i;
            }
            System.out.println("A soma dos números ímpares de 1 até " + n + " é igual à " + impar);
        } while (n > 0);
    }
}
