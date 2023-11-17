import java.util.Scanner;
public class Questao1 {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Informe o valor do empréstimo:");
            double valorEmprestimo = scan.nextDouble();

            System.out.println("Informe a taxa de juros do empréstimo (em %):");
            double taxaJuros = scan.nextDouble() / 100.0;

            System.out.println("Informe o número de meses para pagamento:");
            int numeroMeses = scan.nextInt();

            double amortizacao = valorEmprestimo / numeroMeses;

            double saldoDevedor = valorEmprestimo;

            double totalJuros = 0.0;
            double totalAmortizacao = 0.0;

            System.out.printf("\nValor fixo da amortização R$ %.2f, Saldo devedor total R$ %.2f com uma taxa de juros de %.2f%% ao mês\n",
                    amortizacao, valorEmprestimo, taxaJuros * 100.0);
            System.out.println("Parcela   | Juros         | Prestação     | Saldo devedor");

            for (int i = 1; i <= numeroMeses; i++) {
                double juros = saldoDevedor * taxaJuros;
                double prestacao = juros + amortizacao;
                saldoDevedor -= amortizacao;


                System.out.printf("Parcela %2d | Juros: R$ %.2f | Prestação: R$ %.2f | Saldo devedor: R$ %.2f\n",
                        i, juros, prestacao, saldoDevedor);


                totalJuros += juros;
                totalAmortizacao += amortizacao;
            }


            System.out.printf("\nTotal: Prestação R$ %.2f, Juros R$ %.2f, Amortização R$ %.2f\n", totalJuros + totalAmortizacao, totalJuros, totalAmortizacao);
        }
    }
