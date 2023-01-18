package empresa;

import java.util.Arrays;
import java.util.GregorianCalendar;

public class Programador extends Funcionario {
	private String[] linguagens;
	
	public Programador() {
		super();
		this.linguagens = new String[5];
	}

	public Programador(String cpf, String nome, char sexo, double salario_bruto, GregorianCalendar data_nasc,
			GregorianCalendar data_ad, String[] linguagens) {
		super(cpf, nome, sexo, salario_bruto, data_nasc, data_ad);
		this.setLinguagens(linguagens);
	}
	
	

	public String[] getLinguagens() {
		return linguagens;
	}

	public void setLinguagens(String[] linguagens) {
		this.linguagens = linguagens;
	}

	@Override
	public String toString() {
		return "Programador:\n Nome: "+ this.getNome() +"\n Idade: "+ this.Idade()+"\n CPF: "+this.getCpf()+"\n linguagens: " + Arrays.toString(linguagens) + "";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(linguagens);
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
		Programador other = (Programador) obj;
		return Arrays.equals(linguagens, other.linguagens);
	}
}
