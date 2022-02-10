package br.edu.ifpr.trabalho.poo.modelo;

public class Matricula {
	
	private String numero;
	private boolean ativa;
	
	private Aluno aluno;
	private Turma turma;
	
	public Matricula(){
		 
	}
	
	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	public Matricula(String numero_, boolean ativa_) {
		
		this.numero = numero_;
		this.ativa = ativa_;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public boolean isAtiva() {
		return ativa;
	}

	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}

}
