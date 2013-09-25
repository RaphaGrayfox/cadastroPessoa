package br.com.desafio.inpl;

import br.com.desafio.bean.PessoaJuridica;
import br.com.desafio.inter.PessoaCRUD;

public class ImplementaPJ extends PessoaJuridica implements PessoaCRUD{

	public ImplementaPJ(String nome) {
		super(nome);
		
	}

	@Override
	public void inserir() {
		System.out.println("Cadastro realizado com sucesso!!!");
		
	}

	@Override
	public void editar() {
		System.out.println("Edição feita com sucesso!!!!");
	}

	@Override
	public void deletar() {
		System.out.println("Deletado com sucesso!!!");
		
	}

	@Override
	public void selecionar() {
		System.out.println("Listagem");
		
	}

}
