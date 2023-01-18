package trabalho_dirigido;

import java.util.Scanner;
public class Programa06 {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite a hora Atual: ");
		int h1 = ler.nextInt();
		
		System.out.println("Digite os minutos atuais: ");
		int m1 = ler.nextInt();
		
		System.out.println("Digite a hora que voce deseja acordar: ");
		int h2 = ler.nextInt();
		
		System.out.println("Digite os minutos que voce deseja acordar: ");
		int m2 = ler.nextInt();
		
		if(((h1 > 23 || h1 < 0) && (h2 > 23 || h2 <0)) && ((m1 > 59 || m1 < 0) && (m2 > 59 || m2 < 0))) {
			System.out.println("Houve um erro, reveja o que foi digitado e tente novamente.");
		}else {
			int instanteInicial = (h1 * 60) + m1;
			int instanteFinal = (h2 * 60) + m2;
			int duracao = 0;
			
			if(instanteInicial < instanteFinal) {
				duracao = instanteFinal - instanteInicial;
			}else {
				duracao = (24 * 60 + instanteFinal) - instanteInicial;
			}
			
			System.out.println("O alarme soara em " + duracao + " minutos.");
		}
	}

}
