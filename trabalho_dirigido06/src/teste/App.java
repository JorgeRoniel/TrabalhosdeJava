package teste;

import java.util.GregorianCalendar;
import java.util.Scanner;

import pessoaFisica_Juridica.PessoaFisica;
import pessoaFisica_Juridica.PessoaJuridica;
import colecao.ColecaoPessoa;

public class App {
	@SuppressWarnings("resource")
	public static GregorianCalendar DataNasc() {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o ano que voce nasceu: ");
		int ano = ler.nextInt();
		
		System.out.println("Digite o mes que voce nasceu: ");
		int mes = ler.nextInt();
		
		System.out.println("Digite o dia que voce nasceu: ");
		int dia = ler.nextInt();
		
		GregorianCalendar data_nasc = new GregorianCalendar(ano, (mes-1), dia);
		return data_nasc;
	}
	
	@SuppressWarnings("resource")
	public static GregorianCalendar DataCriacao() {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o ano que voce criou essa pj: ");
		int ano = ler.nextInt();
		
		System.out.println("Digite o mes que voce criou essa pj: ");
		int mes = ler.nextInt();
		
		System.out.println("Digite o dia que voce criou essa pj: ");
		int dia = ler.nextInt();
		
		GregorianCalendar dataCriacao = new GregorianCalendar(ano, (mes-1), dia);
		return dataCriacao;
	}
	
	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		PessoaFisica pf;
		PessoaJuridica pj;
		ColecaoPessoa cp = new ColecaoPessoa();
		int op = 1; 
		
		while(op != 0) {
			System.out.println("Escolha o que voce deseja fazer:\n 1 - Inserir Pessoa\n 2 - Remover ultima pessoa cadastrada\n 3 - Remover uma pessoa exclusiva\n 4 - Atualizar pessoa\n 5 - Pesquisar pessoa\n 6 - Mostrar todas as pessoas\n 0 - Sair");
			op = ler.nextInt();
			
			if(op == 1) {
				System.out.println("Voce deseja cadastrar uma Pessoa:\n 1 = Fisica\n 2 = Juridica");
				int opc = ler.nextInt();
				
				if(opc == 1) {
					ler.nextLine();
					System.out.println("Digite seu nome: ");
					String nome = ler.nextLine();
					
					System.out.println("Digite seu cpf: ");
					String cpf = ler.nextLine();
					
					cp.inserirPessoa(pf = new PessoaFisica(nome, cpf, DataNasc()));
					
				}else if(opc == 2) {
					ler.nextLine();
					System.out.println("Digite o nome da sua empresa: ");
					String nome = ler.nextLine();
					
					System.out.println("Digite seu cnpj: ");
					String cnpj = ler.nextLine();
					
					
					cp.inserirPessoa(pj = new PessoaJuridica(nome, cnpj, DataCriacao()));
					
				}else {
					System.out.println("Opcao invalida!");
				}
			}else if(op == 2) {
				if(cp.remover() == true) {
					System.out.println("A ultima pessoa inserida foi excluida!");
				}else {
					System.out.println("Erro na hora de excluir!");
				}
			}else if(op == 3) {
				System.out.println("Digite o numero da pessoa que voce deseja excluir: ");
				int ind  = ler.nextInt();
				
				if(cp.removerExclusivo(ind) == true) {
					System.out.println("A pessoa escolhida foi excluida!");
				}else {
					System.out.println("Erro na hora de excluir!");
				}
				
			}else if(op == 4) {
				int ind = 0;
				System.out.println("Digite o numero da pessoa que voce deseja atualizar: ");
				ind = ler.nextInt();
				
				System.out.println("Voce deseja atualizar uma Pessoa:\n 1 = Fisica\n 2 = Juridica");
				int opc = ler.nextInt();
				
				if(opc == 1) {
					ler.nextLine();
					System.out.println("Digite o novo nome: ");
					String n_nome = ler.nextLine();
					
					System.out.println("Digite o novo cpf: ");
					String n_cpf = ler.nextLine();
					
					cp.atualizar(ind, pf = new PessoaFisica(n_nome, n_cpf, DataNasc()));
					
				}else if(opc == 2) {
					ler.nextLine();
					System.out.println("Digite o novo nome da sua empresa: ");
					String n_nome = ler.nextLine();
					
					System.out.println("Digite o novo cnpj: ");
					String n_cnpj = ler.nextLine();
					
					
					cp.atualizar(ind, pj = new PessoaJuridica(n_nome, n_cnpj, DataCriacao()));
					
				}else {
					System.out.println("Opcao invalida!");
				}
			}else if(op == 5) {
				System.out.println("Digite o numero da pessoa que deseja pesquisar: ");
				int ind = ler.nextInt();
				
				System.out.println(cp.retornarObjeto(ind));
			}else if(op == 6) {
				cp.imprimirDadosColecao();
			}
		}
		System.out.println("Sistema Finalizado");
	}
}
