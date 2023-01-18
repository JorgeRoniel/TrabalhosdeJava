package agenda_contatos;

import java.util.Objects;

public class Agenda {
  private Contatos cntts[] = new Contatos[4];
  private int a = 0;
  public void InserirContatos(String nome, int telefone, String email){
    
      cntts[a] = new Contatos(nome, telefone, email);
      a++;
  }

  public void PesquisarContatos(String nome){
	  for(int b = 0; b < cntts.length; b++) {
		  if(cntts[b] == null) {
			  break;
		  }else {
			  if(Objects.equals(cntts[b].getNome(), nome)) {
				  System.out.println("Os dados do contato "+ (b+1) + ": ");
				  System.out.println("Nome: " + cntts[b].getNome());
				  System.out.println("Telefone: " + cntts[b].getTelefone());
				  System.out.println("Email: " + cntts[b].getEmail());
				  break;
			  }
		  }
	  }
	  System.out.println("Contato nao encontrado!");
  }

  public void AtualizarContatos(String nome_a,String n_nome, int n_numero, String n_email){
	  for(int c = 0; c < cntts.length; c++) {
		  if(cntts[c] == null) {
			  break;
		  }else {
			  if(Objects.equals(cntts[c].getNome(), nome_a)) {
				  cntts[c].setNome(n_nome);
				  cntts[c].setTelefone(n_numero);
				  cntts[c].setEmail(n_email);
				  break;
			  }
		  }
	  }
  }

  public void DeletarContatos(String nome_del){
	  for(int d = 0; d < cntts.length; d++) {
		  if(cntts[d] == null) {
			  break;
		  }else {
			  if(Objects.equals(cntts[d].getNome(), nome_del)) {
				  cntts[d].setNome(null);
				  cntts[d].setTelefone(0);
				  cntts[d].setEmail(null);
				  System.out.println("Contato deletado");
				  break;
			  }
		  }
	  }
  }
}
