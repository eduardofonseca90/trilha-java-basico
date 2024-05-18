import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que informe o limite diário de saque
        System.out.println("Informe o limite diário de saque:");
        double limiteDiario = scanner.nextDouble();

        // Inicialize uma variável para rastrear o limite restante
        double limiteRestante = limiteDiario;

        // Solicitar ao usuário que informe o valor do primeiro saque
        System.out.println("Informe o valor do primeiro saque:");
        double primeiroSaque = scanner.nextDouble();

        // Verifica se o valor do primeiro saque ultrapassa o limite diário
        if (primeiroSaque > limiteDiario) {
            System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
            scanner.close();
            return;
        }

        // Subtrai o valor do primeiro saque do limite diário
        limiteRestante -= primeiroSaque;
        System.out.println("Saque realizado. Limite restante: " + limiteRestante);

        // Loop para iterar sobre os saques
        for (int i = 2;; i++) {
            System.out.println("Informe o valor do saque " + i + ": (ou 0 para sair)");
            double valorSaque = scanner.nextDouble();

            // Verifica se o valor do saque é zero para encerrar as transações
            if (valorSaque == 0) {
                System.out.println("Transacoes encerradas.");
                break;
            }

            // Verifica se o valor do saque ultrapassa o limite diário
            if (valorSaque > limiteRestante) {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break;
            }

            // Se o valor do saque não ultrapassar o limite diário, subtrai o valor do saque do limite diário
            limiteRestante -= valorSaque;

            // Informa que o saque foi realizado com sucesso e mostra o limite restante
            System.out.println("Saque realizado. Limite restante: " + limiteRestante);
        }

        // Fechamos o Scanner para evitar vazamento de recursos
        scanner.close();
    }
}