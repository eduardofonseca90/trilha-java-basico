import java.util.Scanner;

public class VerificacaoChequeEspecial { 

    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 

        // Solicita ao usuário que informe o saldo atual da conta bancária
        System.out.println("Informe o saldo atual da conta bancaria:");
        double saldo = scanner.nextDouble(); 

        // Solicita ao usuário o valor do saque desejado
        System.out.println("Informe o valor do saque:");
        double saque = scanner.nextDouble(); 

        double limiteChequeEspecial = 500; 

        // Verifica se o saque é menor ou igual ao saldo disponível na conta
        if (saque <= saldo) {
            System.out.println("Transacao realizada com sucesso.");
        } else {
            // Se o saque ultrapassar o saldo disponível na conta
            double saldoDisponivelComChequeEspecial = saldo + limiteChequeEspecial;
            if (saque <= saldoDisponivelComChequeEspecial) {
                // Verifica se o saque ultrapassa o limite do cheque especial
                System.out.println("Transacao realizada com sucesso utilizando o cheque especial.");
            } else {
                // Se o saque ultrapassar o limite do cheque especial
                System.out.println("Transacao nao realizada. Limite do cheque especial excedido.");
            }
        }

        // Fechamos o objeto Scanner para liberar os recursos:
        scanner.close(); 
    }
}