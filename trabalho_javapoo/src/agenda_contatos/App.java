package agenda_contatos;

import java.util.Scanner;
public class App {
	@SuppressWarnings({ "unused", "resource" })
	public static void menu(){
	    Scanner ler = new Scanner(System.in);
	    Agenda agen = new Agenda();
	    
	    int c = 0;
	    while(c < 10) {
	    	System.out.println("Qual operacao voce deseja fazer:\n1 - Adicionar Contato\n2 - Pesquisar Contatos\n3 - Atualizar contatos\n4 - Deletar Contato\n0 - Para sair.");
	    	int esc = ler.nextInt();
	    
	    	ler.nextLine();
	    	
	    	if(esc == 1) {
		    	System.out.println("Digite o nome do contato: ");
		    	String nome = ler.nextLine();
		    	
		    	System.out.println("Digite o numero do contato: ");
		    	int num = ler.nextInt();
		    	ler.nextLine();
		    	System.out.println("Digite o email do contato: ");
		    	String email = ler.nextLine();
		    	
		    	agen.InserirContatos(nome, num, email);
		    	
		    }else if(esc == 2) {
		    	System.out.println("Digite o nome do contato a ser pesquisado: ");
		    	String nom_e = ler.nextLine();
		    	
		    	agen.PesquisarContatos(nom_e);
		    }else if(esc == 3) {
		    	System.out.println("Digite o nome do contato que vai ser atualizado: ");
		    	String nome_antigo = ler.nextLine();
		    	
		    	System.out.println("Digite o novo nome do contato: ");
		    	String nome_novo = ler.nextLine();
		    	
		    	System.out.println("Digite o novo numero do contato: ");
		    	int num_novo = ler.nextInt();
		    	ler.nextLine();
		    	System.out.println("Digite o novo email do contato: ");
		    	String email_novo = ler.nextLine();
		    	
		    	agen.AtualizarContatos(nome_antigo, nome_novo, num_novo, email_novo);
		    	
		    }else if(esc == 4) {
		    	System.out.println("Digite o nome do contato a ser deletado: ");
		    	String nome_del = ler.nextLine();
		    	
		    	agen.DeletarContatos(nome_del);
		    }else if(esc == 0) {
		    	break;
		    }else {
		    	System.out.println("Escolha invalida!");
		    }
	    }
	    
	    
	}

	  public static void main(String[]args){
		  menu();
	  }
}
