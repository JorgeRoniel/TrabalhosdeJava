package empresa;

import java.util.Arrays;
import java.util.GregorianCalendar;

public class Analista extends Funcionario{

	private String diagramas[];
	
	public Analista() {
		super();
		this.diagramas = new String[5];
	}
	
	public Analista(String cpf, String nome, char sexo, double salario_bruto, GregorianCalendar data_nasc,
			GregorianCalendar data_ad, String[] diagramas) {
		super(cpf, nome, sexo, salario_bruto, data_nasc, data_ad);
		this.setDiagramas(diagramas);
	}

	public String[] getDiagramas() {
		return diagramas;
	}

	public void setDiagramas(String diagramas[]) {
		this.diagramas = diagramas;
	}

	@Override
	public double getBonificacao() {
		double bonus = this.getSalario_bruto() * 0.3; 
		return bonus;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(diagramas);
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
		Analista other = (Analista) obj;
		return Arrays.equals(diagramas, other.diagramas);
	}
	
	@Override
	public String toString() {
		return "Analista:\n Nome: "+ this.getNome() +"\n Idade: "+ this.Idade()+"\n CPF: "+this.getCpf()+"\n Diagramas: " + Arrays.toString(diagramas) + "";
	}
	
}
