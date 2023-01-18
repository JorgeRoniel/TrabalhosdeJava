package contas_de_luz;

import java.util.Scanner;
public class App {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		Contasdeluz minhaconta[] = new Contasdeluz[2];
		
		//instâncias das classes
		for(int i = 0; i < minhaconta.length; i++) {
			minhaconta[i] = new Contasdeluz();
		}
		
		//sequência de FORs para pegar os dados das contas
		for(int x = 0; x < minhaconta.length; x++) {
			System.out.println("Digite o codigo da conta do mes "+ (x+1));
			int cod = ler.nextInt();
			minhaconta[x].setcod(cod);
		}
		
		for(int a = 0; a < minhaconta.length; a++) {
			System.out.println("Digite o data da conta do mes "+ (a+1));
			int dat = ler.nextInt();
			minhaconta[a].setdata(dat);
		}
		
		for(int b = 0; b < minhaconta.length; b++) {
			System.out.println("Digite quantos KWs foram gastos no mes  "+ (b+1));
			float kw = ler.nextFloat();
			minhaconta[b].setkw(kw);
		}
		
		for(int c = 0; c < minhaconta.length; c++) {
			System.out.println("Digite o total a ser pago na conta do mes "+ (c+1));
			float total = ler.nextFloat();
			minhaconta[c].settotal(total);
		}
		
		for(int d = 0; d < minhaconta.length; d++) {
			System.out.println("A conta do mes "+ (d+1) + "foi paga? S/N");
			String pag = ler.next();
			minhaconta[d].setpagamento(pag);
		}
		
		for(int e = 0; e < minhaconta.length; e++) {
			System.out.println("Digite o data que a conta do mes "+ (e+1) + " foi paga, se nao foi paga, digite '0'");
			int dat_pag = ler.nextInt();
			minhaconta[e].setdat_pag(dat_pag);
		}
		
		for(int f = 0; f < minhaconta.length; f++) {
			System.out.println("Digite o data de vencimento da conta do mes "+ (f+1));
			int dat_venc = ler.nextInt();
			minhaconta[f].setdat_venc(dat_venc);
		}
		
		//Aqui é feita a apresentação dos dados das contas
		for(int g = 0; g < minhaconta.length; g++) {
			System.out.println("Os dados da conta do mes "+ (g+1) + ": ");
			System.out.println("codigo: " + minhaconta[g].getcod());
			System.out.println("A data da conta: " + minhaconta[g].getdata());
			System.out.println("O total de KWs gastos: " + minhaconta[g].getkw());
			System.out.println("O valor da conta: " + minhaconta[g].gettotal());
			System.out.println("Foi paga? " + minhaconta[g].getpagamento());
			System.out.println("Data de pagamento: " + minhaconta[g].getdat_pagamento());
			System.out.println("Data de Vencimento: " + minhaconta[g].getdat_vencimento());
			System.out.println();
		}
		
		//Pegar o mes com maior consumo
		float maior = 0;
		int mes_a = 0;
		for(int h = 0; h < minhaconta.length; h++) {
			if(minhaconta[h].kw_gasto > maior) {
				maior = minhaconta[h].kw_gasto;
				mes_a = h + 1;
			}
		}
		
		System.out.println("O mes com maior consumo foi: "+ mes_a);
		
		//Pegar o mes com menor consumo
		float menor = 9999;
		int mes_b = 0;
		for(int j = 0; j < minhaconta.length; j++) {
			if(minhaconta[j].kw_gasto < menor) {
				menor = minhaconta[j].kw_gasto;
				mes_b = j + 1;
			}
		}
		
		System.out.println("O mes com menor menor foi: "+ mes_b);
		
		//Faz a media de KWs consumidos
		float soma = 0;
		float media = 0;
		for(int k = 0; k < minhaconta.length; k++) {
			soma = soma + minhaconta[k].kw_gasto;
		}
		media =  soma / minhaconta.length;
		System.out.println("A media de consumo das contas foi: "+ media);
		System.out.println();
		
		//Armazena e exibe quais contas não foram pagas
		int n_pagas[] = new int [minhaconta.length];
		for(int l = 0; l < minhaconta.length; l++) {
			if(minhaconta[l].pagamento.equals("N")) {
				n_pagas[l] = l + 1;
			}
		}
		for(int m = 0; m < minhaconta.length; m++) {
			if(n_pagas[m] != 0) {
				System.out.println("As contas que não foram pagas foram as dos meses seguintes: "+ n_pagas[m]);
			}
		}
		
		int pagas_antes[] = new int[minhaconta.length];
		int pagas_depois[] = new int[minhaconta.length];
		for(int n = 0; n < minhaconta.length; n++) {
			if(minhaconta[n].data_pagamento <= minhaconta[n].data_vencimento) {
				pagas_antes[n] = n + 1;
			}else if(minhaconta[n].data_pagamento > minhaconta[n].data_vencimento) {
				pagas_depois[n] = n + 1;
			}else {
				pagas_antes[n] = 0;
				pagas_depois[n] = 0;
				break;
			}
		}
		for(int o = 0; o < minhaconta.length; o++) {
			if(pagas_antes[o] != 0) {
				System.out.println("Os meses das contas que foram pagas ate o dia do vencimento: "+ pagas_antes[o]);
			}
		}
		
		System.out.println();
		
		for(int p = 0; p < minhaconta.length; p++) {
			if(pagas_depois[p] != 0) {
				System.out.println("Os meses das contas que foram pagas depois do dia do vencimento: "+ pagas_depois[p]);
			}
		}
	}

}
