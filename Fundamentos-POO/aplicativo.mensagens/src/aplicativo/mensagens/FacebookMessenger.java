package aplicativo.mensagens;

public class FacebookMessenger extends ServicoDeMensagemInstantanea {

	@Override
	public void enviarMensagem() {
		System.out.println("Enviando mensagem pelo Aplicativo Facebook");
	}
	private void validarConectadoInternet() {
		System.out.println("Verificando a conexão com a internet");
	}

	@Override
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Aplicativo Facebook");

	}

	private void salvarHistoricoMensagem() {
		System.out.println("Salvando o hitorico no Aplicativo Facebook");
	}

}
