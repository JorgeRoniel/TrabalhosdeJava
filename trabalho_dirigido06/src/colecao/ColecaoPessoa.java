package colecao;
import java.util.ArrayList;

import pessoaFisica_Juridica.Pessoa;

public class ColecaoPessoa implements Colecao {
	private ArrayList<Pessoa> p = new ArrayList<Pessoa>();
	private int indice;
	
	@Override
	public Boolean inserirPessoa(Pessoa p) {
			this.indice++;
			
		return this.p.add(p);
	}
	
	@Override
	public Boolean removerExclusivo(int indice) {
		this.p.remove(indice);
		indice--;
		return true;
	}

	@Override
	public Boolean remover() {
		this.p.remove(this.indice-1);
		indice--;
		return true;
	}

	@Override
	public void atualizar(int indice, Pessoa p) {
		this.p.set(indice, p);
		
	}

	@Override
	public Boolean pesquisar(Pessoa p) {
		
		return this.p.contains(p);
	}

	@Override
	public Boolean colecaoEstaVazia() {
		
		return this.p.isEmpty();
	}

	@Override
	public void imprimirDadosColecao() {
		System.out.println(this.p.toString());
		
	}

	@Override
	public Pessoa retornarObjeto(int indice) {
		
		return this.p.get(indice);
	}
}