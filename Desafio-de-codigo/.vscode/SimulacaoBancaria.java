import java.util.Scanner;

public class SimulacaoBancaria {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;
        System.out.println("\n\nMENU DE SERVIÇOS");
        System.out.println("Digite 01 para DEPOSITAR");
        System.out.println("Digite 02 para SAQUES");
        System.out.println("Digite 03 para exibir SALDO ATUAL");
        System.out.println("Digite 04 para sair");
        System.out.println("\n\n\n**");


        while (continuar) {
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // TODO: Ler o valor a ser depositado e atualizar/imprimir o saldo.
                    System.out.println("Processando o valor do Deposito: ");
                    double valorDeposito = 50.0;
                    double saldoAtualizado = saldo + valorDeposito;
                    System.out.println("Saldo atualizado: "+ saldoAtualizado);
                    continuar();
                    break;
                case 2:
                    // TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                    final double valorSaque = 100.0;                    
                    if(valorSaque>50.0){
                        System.out.println("Solicitando saque de 100,00");
                        System.out.println("Seu saldo é insuficiente");
                        opcao = scanner.nextInt();
                    }else{
                        System.out.println("Aguarde o valor solicitado");
                    }
                    break;
                case 3:
                    // TODO: Exibir o saldo atual da conta.
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }

    private static void continuar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'continuar'");
    }
}
    

