package colecao_dvds;

import java.util.Scanner;
public class App {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite quantos DVDs voce deseja cadrastrar: ");
		int n = ler.nextInt();
		
		Dvd meudvd[] = new Dvd[n];
		for(int a = 0; a < meudvd.length; a++) {
			meudvd[a] = new Dvd();
		}
		
		for(int b = 0; b < meudvd.length; b++) {
			System.out.println("Digite o codigo do DVD "+ (b +1) +": ");
			int cod = ler.nextInt();
			meudvd[b].setCodigo(cod);
		}
		
		ler.nextLine();
		for(int c = 0; c < meudvd.length; c++) {
			System.out.println("Digite o titulo do DVD " + (c+1) +": ");
			String titulo = ler.nextLine();
			meudvd[c].setTitulo(titulo);
		}
		
		for(int d = 0; d < meudvd.length; d++) {
			System.out.println("Digite o ano de lancamento do DVD "+(d+1)+": ");
			int ano = ler.nextInt();
			meudvd[d].setAno(ano);
		}
		
		ler.nextLine();
		for(int e = 0; e < meudvd.length; e++) {
			System.out.println("Digite o genero do DVD "+(e+1)+": ");
			String gen = ler.nextLine();
			meudvd[e].setGenero(gen);
		}
		
		for(int f = 0; f < meudvd.length; f++) {
			System.out.println("Digite o valor pago pelo DVD "+(f+1)+": ");
			float valor_pg = ler.nextFloat();
			meudvd[f].setValor(valor_pg);
		}
		
		ler.nextLine();
		for(int g = 0; g < meudvd.length; g++) {
			System.out.println("Digite a gravadora do DVD "+(g+1)+": ");
			String grav = ler.nextLine();
			meudvd[g].setGravadora(grav);
		}
		
		for(int h = 0; h < meudvd.length; h++) {
			System.out.println("Digite o nome do autor do DVD "+(h+1)+": ");
			String nome_a = ler.nextLine();
			meudvd[h].setNome_autor(nome_a);
		}
		
		for(int i = 0; i < meudvd.length; i++) {
			System.out.println("Digite como atua o autor do DVD "+(i+1)+", solo ou em grupo: ");
			String atuacao = ler.nextLine();
			meudvd[i].setAtuacao(atuacao);
		}
		System.out.println();
		
		for(int j = 0; j < meudvd.length; j++) {
			System.out.println("Os dados do DVD "+ (j+1) + ": ");
			System.out.println("Titulo: " + meudvd[j].getTitulo());
			System.out.println("Codigo: " + meudvd[j].getCodigo());
			System.out.println("Ano de lancamento: " + meudvd[j].getAno());
			System.out.println("Genero: " + meudvd[j].getGenero());
			System.out.println("Valor Pago: " + meudvd[j].getValor());
			System.out.println("Autor: " + meudvd[j].getNome_autor());
			System.out.println("O autor atua: " + meudvd[j].getAtuacao());
			System.out.println();
		}
		
		//Pegando o DVD mais caro e o mais barato
		float maior = 0;
		String mais_caro = "";
		for(int k = 0; k < meudvd.length; k++) {
			if(meudvd[k].getValor() > maior) {
				maior = meudvd[k].getValor();
				mais_caro = meudvd[k].getTitulo();
			}
		}
		
		float menor = 9999999;
		String mais_barato = "";
		for(int l = 0; l < meudvd.length; l++) {
			if(meudvd[l].getValor() < menor) {
				menor = meudvd[l].getValor();
				mais_barato = meudvd[l].getTitulo();
			}
		}
		
		if(mais_caro.equals(mais_barato)) {
			System.out.println("Ambos os DVDs tem o mesmo preco");
		}else {
			System.out.println("O DVD mais caro e: " + mais_caro);
			System.out.println("O DVD mais barato e: "+ mais_barato);
		}
		
		//Fazendo a soma do total gasto com DVDs
		float soma = 0;
		for(int m = 0; m < meudvd.length; m++) {
			soma = soma + meudvd[m].getValor();
		}
		System.out.println("O total gasto com DVDs e: " + soma);
		
		String dvd_solo[] = new String[meudvd.length];
		for(int o = 0; o < meudvd.length; o++) {
			if(meudvd[o].getAtuacao().equals("solo")) {
				dvd_solo[o] = meudvd[o].getTitulo();
			}
		}
		
		System.out.println();
		System.out.println("DVDs de artistas solos: ");
		for(int p = 0; p < meudvd.length; p++) {
			if(dvd_solo[p] == null) {
				continue;
			}else {
				System.out.println(dvd_solo[p]);
			}
			
		}
	}

}
