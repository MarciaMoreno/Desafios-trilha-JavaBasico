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
            System.out.println("Seja Bem vindo" + nomeCliente);
            System.out.println("Sua conta corrente" + numeroConta + " Possui o saldo de R$ 1.200 ");
        }else System.out.println("SENHA INCORRETA");  

       
    }
}
