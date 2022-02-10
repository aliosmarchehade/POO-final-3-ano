package br.edu.ifpr.trabalho.poo.modelo;

public final class Professor extends Pessoa {

	private String siape;
	
	private Pessoa pessoa;

	@Override
	public void imprimirDados() {
		
	}
	
	public Professor(String nome, String siape, String endereco, String dataNascimento, String telefoneContato){
		this.nome = nome;
		this.siape = siape;
		this.endereco = endereco;
		this.dataNascimento = dataNascimento;
		this.telefoneContato = telefoneContato;
		
		
	}
	
	

	public Professor (String siape_) {
		this.siape = siape_;
	}

	public String getSiape() {
		return siape;
	}

	public void setSiape(String siape) {
		this.siape = siape;
	}
	
	
}

