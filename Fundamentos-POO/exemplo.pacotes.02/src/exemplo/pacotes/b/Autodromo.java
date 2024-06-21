package exemplo.pacotes.b;

public class Autodromo {

	public static void main(String[] args) {
		Carro jeep  = new Carro(); 
		jeep.setChassi("74474744-0");
		jeep.ligar();
		
		Moto z400 = new Moto();
		z400.setChassi("46775444-0");
		z400.ligar();
	}

	
	
}
