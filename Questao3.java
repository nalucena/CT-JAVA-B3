package provaCT;
import java.util.Scanner;

public class Questao3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um número inteiro:");
        int numero = scan.nextInt();

        for (int i = 1; i <= numero; i++) {
            for (int j = 1; j <= numero - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Extra: Desenhar a segunda pirâmide abaixo da primeira
        for (int i = numero - 1; i >= 1; i--) {
            for (int j = 1; j <= numero - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
