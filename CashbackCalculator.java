//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class CashbackCalculator {

    public static void main(String[] args) {
        // criando um objeto Scanner para ler a entrada dos dados do cliente
        Scanner dadosEntrada = new Scanner(System.in);

        // solicitando o nome do cliente
        System.out.print("Nome do cliente: ");
        String nome = dadosEntrada.nextLine();

        // solicitando a idade do cliente
        System.out.print("Idade do cliente: ");
        int idade = dadosEntrada.nextInt();

        // solicitando o valor da compra
        System.out.print("Valor da compra: ");
        double valorCompra = dadosEntrada.nextDouble();

        // chamando um metodo para realizar o cálculo do cashback, e inserindo os argumentos que serao utilizados
        double cashback = calcularCashback(idade, valorCompra);

        // exibindo os resultados
        System.out.print("\n");
        System.out.printf("Cliente: %s\n", nome);
        System.out.printf("Idade: %d\n", idade);
        System.out.printf("Cashback: R$ %.2f\n", cashback);

        dadosEntrada.close();
    }


    // definindo o metodo utilizado para o cálculo do cashback
    public static double calcularCashback(int idade, double valorCompra) {
        double cashback = 0.0;

        if (idade >= 21 && valorCompra < 1000) {
            cashback = valorCompra * 0.05; // 5% de cashback
        } else if (idade > 21 && valorCompra < 1000) {
            cashback = valorCompra * 0.07; // 7% de cashback
        } else if (idade >= 21 && valorCompra > 1000) {
            cashback = valorCompra * 0.07; // 7% de cashback
        } else if (idade < 21 && valorCompra > 1000) {
            cashback = valorCompra * 0.10; // 10% de cashback
        }

        return cashback;
    }
}
