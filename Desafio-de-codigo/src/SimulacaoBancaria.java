import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0; 
        boolean continuar = true;
        
        System.out.println("1 - DEPOSITAR");
        System.out.println("2 - SACAR");
        System.out.println("3 - CONSULTAR SALDO");
        System.out.println("4 - ENCERRAR");

        while (continuar) {
            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    // TODO: Ler o valor a ser depositado e atualizar/imprimir o saldo.
                    System.out.println("Digite o valor do Deposito: ");
                    double valorDeposito = scanner.nextDouble();
                    double saldoAtual = valorDeposito + saldo;
                    System.out.println("Saldo atual {saldo com 1 casa decimal}: "+saldoAtual);
                    System.out.println("\n\n02 - SACAR");
                    System.out.println("3 - CONSULTAR SALDO");
                    System.out.println("4 - ENCERRAR");
                    break;
                    
                case 2:
                    // TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                    System.out.println("Digite o valor do Saque: ");
                    double valorSaque = scanner.nextDouble();
                    double saldoSaque = 50.0;
                    if(valorSaque < saldoSaque){
                        System.out.println("Saldo atual: {saldo com 1 casa decimal}"+saldoSaque);
                        System.out.println("Retire o dinheiro no local indicado");
                        double novoSaldo = saldoSaque - valorSaque;
                        System.out.println("\n"+novoSaldo);
                    }else{
                        System.out.println("Saldo insuficiente");
                    }
                    System.out.println("\n 3 - CONSULTAR SALDO");
                    System.out.println("4 - ENCERRAR");
                    break;
                    
                case 3:
                    // TODO: Exibir o saldo atual da conta.
                    double saldoDisponivel = 50.0;
                    System.out.println("Saldo atual: {saldo com 1 casa decimal}"+saldoDisponivel);
                    System.out.println("\n4 - ENCERRAR");
                    break;
                case 4:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}