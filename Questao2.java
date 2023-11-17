import java.util.Scanner;
public class Questao2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor do carro desejado:");
        double valorCarro = scan.nextDouble();

        int quantidadeParcelas = (int) (valorCarro / 1000);

        if (valorCarro < 1000 && valorCarro > 0) {
            quantidadeParcelas = 1;
        }

        System.out.printf("Para um carro com valor de R$%.2f é possível parcelar em " + quantidadeParcelas + " vezes.\n", valorCarro);


        double valorParcela = valorCarro / quantidadeParcelas;
        System.out.printf("O valor da parcela será de R$%.2f\n", valorParcela);
    }
}
