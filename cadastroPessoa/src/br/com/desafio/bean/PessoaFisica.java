package br.com.desafio.bean;

public class PessoaFisica extends Pessoa{
	
	private String cpf;
	private String rg;
	private boolean sexo;
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public boolean isSexo() {
		return sexo;
	}
	public void setSexo(boolean sexo) {
		this.sexo = sexo;
	}
	public PessoaFisica(String nome) {
		super(nome);

	}
	

	
	
}
