import java.util.Locale;
import java.util.Scanner;

public class Contador{
	
	public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		System.out.println("Digite um numero entre 1 e 20: ");
		int numeroA = scanner.nextInt();
		System.out.println("Digite um numero entre 21 e 50: ");
		int numeroB = scanner.nextInt();
		try {
			contar(numeroA, numeroB);
		} catch (ParametrosInvalidosException e) {
			// TODO Auto-generated catch block
			System.out.println("\rDigitação incorreta - siga a orientação acima! ");
			e.printStackTrace();
			
		}
			
		scanner.close();
	}
	
	static void contar(int numeroA, int numeroB) throws ParametrosInvalidosException{
		if( numeroA > 20 && numeroB < 21) {
			System.out.println("\rDigitação incorreta - siga a orientação acima! ");
		}else {
			int resultado = numeroB - numeroA;
			System.out.println("Contaremos em ordem crescente até o número: "+resultado);
			int x;
			for( x=0; x<=resultado; x++) {
				System.out.println(" "+x);
			}
		}
	}
	
}