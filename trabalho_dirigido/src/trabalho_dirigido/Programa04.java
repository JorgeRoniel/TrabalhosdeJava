package trabalho_dirigido;

import java.util.Scanner;
public class Programa04 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		String senha = "a76dk09";
		
		System.out.println("Digite a senha: ");
		String sen = ler.nextLine();
		
		if(sen.equals(senha)) {
			System.out.println("Acesso Permitido!");
		}else {
			System.out.println("Acesso Negado!");
		}
		ler.close();
	}

}
