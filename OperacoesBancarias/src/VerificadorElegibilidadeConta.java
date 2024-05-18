import java.util.Scanner;

public class VerificadorElegibilidadeConta { 

    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 

        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt(); 

        // Verifica se a idade é maior ou igual a 18 e imprime a mensagem correspondente:
        if (idade >= 18) {
            System.out.println("Voce esta elegivel para criar uma conta bancaria.");
        } else {
            System.out.println("Voce nao esta elegivel para criar uma conta bancaria.");
        }

        // Fechamos o objeto Scanner para liberar os recursos:
        scanner.close(); 
    }
}