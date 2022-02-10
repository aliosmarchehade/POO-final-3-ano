package br.edu.ifpr.trabalho.poo.modelo;

public class Aluno extends Pessoa {

	private int anoDeIngresso;
	private String nome;
	
	private Pessoa pessoa;
	
	public Aluno(String nome, String endereco, int anoDeIngresso, String dataNascimento, String telefoneContato){
		this.nome = nome;
		this.endereco = endereco;
		this.anoDeIngresso = anoDeIngresso;
		this.dataNascimento = dataNascimento;
		this.telefoneContato = telefoneContato;
		
		
		
	}

	public void setAnoDeIngresso(int anoDeIngresso) {
		this.anoDeIngresso = anoDeIngresso;
	}

	public Aluno(int anoDeIngresso_, String nome_) {
		
		this.anoDeIngresso = anoDeIngresso_;
		this.nome = nome_;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoDeIngresso() {
		return anoDeIngresso;
	}

	@Override
	public void imprimirDados() {
		// TODO Auto-generated method stub
		
	}

	
}
