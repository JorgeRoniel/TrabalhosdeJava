package teste;

import empresa.Funcionario;
import empresa.Programador;
import empresa.Analista;
import empresa.Gerente;
import empresa.OperacaoFuncionario;
import java.util.GregorianCalendar;
import java.util.Scanner;

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
	public static GregorianCalendar DataAd() {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o ano que voce ingressou na empresa: ");
		int ano = ler.nextInt();
		
		System.out.println("Digite o mes que voce ingressou na empresa: ");
		int mes = ler.nextInt();
		
		System.out.println("Digite o dia que voce ingressou na empresa: ");
		int dia = ler.nextInt();
		
		GregorianCalendar dataAd = new GregorianCalendar(ano, (mes-1), dia);
		return dataAd;
	}
	
	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario[] f = new Funcionario[12];
		String linguagens[] = {"Java", "Python"};
		String diagramas[] = {"Classes", "Sequencias"};
		String metodos[] = {"XP", "Scrum"};
		
		
		f[0] = new Programador("093.456.120-98", "Jorge", 'M', 1300, DataNasc(), DataAd(), linguagens);
		f[1] = new Programador("092.777.120-00", "Rogervania", 'F', 1300, DataNasc(), DataAd(), linguagens);
		f[2] = new Programador("123.453.333-34", "Robson", 'M', 1300, DataNasc(), DataAd(), linguagens);
		f[3] = new Programador("120.347.995-12", "Carlos", 'M', 1300, DataNasc(), DataAd(), linguagens);
		f[4] = new Programador("777.128.487-26", "Clara", 'F', 1300, DataNasc(), DataAd(), linguagens);
		f[5] = new Programador("092.034.234-18", "Maria", 'F', 1300, DataNasc(), DataAd(), linguagens);
		
		f[6] = new Analista("093.023.899-26", "Bruno", 'M', 1500, DataNasc(), DataAd(), diagramas);
		f[7] = new Analista("092.043.121-98", "Joana", 'F', 1500, DataNasc(), DataAd(), diagramas);
		f[8] = new Analista("231.444.871-77", "Igor", 'M', 1500, DataNasc(), DataAd(), diagramas);
		f[9] = new Analista("777.376.981-76", "Ellen", 'F', 1500, DataNasc(), DataAd(), diagramas);
		
		f[10] = new Gerente("987.456.865-22", "Carla", 'F', 2400, DataNasc(), DataAd(), metodos);
		f[11] = new Gerente("987.456.865-22", "William", 'M', 2400, DataNasc(), DataAd(), metodos);
		
		for(int b = 0; b < f.length; b++) {
			System.out.println(f[b]);
			System.out.println();
		}
		
		OperacaoFuncionario.Aposentadoria(f);
		System.out.println();
		OperacaoFuncionario.Bonificacao(f);
		
	}

}
