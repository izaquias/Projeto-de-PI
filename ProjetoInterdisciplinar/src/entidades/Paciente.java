package entidades;

public class Paciente {
	private long SUS;
	private String nome;
	private int idade;
	private String endereco;
	private String sintoma;
	
	public Paciente(long SUS, String nome, int idade, String endereco, String sintoma){
		this.SUS = SUS;
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
		this.sintoma = sintoma;
	}

	public long getSUS() {
		return SUS;
	}

	public void setSUS(long SUS) {
		this.SUS = SUS;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getSintoma() {
		return sintoma;
	}

	public void setSintoma(String sintoma) {
		this.sintoma = sintoma;
	}

}
