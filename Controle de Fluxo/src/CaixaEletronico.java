public class CaixaEletronico {

    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 15.0;

        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;

            System.out.println("=================================");
            System.out.println("SAQUE REALIZADO COM SUCESSO!");
            System.out.println("SEU NOVO SALDO É DE: R$ " + saldo);
            System.out.println("=================================");
        }
        
        else {
            System.out.println("Saldo Insuficiente");
        }
    }
    
}
