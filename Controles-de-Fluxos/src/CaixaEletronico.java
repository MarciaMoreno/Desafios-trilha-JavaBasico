// CaixaEletronico.java
public class CaixaEletronico {
    public static void main(String[] args) {

       double saldo = 25.0;
       double valorSolicitado = 22.00;

       if(valorSolicitado < saldo){saldo = saldo - valorSolicitado;
        System.out.println("Novo saldo: " + saldo);
            }else
            System.out.println("Saldo insuficiente");

    }
}