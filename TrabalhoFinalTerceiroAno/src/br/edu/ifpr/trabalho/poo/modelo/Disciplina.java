package br.edu.ifpr.trabalho.poo.modelo;

public class Disciplina {

	
	private String nome;
	private int cargaHoraria;
	
	private Professor professor;
	private Turma turma;
	
	public Disciplina(){ 
		
	} 
	
	public Disciplina (String nome, int cargaHoraria, Professor professor, Turma turma){
		this.nome = nome ;
		this.cargaHoraria = cargaHoraria;
	}
	
	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	public Disciplina(String nome_, int cargaHoraria_) {
		this.nome = nome_;
		this.cargaHoraria = cargaHoraria_;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	} 	

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	
	
	
	
}
