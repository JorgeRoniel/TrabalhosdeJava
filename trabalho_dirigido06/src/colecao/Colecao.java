package colecao;
import pessoaFisica_Juridica.Pessoa;

public interface Colecao {
	
	public Boolean inserirPessoa(Pessoa p);
	public Boolean remover();
	public Boolean removerExclusivo(int indice);
	public void atualizar(int indice, Pessoa p);
	public Boolean pesquisar(Pessoa p);
	
	public Boolean colecaoEstaVazia();
	public void imprimirDadosColecao();
	public Pessoa retornarObjeto(int indice);
}
