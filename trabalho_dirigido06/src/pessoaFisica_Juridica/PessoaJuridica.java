package pessoaFisica_Juridica;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Objects;
import java.text.SimpleDateFormat;

public class PessoaJuridica extends Pessoa{
	private String cnpj;
	private GregorianCalendar dataCriacao = new GregorianCalendar();
	
	

	public PessoaJuridica(String nome, String cnpj, GregorianCalendar dataCriacao) {
		super(nome);
		this.cnpj = cnpj;
		this.dataCriacao = dataCriacao;
	}

	@Override
	public Boolean validarDoc() {
		if(this.cnpj.length() > 18) {
			return false;
		}else {
			return true;
		}
	}

	@Override
	public int CalcIdade() {
		GregorianCalendar hoje = new GregorianCalendar();
		int idade = 0;
		
		if(hoje.get(Calendar.YEAR) > dataCriacao.get(Calendar.YEAR)) {
			if(hoje.get(Calendar.MONTH) == dataCriacao.get(Calendar.MONTH)) {
				if(hoje.get(Calendar.DAY_OF_MONTH) >= dataCriacao.get(Calendar.DAY_OF_MONTH)) {
					idade = hoje.get(Calendar.YEAR) - dataCriacao.get(Calendar.YEAR);
				}else if(hoje.get(Calendar.DAY_OF_MONTH) < dataCriacao.get(Calendar.DAY_OF_MONTH)) {
					idade = (hoje.get(Calendar.YEAR)-1) - dataCriacao.get(Calendar.YEAR);
				}
			}else if(hoje.get(Calendar.MONTH) < dataCriacao.get(Calendar.MONTH)) {
				idade = (hoje.get(Calendar.YEAR)-1) - dataCriacao.get(Calendar.YEAR);
			}else if(hoje.get(Calendar.MONTH) > dataCriacao.get(Calendar.MONTH)) {
				idade = hoje.get(Calendar.YEAR) - dataCriacao.get(Calendar.YEAR);
			}
		}
		return idade;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public GregorianCalendar getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(GregorianCalendar dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cnpj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PessoaJuridica other = (PessoaJuridica) obj;
		return Objects.equals(cnpj, other.cnpj);
	}

	@Override
	public String toString() {
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		
		return "\n Empresa: "+this.getNome()+"\n CNPJ: " + cnpj + "\n Data de Criacao: " + formatador.format(dataCriacao.getTime()) + "\n";
	}	
}