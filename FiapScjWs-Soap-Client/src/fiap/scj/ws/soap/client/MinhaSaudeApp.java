package fiap.scj.ws.soap.client;

public class MinhaSaudeApp {

	public static void main(String[] args) {
		MinhaSaudeImp servico = new MinhaSaudeImpService().getMinhaSaudeImpPort();
		System.out.println("Seu IMC é: " + servico.calcularImc(1.6f, 62f));
		System.out.println("Você está: " + servico.resultadoIMC(servico.calcularImc(1.6f, 62f)));
	}
}
