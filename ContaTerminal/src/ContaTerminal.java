import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da conta:");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da agência:");
        String agencia = scanner.next();

        System.out.println("Por favor, digite seu nome:");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite seu sobrenome:");
        String sobrenomeCliente = scanner.next();

        System.out.println("Por favor, digite o valor depositado:");
        Double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente +" "+ sobrenomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo R$ " + saldo + " já está disponnível para saque."); 
    }
}
