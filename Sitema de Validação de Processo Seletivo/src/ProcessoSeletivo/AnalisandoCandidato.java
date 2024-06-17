package ProcessoSeletivo;

public class AnalisandoCandidato {
	
	public static void main(String[] args) {		
		analisarCandidato("FELIPE", 1200.00);
		analisarCandidato("MARCIA", 7000.00);
		analisarCandidato("JULIA", 1500.00);
		analisarCandidato("PAULO", 2500.00);
		analisarCandidato("AUGUSTO", 1200.00);
		analisarCandidato("MONICA", 2000.00);
		analisarCandidato("FABRICIO", 1500.00);
		analisarCandidato("MIRELA", 1800.00);
		analisarCandidato("DANIELA", 2200.00);
		analisarCandidato("JORGE", 5000.00);
	}
	
	static void analisarCandidato(String candidato, double salarioPrentendido) {
		double salarioBase = 2000.00;
		if(salarioBase > salarioPrentendido) {
			System.out.println("VAMOS LIGAR PARA O CANDIDATO " + candidato);
		}else if(salarioBase == salarioPrentendido) {
			System.out.println("LIGAREMOS PARA " + candidato + ": FAREMOS UMA CONTRA PROPOSTA");
		}else {
			System.out.println("AGUARDANDO PROXIMA CANDIDATURA");
		}
			
	}
}
