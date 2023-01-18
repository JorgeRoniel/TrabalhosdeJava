package agenda_contatos;

public class Contatos {
	private String nome = "";
	private int telefone = 0;
	private String email = "";
	
	public Contatos(String nome2, int telefone2, String email2) {
		this.setNome(nome2);
		this.setTelefone(telefone2);
		this.setEmail(email2);
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}	  
}