package ProcessoSeletivo;

public class SelecionandoCandidatos {
	
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
		String [] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO","MONICA","FABRICIO","MIRELA","DANIELA","JORGE"};
		double salarioBase = 2000.0;
		
		int candidatosSelecionados = 0;
		int candidatosAtual = 0;
		while(candidatosAtual <= candidatos.length) {
			double salarioPretendido = valorPretendido;
			
			System.out.println("O candidato " +candidato+ ", Solicitou o seguinte salario: "+ salarioPretendido);
			if(salarioBase >= salarioPretendido) {
				System.out.println(candidato+ ", ESTÁ SELECIONADO PARA A VAGA");
				candidatosSelecionados++;				
			}else {
				System.out.println("REPROVADO PARA A VAGA");
			}
			candidatosAtual++;
			break;			
		}
	}
}