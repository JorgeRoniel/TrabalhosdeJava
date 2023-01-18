package pessoaFisica_Juridica;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.Objects;

public class PessoaFisica extends Pessoa {
	private String cpf;
	private GregorianCalendar dataNasc = new GregorianCalendar();
	
	
	
	public PessoaFisica(String nome2, String cpf, GregorianCalendar dataNasc) {
		super(nome2);
		this.cpf = cpf;
		this.dataNasc = dataNasc;
	}

	@Override
	public Boolean validarDoc() {
		if(this.cpf.length() > 14) {
			return false;
		}else {
			return true;
		}
	}

	@Override
	public int CalcIdade() {
		GregorianCalendar hoje = new GregorianCalendar();
		
		int idade = 0;
		if(hoje.get(Calendar.YEAR) > dataNasc.get(Calendar.YEAR)) {
			if(hoje.get(Calendar.MONTH) == dataNasc.get(Calendar.MONTH)) {
				if(hoje.get(Calendar.DAY_OF_MONTH) >= dataNasc.get(Calendar.DAY_OF_MONTH)) {
					idade = hoje.get(Calendar.YEAR) - dataNasc.get(Calendar.YEAR);
				}else if(hoje.get(Calendar.DAY_OF_MONTH) < dataNasc.get(Calendar.DAY_OF_MONTH)) {
					idade = (hoje.get(Calendar.YEAR)-1) - dataNasc.get(Calendar.YEAR);
				}
			}else if(hoje.get(Calendar.MONTH) < dataNasc.get(Calendar.MONTH)) {
				idade = (hoje.get(Calendar.YEAR)-1) - dataNasc.get(Calendar.YEAR);
			}else if(hoje.get(Calendar.MONTH) > dataNasc.get(Calendar.MONTH)) {
				idade = hoje.get(Calendar.YEAR) - dataNasc.get(Calendar.YEAR);
			}
		}
		
		return idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public GregorianCalendar getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(GregorianCalendar dataNasc) {
		this.dataNasc = dataNasc;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cpf);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PessoaFisica other = (PessoaFisica) obj;
		return Objects.equals(cpf, other.cpf);
	}

	@Override
	public String toString() {
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		
		return "\n Nome:"+getNome()+" \n CPF:" + this.cpf + "\n Idade: "+ this.CalcIdade()+"\n Data de Nascimento:" + formatador.format(this.dataNasc.getTime()) + "\n";
	}
}