package br.edu.ifpr.trabalho.poo.teste; 

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

import br.edu.ifpr.trabalho.poo.implementacão.TrabalhoAluno;
import br.edu.ifpr.trabalho.poo.interfaces.ITrabalhoPOO;
import br.edu.ifpr.trabalho.poo.modelo.Aluno;
import br.edu.ifpr.trabalho.poo.modelo.Curso;
import br.edu.ifpr.trabalho.poo.modelo.Disciplina;
import br.edu.ifpr.trabalho.poo.modelo.Matricula;
import br.edu.ifpr.trabalho.poo.modelo.Professor;
import br.edu.ifpr.trabalho.poo.modelo.Turma;

public class ExemploDeTeste {
	
	
	public static void main(String[] args) {
		
		
		ITrabalhoPOO trabalho = new TrabalhoAluno();
		
		
		// ARRAY LIST ALUNO
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		
		// ARRAY LIST CURSO
		ArrayList<Curso> cursos = new ArrayList<Curso>();
		
		// ARRAY LIST TURMA
		ArrayList<Turma> turmas = new ArrayList<Turma>();
		
		// ARRAY LIST PROFESSOR
		ArrayList<Professor> professores = new ArrayList<Professor>();
		
		// ARRAY LIST DISCIPLINA
		ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
		
		// ARRAY LIST MATRÍCULA
		ArrayList<Matricula> matriculas = new ArrayList<Matricula>(); 
			
	
		// Leitura de Dados
		
		Aluno aluno = trabalho.lerDadosAluno();
		Professor professor = trabalho.lerDadosProfessor();
		Curso curso = trabalho.lerDadosCurso();
		Turma turma = trabalho.lerDadosTurma(curso);
		Disciplina disciplina = trabalho.lerDadosDisciplina(professor, turma);
		Matricula matricula = trabalho.lerDadosMatricula(aluno,turma);
		
		
		//	System.out.println(professor.toString());
		
		turmas.add(turma);
		disciplinas.add(disciplina);
		matriculas.add(matricula);
		alunos.add(aluno);
		professores.add(professor);
		cursos.add(curso);
	
		
		// Imprimindo Dados
		
	
		trabalho.listarAlunos(alunos);
		trabalho.listarDisciplinas(disciplinas);
		trabalho.listarProfessores(professores);
		trabalho.listarTurmas(turmas);
		trabalho.listarCursos(cursos);
		trabalho.listarMatriculasAtivas(matriculas);
		trabalho.listarTodasMatriculas(matriculas);
	
	
	}

}
