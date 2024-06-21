package exemplo.pacotes.b;

public class Carro extends Veiculos {

	public void ligar() {
		conferirCombustive();
		conferirCambio();
		System.out.println("CARRO LIGADO");
		
	}
	private void conferirCombustive() {
		System.out.println("COMBUSTIVEL OK");
	}
	private  void conferirCambio() {
		System.out.println("CAMBIO EM P");
	}
}

