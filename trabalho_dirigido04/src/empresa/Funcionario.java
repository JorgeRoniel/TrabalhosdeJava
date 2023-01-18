package empresa;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Objects;
import java.text.SimpleDateFormat;

public class Funcionario {
	
	Calendar c1 = Calendar.getInstance();
	SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
	
	private String cpf;
	private String nome;
	private char sexo;
	private double salario_bruto;
	private GregorianCalendar data_nasc = new GregorianCalendar();
	private GregorianCalendar data_ad = new GregorianCalendar();
	
	
	public Funcionario() {
	
	}

	public Funcionario(String cpf, String nome, GregorianCalendar data_ad) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.data_ad = data_ad;
	}
	
	public Funcionario(String cpf, String nome, char sexo, double salario_bruto, GregorianCalendar data_nasc,
			GregorianCalendar data_ad) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.sexo = sexo;
		this.salario_bruto = salario_bruto;
		this.data_nasc = data_nasc;
		this.data_ad = data_ad;
	}

	public String getCpf() {
		return cpf;
	}
	
	public String getNome() {
		return nome;
	}
	
	public char getSexo() {
		return sexo;
	}

	public double getSalario_bruto() {
		return salario_bruto;
	}

	public GregorianCalendar getData_ad() {
		return data_ad;
	}

	public GregorianCalendar getData_nasc() {
		return data_nasc;
	}
	
	public double getBonificacao() {
		double bonificacao = this.salario_bruto * 0.2;
		return bonificacao;
	}
	
	public Boolean validarCpf() {
		if(this.cpf.length() > 14) {
			return false;
		}else {
			return true;
		}
	}
	
	public Boolean ValidaDataNasc() {
		if(data_nasc.get(Calendar.YEAR) >= 1920) {
			return true;
		}else {
			return false;
		}
	}
	
	public Boolean ValidaDataAd() {
		if(data_ad.get(Calendar.YEAR) >= 1995) {
			return true;
		}else {
			return false;
		}
	}
	
	public double SalarioLiq() {
		double novosalario = 0.0;
		if(this.salario_bruto <= 3000.0) {
			novosalario = this.salario_bruto * 0.17;
		}else if(this.salario_bruto > 3000.0) {
			novosalario = this.salario_bruto * 0.27;
		}
		return novosalario;
	}
	
	public int Idade() {
		GregorianCalendar hoje = new GregorianCalendar();
		int idade = 0;
		if(hoje.get(Calendar.YEAR) > data_nasc.get(Calendar.YEAR)) {
			if(hoje.get(Calendar.MONTH) == data_nasc.get(Calendar.MONTH)) {
				if(hoje.get(Calendar.DAY_OF_MONTH) >= data_nasc.get(Calendar.DAY_OF_MONTH)) {
					idade = hoje.get(Calendar.YEAR) - data_nasc.get(Calendar.YEAR);
				}else if(hoje.get(Calendar.DAY_OF_MONTH) < data_nasc.get(Calendar.DAY_OF_MONTH)) {
					idade = (hoje.get(Calendar.YEAR)-1) - data_nasc.get(Calendar.YEAR);
				}
			}else if(hoje.get(Calendar.MONTH) < data_nasc.get(Calendar.MONTH)) {
				idade = (hoje.get(Calendar.YEAR)-1) - data_nasc.get(Calendar.YEAR);
			}else if(hoje.get(Calendar.MONTH) > data_nasc.get(Calendar.MONTH)) {
				idade = hoje.get(Calendar.YEAR) - data_nasc.get(Calendar.YEAR);
			}
		}
		
		return idade;
	}
	
	public String DataAposentadoria() {
		GregorianCalendar dataAp = new GregorianCalendar();

		if(this.sexo == 'M') {
			dataAp.set(data_ad.get(Calendar.YEAR)+35, data_ad.get(Calendar.MONTH), data_ad.get(Calendar.DAY_OF_MONTH));
		}else if(this.sexo == 'F') {
			dataAp.set(data_ad.get(Calendar.YEAR)+30, data_ad.get(Calendar.MONTH), data_ad.get(Calendar.DAY_OF_MONTH));
		}
		
		return formatador.format(dataAp.getTime());
	}
	
	public Boolean eMaisVelho(Funcionario f) {
		if(f.Idade() > this.Idade()) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Funcionario:\n cpf: " + cpf + "\n nome: " + nome + "\n sexo: " + sexo + "\n salario_bruto: " + salario_bruto
				+ "\n data_nasc: " + formatador.format(data_nasc.getTime()) + "\n data_ad: " + formatador.format(data_ad.getTime()) + "";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		return Objects.equals(cpf, other.cpf) && Objects.equals(nome, other.nome) && sexo == other.sexo;
	}
	
	
}
