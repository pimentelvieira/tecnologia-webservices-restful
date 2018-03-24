package fiap.scj.ws.soap;

import javax.xml.ws.Endpoint;

public class Servidor {

	public static void main(String[] args) {
		MinhaSaudeImp service = new MinhaSaudeImp();
		Endpoint.publish("http://localhost:8080/minhasaude", service);
		System.out.println("No ar!");
	}
}
