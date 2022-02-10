package br.edu.ifpr.trabalho.poo.interfaces;

import java.util.ArrayList;

import br.edu.ifpr.trabalho.poo.modelo.Aluno;
import br.edu.ifpr.trabalho.poo.modelo.Curso;
import br.edu.ifpr.trabalho.poo.modelo.Disciplina;
import br.edu.ifpr.trabalho.poo.modelo.Matricula;
import br.edu.ifpr.trabalho.poo.modelo.Professor;
import br.edu.ifpr.trabalho.poo.modelo.Turma;

public interface ITrabalhoPOO {

	Aluno lerDadosAluno();
	Professor lerDadosProfessor();
	Curso lerDadosCurso();
	Turma lerDadosTurma();
	Turma lerDadosTurma(Curso curso);	
	Disciplina lerDadosDisciplina();
	Disciplina lerDadosDisciplina(Professor professor, Turma turma);
	Matricula lerDadosMatricula();
	Matricula lerDadosMatricula(Aluno aluno, Turma turma);
	
	
	
	
	void listarMatriculasAtivas(ArrayList<Matricula> matriculas);
	void listarTodasMatriculas(ArrayList<Matricula> matriculas);
	void listarAlunos(ArrayList<Aluno> alunos);
	void listarTurmas(ArrayList<Turma> turmas);
	void listarProfessores(ArrayList<Professor> professores);
	void listarCursos(ArrayList<Curso> cursos);
	void listarDisciplinas(ArrayList<Disciplina> disciplinas);
	
	
	
}
