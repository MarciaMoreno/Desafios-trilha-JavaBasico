package ProcessoSeletivo;

public class ListandoAprovados {
	
	private static int candidato;
	public static void main(String[] args) {
		selecionaCandidatos("FELIPE", 1200.00);
		selecionaCandidatos("MARCIA", 7000.00);
		selecionaCandidatos("JULIA", 1500.00);
		selecionaCandidatos("PAULO", 2500.00);
		selecionaCandidatos("AUGUSTO", 1200.00);
		selecionaCandidatos("MONICA", 2000.00);
		selecionaCandidatos("FABRICIO", 1500.00);
		selecionaCandidatos("MIRELA", 1800.00);
		selecionaCandidatos("DANIELA", 2200.00);
		selecionaCandidatos("JORGE", 5000.00);		
	}
	static void selecionaCandidatos(String candidato, double valorPretendido) {
		double salarioBase = 2000.0;	
		
		 if(salarioBase >= valorPretendido) {
			 int aprovado = selecionar();
		 System.out.println(candidato + " APROVADO PARA PRÓXIMA ETAPA");
		 }else {
			 System.out.println();
		 }
	}
	static int selecionar() {
		int x = candidato;
		for(x=1; x < 5 ; x += 5);
		return candidato;
	}
}
