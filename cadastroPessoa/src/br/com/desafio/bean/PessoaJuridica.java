package br.com.desafio.bean;

public class PessoaJuridica extends Pessoa{
	
	private String cnpj;
	private String inscricaoEstadual;
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}
	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}
	
	public PessoaJuridica(String nome) {
		super(nome);
	}
}
