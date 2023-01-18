package trabalho_dirigido;

import java.util.Scanner;
public class programa05 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		float media = 0;
		double desvio = 0;
		
		System.out.println("Informe o numero de notas: ");
		int n = ler.nextInt();
		
		float v[] = new float[n];
		float num = 0;
		float sum = 0;
		for(int i = 0; i < v.length; i++) {
			System.out.println("Digite uma nota: ");
			num = ler.nextFloat();
			
			v[i] = num;
			sum = sum + num;
		}
		
		media = sum/n;
		double aux = 0;
		double sum2 = 0;
		for(int j = 0; j < v.length; j++) {
			aux = Math.pow(v[j] - media, 2);
			
			sum2 = sum2 + aux;
		}
		
		desvio = sum2/(n - 1);
		
		System.out.println("A media das notas e: " + media);
		System.out.println("O desvio padrao foi de: " + desvio);
		
		ler.close();
		
	}

}
