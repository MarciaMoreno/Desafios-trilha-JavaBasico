package aplicativo.mensagens;
/*
 * Simulação do uso da classe MSNMessenger
 */
public class ComputadorPedrinho {
	public static void main(String[] args) {
		System.out.println("MSNMessenger");
		MSNMessenger msn = new MSNMessenger();
		msn.enviarMensagem();		
		msn.receberMensagem();
		System.out.println("\n-------------------------------------------------------------------");
		
		System.out.println("Facebook");
		FacebookMessenger fcb = new FacebookMessenger();
		fcb.enviarMensagem();		
		fcb.receberMensagem();
		System.out.println("\n-------------------------------------------------------------------");

		System.out.println("Telegram");
		Telegram tlg = new Telegram();
		tlg.enviarMensagem();		
		tlg.receberMensagem();
		System.out.println("\n-------------------------------------------------------------------");

	}
}