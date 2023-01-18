package contas_de_luz;

public class Contasdeluz {
	
	int codigo;
	int data;
	float kw_gasto;
	float total_a_pagar;
	String pagamento;
	int data_pagamento;
	int data_vencimento;
	
	public void setcod(int codigo) {
		this.codigo = codigo;
	}
	
	public void setdata(int data) {
		this.data = data;
	}
	
	public void setkw(float kw_gasto) {
		this.kw_gasto = kw_gasto;
	}
	
	public void settotal(float total_a_pagar) {
		this.total_a_pagar = total_a_pagar;
	}
	
	public void setpagamento(String pagamento) {
		this.pagamento = pagamento;
	}
	
	public void setdat_pag(int data_pagamento) {
		this.data_pagamento = data_pagamento;
	}
	
	public void setdat_venc(int data_vencimento) {
		this.data_vencimento = data_vencimento;
	}
	
	public int getcod() {
		return codigo;
	}
	
	public int getdata() {
		return data;
	}
	
	public float getkw() {
		return kw_gasto;
	}
	
	public float gettotal() {
		return total_a_pagar;
	}
	
	public String getpagamento() {
		return pagamento;
	}
	
	public int getdat_pagamento() {
		return data_pagamento;
	}
	
	public int getdat_vencimento() {
		return data_vencimento;
	}
}
