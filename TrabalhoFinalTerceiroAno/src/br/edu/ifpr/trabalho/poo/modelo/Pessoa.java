package br.edu.ifpr.trabalho.poo.modelo;

public abstract class Pessoa {
	
	protected String nome;
	protected String endereco;
	protected String dataNascimento;
	protected String telefoneContato;

	public abstract void imprimirDados();
	
	public Pessoa(){
		
	}
	
	public Pessoa(String nome_, String endereco_, String dataNascimento_, String telefoneContato_) {
		
		this.nome = nome_;
		this.endereco = endereco_;
		this.dataNascimento = dataNascimento_;
		this.telefoneContato = telefoneContato_;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getTelefoneContato() {
		return telefoneContato;
	}

	public void setTelefoneContato(String telefoneContato) {
		this.telefoneContato = telefoneContato;
	}
}