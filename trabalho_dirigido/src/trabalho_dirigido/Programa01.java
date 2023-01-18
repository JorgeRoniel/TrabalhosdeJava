package trabalho_dirigido;

import java.util.Scanner;
public class Programa01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		float n1 = ler.nextFloat();
		
		System.out.println("Agora, digite o segundo numero: ");
		float n2 = ler.nextFloat();
		
		System.out.println("Digite o simbolo da operacao que deseja realizar:\n+ = soma;\n- = subtracao;\n* = multiplicacao;\n/ = divisao.\n");
		char op = ler.next().charAt(0);
		
		if(op == '+') {
			float soma = n1 + n2;
			System.out.println("A soma dos numeros digitados e: "+ soma);
		}else if(op == '-') {
			float sub = n1 - n2;
			System.out.println("A subtracao dos numeros digitados e: "+ sub);
		}else if(op == '*') {
			float prod = n1 * n2;
			System.out.println("O produto dos numeros digitados e: "+ prod);
		}else if(op == '/') {
			if(n2 == 0) {
				System.out.println("A divisao por zero nao pode ser efetuada, tente novamente.");
			}else {
				float div = n1 / n2;
				System.out.println("A divisao dos numeros digitados e: "+ div);
			}
		}else {
			System.out.println("Valor Invalido!");
		}
		
		ler.close();
	}

}
