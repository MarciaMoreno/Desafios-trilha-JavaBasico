import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0; 
        boolean continuar = true;

        while (continuar) {
            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    // TODO: Ler o valor a ser depositado e atualizar/imprimir o saldo.
                    double valorDeposito = scanner.nextDouble();
                    double saldoAtual = valorDeposito + saldo;
                    System.out.println("Saldo atual: "+saldoAtual);
                    break;
                    
                case 2:
                    // TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                    double valorSaque = scanner.nextDouble();
                    double saldoSaque = saldo - valorSaque;
                    if(valorSaque < saldoSaque){
                        System.out.println("Saldo atual: "+saldoSaque);
                        System.out.println("Retire o dinheiro no local indicado");
                        double novoSaldo = saldoSaque - valorSaque;
                        System.out.println("\n"+novoSaldo);
                    }else{
                        System.out.println("Saldo insuficiente");
                    }
                    break;
                    
                case 3:
                    // TODO: Exibir o saldo atual da conta.
                    double saldoDisponivel = saldo;
                    System.out.println("Saldo atual: "+saldoDisponivel);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    continuar = true;
            }
        }
        scanner.close();
    }
}