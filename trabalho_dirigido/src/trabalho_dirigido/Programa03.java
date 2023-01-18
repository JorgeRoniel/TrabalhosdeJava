package trabalho_dirigido;

import java.util.Random;
public class Programa03 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		
		int vetor[] = new int[10];
		int maior = -99999;
		
		for(int i = 0; i < vetor.length; i++){
			vetor[i] = r.nextInt(20);
		}
		
		for(int j = 0; j < vetor.length; j++){
			if(vetor[j] > maior) {
				maior = vetor[j];
			}
		}
		for(int c = 0; c < vetor.length; c++){
			System.out.println(vetor[c]);
		}
		System.out.println("O maior numero do vetor e: " + maior);
		
		
	}

}
