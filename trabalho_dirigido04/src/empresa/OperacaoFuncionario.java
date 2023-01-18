package empresa;

public class OperacaoFuncionario {
	
	public static void Validos_Invalidos(Funcionario[] funcionarios) {
		
		String validos[] = new String[funcionarios.length];
		String invalidos[] = new String[funcionarios.length];
		
		for(int a = 0; a < funcionarios.length; a++) {
			if(funcionarios[a].validarCpf() == false || funcionarios[a].ValidaDataAd() == false || funcionarios[a].ValidaDataNasc() == false) {
				invalidos[a] = funcionarios[a].getNome();
			}else {
				validos[a] = funcionarios[a].getNome();
			}
		}
		
		System.out.println("Funcionarios com todos os Dados validos: ");
		for(int b = 0; b < funcionarios.length; b++) {
			if(validos[b] == null) {
				continue;
			}else {
				System.out.println(validos[b]);
			}
			
		}
		
		System.out.println("Funcionarios com Dados invalidos: ");
		for(int c = 0; c < funcionarios.length; c++) {
			if(invalidos[c] == null) {
				continue;
			}else {
				System.out.println(invalidos[c]);
			}
			
		}
	}
	
	@SuppressWarnings("unused")
	public static void Sexos(Funcionario[] funcionarios) {
		int cont_m = 0;
		int cont_f = 0;
		
		for(int d = 0; d < funcionarios.length; d++) {
			if(funcionarios[d].getSexo() == 'M') {
				cont_m++;
			}else {
				cont_f++;
			}
		}
		System.out.println("O numero de funcionarios homens: " + cont_m);
		System.out.println("O numero de funcionarias mulheres: " + cont_f);
	}
	
	public static void Salarios(Funcionario[] funcionarios) {
		double maior_salario = 0.0;
		String func_rico = "";
		double menor_salario = 99999999.0;
		String func_pobre = "";
		
		for(int e = 0; e < funcionarios.length; e++) {
			if(funcionarios[e].SalarioLiq() > maior_salario) {
				maior_salario = funcionarios[e].SalarioLiq();
				func_rico = funcionarios[e].getNome();
			}
			
			if(funcionarios[e].SalarioLiq() < menor_salario) {
				menor_salario = funcionarios[e].SalarioLiq();
				func_pobre = funcionarios[e].getNome();
			}
		}
		System.out.println("O funcionario "+func_rico+" ganha "+maior_salario+", entao ele e o que mais ganha na empresa.");
		System.out.println("O funcionario "+func_pobre+" ganha "+menor_salario+", entao ele e o que menos ganha na empresa.");
	}
	
	public static void MaisVelho(Funcionario[] funcionarios) {
		int maior_idade = 0;
		String mais_velho = "";
		int menor_idade = 999999999;
		String mais_novo = "";
		
		for(int i = 0; i < funcionarios.length; i++) {
			if(funcionarios[i].Idade() > maior_idade) {
				maior_idade = funcionarios[i].Idade();
				mais_velho = funcionarios[i].getNome();
			}
			
			if(funcionarios[i].Idade() < menor_idade) {
				menor_idade = funcionarios[i].Idade();
				mais_novo = funcionarios[i].getNome();
			}
		}
		
		System.out.println("O funcionario "+mais_velho+" tem "+maior_idade+" anos, entao ele e o mais velho na empresa.");
		System.out.println("O funcionario "+mais_novo+" tem "+menor_idade+" anos, entao ele e o mais novo na empresa.");
	}
	
	public static void Aposentadoria(Funcionario[] funcionarios) {
		for(int j = 0; j < funcionarios.length; j++) {
			System.out.println("O funcionario "+ funcionarios[j].getNome()+" se aposentara na data: "+funcionarios[j].DataAposentadoria());
		}
	}
	
	public static void Bonificacao(Funcionario[] funcionarios) {
		double soma_bonificacoes = 0;
		
		for(int k = 0; k < funcionarios.length; k++) {
			System.out.println("O funcionario "+ funcionarios[k].getNome()+" recebera: "+funcionarios[k].getBonificacao()+" de bonificacao");
			soma_bonificacoes = soma_bonificacoes + funcionarios[k].getBonificacao();
		}
		
		System.out.println("O total de bonificacoes e: "+ soma_bonificacoes);
	}
}
