package fiap.scj.ws.soap;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class MinhaSaudeImp {

	@WebMethod
	public double calcularImc(Pessoa pessoa) {
		return pessoa.getPeso() / (pessoa.getAltura() * pessoa.getAltura());
	}
	
	@WebMethod
	public Resultado resultadoIMC(double imc) {
		Resultado res = new Resultado();
		
		if (imc < 17)
			res.setSituacao("Muito abaixo do peso");
		if(imc >= 17 && imc < 18.5)
			res.setSituacao("Abaixo do peso");
		if(imc >= 18.5 && imc < 24.99)
			res.setSituacao("Peso normal");
		if(imc >= 25 && imc < 29.99)
			res.setSituacao("Acima do peso");
		if(imc >= 30 && imc < 34.99)
			res.setSituacao("Obesidade I");
		if(imc >= 35 && imc < 39.99)
			res.setSituacao("Obesidade II");
		else
			res.setSituacao("Obesidade III");
		
		return res;
	}
}
