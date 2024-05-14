import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;

        // Loop infinito para manter o programa em execução até que o usuário decida sair
        while (true) {
            // Exibir o menu de opções
            System.out.println("Menu:");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Consultar Saldo");
            System.out.println("0. Encerrar");
            System.out.print("Escolha uma opção: ");
            

            int opcao = scanner.nextInt();

            // Implementação das operações baseado na opção escolhida pelo usuário
            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor a ser depositado: ");
                    double valorDeposito = scanner.nextDouble();
                    saldo += valorDeposito;
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 2:
                    System.out.print("Digite o valor a ser sacado: ");
                    double valorSaque = scanner.nextDouble();
                    if (valorSaque > saldo) {
                        System.out.println("Saldo insuficiente.");
                    } else {
                        saldo -= valorSaque;
                        System.out.println("Saldo atual: " + saldo);
                    }
                    break;
                case 3:
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    return; // Sai do método main, encerrando o programa
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}