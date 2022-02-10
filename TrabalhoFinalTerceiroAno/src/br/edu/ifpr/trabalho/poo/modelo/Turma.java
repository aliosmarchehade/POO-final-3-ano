package br.edu.ifpr.trabalho.poo.modelo;

public class Turma {
	
	private String nomeTurma;
	private int alunosMatriculados;
	private int numeroMinimo;
	
	
	private Curso curso;
	
	public Turma(String nomeTurma_, int alunosMatriculados_, int numeroMinimo_) {
		this.alunosMatriculados = alunosMatriculados_;
		this.numeroMinimo = numeroMinimo_;
		this.nomeTurma = nomeTurma_;
		
	}

	public int getAlunosMatriculados() {
		return alunosMatriculados;
	}

	public void setAlunosMatriculados(int alunosMatriculados) {
		this.alunosMatriculados = alunosMatriculados;
	}

	public int getNumeroMinimo() {
		return numeroMinimo;
	}

	public void setNumeroMinimo(int numeroMinimo) {
		this.numeroMinimo = numeroMinimo;
	}

	public String getNomeTurma() {
		return nomeTurma;
	}

	public void setNomeTurma(String nomeTurma) {
		this.nomeTurma = nomeTurma;
	}

	public Turma(){
		
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		
	}


	

	
}
