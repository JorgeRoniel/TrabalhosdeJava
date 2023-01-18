package pessoaFisica_Juridica;

public abstract class Pessoa {
	private String nome;

	public Pessoa(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + "]";
	}

	public abstract Boolean validarDoc();
	public abstract int CalcIdade();
}
