package fiap.scj.ws.soap;

public class Pessoa {

	private String nome;
	private String grupoSan;
	private double peso;
	private double altura;
	private int idade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getGrupoSan() {
		return grupoSan;
	}
	public void setGrupoSan(String grupoSan) {
		this.grupoSan = grupoSan;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
}
