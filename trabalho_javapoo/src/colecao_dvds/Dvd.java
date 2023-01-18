package colecao_dvds;

public class Dvd {
	Autor autor = new Autor();
	
	private String titulo;
	private int codigo;
	private int ano_lanc;
	private String genero;
	private float valor_pago;
	private String gravadora;
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setAno(int ano_lanc) {
		this.ano_lanc = ano_lanc;
	}
	
	public int getAno() {
		return ano_lanc;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public void setValor(float valor_pago) {
		this.valor_pago = valor_pago;
	}
	
	public float getValor() {
		return valor_pago;
	}
	
	public void setGravadora(String gravadora) {
		this.gravadora = gravadora;
	}
	
	public String getGravadora() {
		return gravadora;
	}
	
	public void setNome_autor(String nome_autor) {
		this.autor.nome= nome_autor;
	}
	
	public String getNome_autor() {
		return autor.nome;
	}
	
	public void setAtuacao(String atuacao) {
		this.autor.atua = atuacao;
	}
	
	public String getAtuacao() {
		return autor.atua;
	}
}
