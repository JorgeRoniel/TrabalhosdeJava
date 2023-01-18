package trabalho_dirigido;

import java.util.Random;
public class Programa02 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int par = 0;
		int impar = 0;
		int pos = 0;
		int neg = 0;
		int neu = 0;
		
		Random r = new Random();
		int vetor[] = new int[20];
		
		for(int i = 0;i < 20;i++) {
			vetor[i] = r.nextInt(20);
		}
		
		for(int j = 0; j < vetor.length; j++) {
			if(vetor[j] % 2 == 0) {
				par++;
			}else {
				impar++;
			}
			
			if(vetor[j] > 0) {
				pos++;
			}else if(vetor[j] == 0) {
				neu++;
			}else {
				neg++;
			}
		}
		System.out.println("Numeros pares: " + par);
		System.out.println("Numeros impares: " + impar);
		System.out.println("Numeros positivos: " + pos);
		System.out.println("Numeros negativos: " + neg);
		System.out.println("Numeros neutros: " + neu);
		
	}

}
