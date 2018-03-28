package fiap.scj.rest;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Aluno {

	private String nome;
	private Integer ra;
	public Aluno() {
	}
	public Aluno(String nome, Integer ra) {
		this.nome = nome;
		this.ra = ra;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getRa() {
		return ra;
	}
	public void setRa(Integer ra) {
		this.ra = ra;
	}
}
