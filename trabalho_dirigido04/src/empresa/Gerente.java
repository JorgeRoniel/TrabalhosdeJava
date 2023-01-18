package empresa;

import java.util.Arrays;
import java.util.GregorianCalendar;

public class Gerente extends Funcionario {
	private String metodologiaDesenvolvimento[];

	public Gerente() {
		super();
		this.metodologiaDesenvolvimento = new String[5];
	}

	public Gerente(String cpf, String nome, char sexo, double salario_bruto, GregorianCalendar data_nasc,
			GregorianCalendar data_ad, String[] metodologiaDesenvolvimento) {
		super(cpf, nome, sexo, salario_bruto, data_nasc, data_ad);
		this.setMetodologiaDesenvolvimento(metodologiaDesenvolvimento);
	}
	
	public String[] getMetodologiaDesenvolvimento() {
		return metodologiaDesenvolvimento;
	}

	public void setMetodologiaDesenvolvimento(String[] metodologiaDesenvolvimento) {
		this.metodologiaDesenvolvimento = metodologiaDesenvolvimento;
	}

	@Override
	public double getBonificacao() {
		double bonus = this.getSalario_bruto() * 0.5;
		return bonus;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(metodologiaDesenvolvimento);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gerente other = (Gerente) obj;
		return Arrays.equals(metodologiaDesenvolvimento, other.metodologiaDesenvolvimento);
	}
	
	@Override
	public String toString() {
		return "Gerente:\n Nome: "+ this.getNome() +"\n Idade: "+ this.Idade()+"\n CPF: "+this.getCpf()+"\n Metodologias de Desenvolvimento: " + Arrays.toString(metodologiaDesenvolvimento) + "";
	}
	
}
