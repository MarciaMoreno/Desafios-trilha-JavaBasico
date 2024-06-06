import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) {

        System.out.println("BANCO OURIVES");
        System.out.println("Seja Bem vindo...");
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);  

        //TODO:"Solicitando os dados da agencia" 
        System.out.println("Digite AGENCIA: ");
        int agencia = scanner.nextInt();
        
        /*TODO:"Solicitando os dados da CONTA" */
        System.out.println("Digite o NUMERO DA CONTA");
        int numeroConta = scanner.nextInt();

        /*TODO:"Solicitando os dados dO USUARIO" */ 
        System.out.println("Digite seu nome de USUARIO sem espaços: ");
        String nomeCliente = scanner.next();
        
        /*Digite a senha */
        System.out.println("Digite sua SENHA (1234)");
        int senha = scanner.nextInt();

        if(senha == 1234){ //imprimindo os dados obtidos pelo usuario
            System.out.println("_____________________________________________________________________");
            System.out.println("_____________________________________________________________________");
            System.out.println("BANCO OURIVES");
            System.out.println("AGENCIA " + agencia + "- Rua Comendador Filho 208 - Centro - São Paulo / SP");
            System.out.println("Seja Bem vindo " + nomeCliente);
            System.out.println("Sua conta corrente nº " + numeroConta + " / Possui o saldo de R$ 1.200 ");
            System.out.println("_____________________________________________________________________");
            System.out.println("_____________________________________________________________________");
            System.out.println("O QUE DESEJA FAZER? ");
            System.out.println("Digite 1 PARA SAQUE" );
            System.out.println("Digite 2 PARA SAIR" );
            int escolha = scanner.nextInt();
            if (escolha == 1) {
                int saldo = 1200;
                System.out.println("Digite o valor do saque: ");
                int saque = scanner.nextInt();
                System.out.println("_____________________________________________________________________");
                System.out.println("PRONTO, RETIRE O DINHEIRO NO LOCAL INDICADO");
                System.out.println("_____________________________________________________________________");

                int novoSaldo = saque - saldo;
                System.out.println("SEU NOVO SALDO: " + -novoSaldo);
                
            }else System.out.println("OBRIGADO POR UTILIZAR O NOSSO BANCO");  



        }else System.out.println("SENHA INCORRETA");  

       
       
    }
}
