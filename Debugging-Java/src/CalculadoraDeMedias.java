/**
 * CalculadoraDeMedias
 */
import java.util.Scanner;

public class CalculadoraDeMedias {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] alunos = {"Camila", "Lucas", "Bruna", "Pedro"};

        Double media = calculaMediaDaTurma(alunos, scan);

        System.out.printf("Media da Turma %.2f", media);
    }
    
    public static double calculaMediaDaTurma(String[] alunos, Scanner scanner){

        double soma = 0; 
        for(String aluno : alunos){
            System.out.printf("Nota do aluno %s: ", aluno);
            double nota = scanner.nextInt();
            soma += nota;
        }

        return soma / alunos.length;
    }
}