package fiap.scj.ws.soap.client;

public class MinhaSaudeApp {

	public static void main(String[] args) {
		MinhaSaudeImp servico = new MinhaSaudeImpService().getMinhaSaudeImpPort();
		System.out.println("Seu IMC �: " + servico.calcularImc(1.6f, 62f));
		System.out.println("Voc� est�: " + servico.resultadoIMC(servico.calcularImc(1.6f, 62f)));
	}
}
