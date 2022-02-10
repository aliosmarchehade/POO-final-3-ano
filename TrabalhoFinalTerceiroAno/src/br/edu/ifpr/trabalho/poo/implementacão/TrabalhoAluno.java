package br.edu.ifpr.trabalho.poo.implementacão;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

import br.edu.ifpr.trabalho.poo.interfaces.ITrabalhoPOO;
import br.edu.ifpr.trabalho.poo.modelo.Aluno;
import br.edu.ifpr.trabalho.poo.modelo.Curso;
import br.edu.ifpr.trabalho.poo.modelo.Disciplina;
import br.edu.ifpr.trabalho.poo.modelo.Matricula;
import br.edu.ifpr.trabalho.poo.modelo.Professor;
import br.edu.ifpr.trabalho.poo.modelo.Turma;

public class TrabalhoAluno implements ITrabalhoPOO {

	@Override

	// LENDO OS DADOS DOS ALUNOS
	public Aluno lerDadosAluno() {

		Scanner teclado = new Scanner(System.in);

		// int anoDeIngresso = Integer.parseInt(JOptionPane.showInputDialog("Informe seu ano de ingresso"));
		System.out.println("Informe seu ano de ingresso: ");
		int anoDeIngresso = teclado.nextInt();

		teclado.nextLine();

		// String nome = JOptionPane.showInputDialog("Informe seu Nome: ");
		System.out.println("Informe seu nome: ");
		String nome = teclado.nextLine();

		// String endereco = JOptionPane.showInputDialog("Informe seu Endereço :");
		System.out.println("Informe seu endereço: ");
		String endereco = teclado.nextLine();

		// String telefoneContato = JOptionPane.showInputDialog("Informe seu telefone
		// para contato: ");
		System.out.println("Informe um telefone para contato: ");
		String telefoneContato = teclado.nextLine();

		// String dataNascimento = JOptionPane.showInputDialog("Informe sua data de
		// nascimento: ");
		System.out.println("Informe sua data de Nascimento: ");
		String dataNascimento = teclado.nextLine();

		Aluno aluno = new Aluno(nome, endereco, anoDeIngresso, telefoneContato, dataNascimento);

		return aluno;

	}

	@Override

	// LENDO DADOS PROFESSOR
	public Professor lerDadosProfessor() {

		Scanner teclado = new Scanner(System.in);

		// String nome = JOptionPane.showInputDialog("Informe o nome do seu professor
		// favorito ");
		System.out.println("Informe o nome do seu Professor favorito: ");
		String nome = teclado.nextLine();

		// String siape = JOptionPane.showInputDialog("Informe o siape dele ");
		System.out.println("Informe o siape do professor: ");
		String siape = teclado.nextLine();

		System.out.println("Informe o endereço do Professor: ");
		String endereco = teclado.nextLine();

		System.out.println("Informe a data de Nascimento do professor: ");
		String dataNascimento = teclado.nextLine();

		System.out.println("Informe o telefone de contato do professor: ");
		String telefoneContato = teclado.nextLine();

		Professor professor = new Professor(nome, siape, endereco, dataNascimento, telefoneContato);
		return professor;
	}

	@Override

	// LENDO OS DADOS DO CURSO

	public Curso lerDadosCurso() {

		Scanner teclado = new Scanner(System.in);

		// String nome = JOptionPane.showInputDialog("Informe seu Curso ");
		System.out.println("Informe seu curso: ");
		String nome = teclado.nextLine();

		Curso curso = new Curso(nome);

		String info = "Informática";
		String infoAnalfabetos = "Informatica";
		String meca = "Mecatrônica";
		String mecaAnalfabetos = "Mecatronica";
		String agro = "Agroindústria";
		String agroAnalfabetos = "Agroindustria";
		String infoo = "Info";
		String mecaa = "Meca";
		String agroo = "Agro";

		if (nome.equals(info) || nome.equals(infoAnalfabetos) || nome.contentEquals(infoo)) {
			System.out.println("***** LISTA DE DISCIPLINAS *****");
			System.out.println("Análise e Projeto de Sistemas");
			System.out.println("Biologia");
			System.out.println("Educação Física");
			System.out.println("Filosofia");
			System.out.println("Física");
			System.out.println("Geográfia");
			System.out.println("História");
			System.out.println("Introdução a Programação");
			System.out.println("Lingua Inglesa");
			System.out.println("Lingua Portuguesa");
			System.out.println("Matemática");
			System.out.println("Programação Orientada a Objetos");
			System.out.println("Química");
			System.out.println("Sistemas Operacionais");
			System.out.println("Sociologia\n");
		}

		if (nome.equals(meca) || nome.equals(mecaAnalfabetos) || nome.equals(mecaa)) {
			System.out.println("***** LISTA DE DISCIPLINAS *****");
			System.out.println("Administração e Empreendedorismo");
			System.out.println("Biologia");
			System.out.println("Comandos, Acionamentos e\r\n" + "Instalações de Máquinas\r\n" + "Elétricas" + "");
			System.out.println("Eletrônica Analógica");
			System.out.println("Filosofia");
			System.out.println("Física");
			System.out.println("Geografia");
			System.out.println("História");
			System.out.println("Lingua Inglesa");
			System.out.println("Lingua Portuguesa");
			System.out.println("Matemática");
			System.out.println("Tecnologia dos Materiais");
			System.out.println("Química");
			System.out.println("Sociologia\n");
		}

		if (nome.equals(agro) || nome.equals(agroAnalfabetos) || nome.equals(agroo)) {
			System.out.println("\n***** LISTA DE DISCIPLINAS *****");
			System.out.println("Biologia");
			System.out.println("Biotecnologia");
			System.out.println("Bioquimica dos Alimentos");
			System.out.println("Empreendedorismo e Inovação");
			System.out.println("Educação Física");
			System.out.println("Física");
			System.out.println("Filosofia");
			System.out.println("Geografia");
			System.out.println("História");
			System.out.println("Lingua Inglesa");
			System.out.println("Lingua Portuguesa");
			System.out.println("Matemática");
			System.out.println("Química");
			System.out.println("Química de Alimentos");
			System.out.println("Sociologia\n");
		}

		return curso;

	}

	@Override

	// LENDO DADOS TURMA
	public Turma lerDadosTurma() {

		Scanner teclado = new Scanner(System.in);

		// String turmaNome = JOptionPane.showInputDialog("Informe seu Nome da turma:
		// ");
		System.out.println("Informe o nome de sua turma: ");
		String turmaNome = teclado.nextLine();

		// int minAluno = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero
		// minimo de alunos "));
		System.out.println("Informe o número mínimo de alunos: ");
		int minAluno = teclado.nextInt();

		// int matriculados = Integer.parseInt(JOptionPane.showInputDialog("Informe o
		// numero de matriculados"));
		System.out.println("Informe o número de alunos matrículados: ");
		int matriculados = teclado.nextInt();

		Turma turma = new Turma(turmaNome, minAluno, matriculados);
		return turma;

	}

	@Override
	public Turma lerDadosTurma(Curso curso) {

		Turma turma2 = new Turma();
		turma2.setCurso(curso);

		Scanner teclado = new Scanner(System.in);

		// String turmaNome = JOptionPane.showInputDialog("Informe seu Nome da turma:
		// ");
		System.out.println("Informe o nome de sua turma: ");
		String turmaNome = teclado.nextLine();

		// int minAluno = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero
		// minimo de alunos "));
		System.out.println("Informe o número mínimo de alunos: ");
		int minAluno = teclado.nextInt();

		// int matriculados = Integer.parseInt(JOptionPane.showInputDialog("Informe o
		// numero de matriculados"));
		System.out.println("Informe o número de alunos matrículados: ");
		int matriculados = teclado.nextInt();
		teclado.nextLine();

		Turma turma = new Turma(turmaNome, minAluno, matriculados);
		return turma;

	}

	@Override

//LENDO DADOS DISCIPLINA
	public Disciplina lerDadosDisciplina() {

		Scanner teclado = new Scanner(System.in);
		String m = teclado.nextLine();

		// String favorita = JOptionPane.showInputDialog("Informe sua matéria favorita:
		// ");
		System.out.println("Qual sua matéria favorita? ");
		String favorita = teclado.nextLine();

		// int carga = Integer.parseInt(JOptionPane.showInputDialog("Informe a carga
		// horaria dela "));
		System.out.println("Carga horária dessa disciplina: ");
		int carga = teclado.nextInt();

		Disciplina disciplina = new Disciplina(favorita, carga);

		return disciplina;

	}

	@Override
	public Disciplina lerDadosDisciplina(Professor professor, Turma turma) {

		Disciplina disciplina2 = new Disciplina();
		disciplina2.setProfessor(professor);
		disciplina2.setTurma(turma);

		Scanner teclado = new Scanner(System.in);

		// String favorita = JOptionPane.showInputDialog("Informe sua matéria favorita:
		// ");
		System.out.println("Qual sua matéria favorita? ");
		String favorita = teclado.nextLine();

		// int carga = Integer.parseInt(JOptionPane.showInputDialog("Informe a carga
		// horaria dela "));
		System.out.println("Carga horária dessa disciplina: ");
		int carga = teclado.nextInt();

		Disciplina disciplina = new Disciplina(favorita, carga);

		return disciplina;
	}

	@Override
	public Matricula lerDadosMatricula() {

		Scanner teclado = new Scanner(System.in);
		Boolean matriculado;
		System.out.println("Você está devidamente matriculado? ");
		String m = teclado.nextLine();

		if (m.equalsIgnoreCase("Sim")) {
			matriculado = true;
		} else {

			matriculado = false;
		}

		String numero = teclado.nextLine();

		Matricula matricula = new Matricula(numero, matriculado);

		return matricula;
	}

	@Override
	public Matricula lerDadosMatricula(Aluno aluno, Turma turma) {

		Matricula matricula2 = new Matricula();
		matricula2.setAluno(aluno);
		matricula2.setTurma(turma);

		Scanner teclado = new Scanner(System.in);

		Boolean matriculado;
		System.out.println("Informe seu número de matrícula: ");
		String numero = teclado.nextLine();
		System.out.println("Você está devidamente matriculado? ");
		String m = teclado.nextLine();
		

		if (m.equalsIgnoreCase("Sim")) {
			matriculado = true;

		} else {
			matriculado = false;
		}

		Matricula matricula = new Matricula(numero, matriculado);

		return matricula;

	}

	@Override

	// LISTANDO OS DADOS DOS ALUNOS
	public void listarAlunos(ArrayList<Aluno> alunos) {

		System.out.println("\n-------- FICHA ALUNO --------\n");
		for (Aluno a : alunos) {

			System.out.println("Nome aluno: " + a.getNome());
			System.out.println("Ano de ingresso: " + a.getAnoDeIngresso());
			System.out.println("Endereço: " + a.getEndereco());
			System.out.println("Sua data de nascimento é: " + a.getDataNascimento());
			System.out.println("Seu telefone para contato é: " + a.getTelefoneContato());

		}
	}

	@Override

	// LISTANDO OS DADOS DO CURSO
	public void listarCursos(ArrayList<Curso> cursos) {

		for (Curso a : cursos) {
			System.out.println("Nome do curso: " + a.getNome());
			System.out.println("---------------------------------" + "\n");

		}
	}

	@Override

//LISTANDO OS DADOS DAS TURMAS
	public void listarTurmas(ArrayList<Turma> turmas) {

		for (Turma a : turmas) {
			System.out.println("Nome da turma: " + a.getNomeTurma());
			System.out.println("Número mínimo de alunos : " + a.getNumeroMinimo());
			System.out.println("Número de alunos matrículados " + a.getAlunosMatriculados());
		}

	}

	@Override

//LISTANDO DISCIPLINA
	public void listarDisciplinas(ArrayList<Disciplina> disciplinas) {

		for (Disciplina a : disciplinas) {

			System.out.println("Sua disciplina favorita é: " + a.getNome());
			System.out.println("A carga horária dela é de: " + a.getCargaHoraria());
		}
	}

	@Override
	public void listarProfessores(ArrayList<Professor> professores) {

		for (Professor a : professores) {
			System.out.println("O nome do professor favorito é: " + a.getNome());
			System.out.println("O siape dele é: " + a.getSiape());
			System.out.println("A data de nascimento do professor é: " + a.getDataNascimento());
			System.out.println("O endereço do professor é: " + a.getEndereco());
			System.out.println("O telefone de contato do professor é: " + a.getTelefoneContato());
		}

	}

	@Override
	public void listarMatriculasAtivas(ArrayList<Matricula> matriculas) {

		for (Matricula a : matriculas) {

			if (a.isAtiva() == true) {

				System.out.println("Seu número de matricula é: " + a.getNumero());
				System.out.println("Sua matrícula está Ativa! ");
			} else {
				System.out.println("Sua matrícula está inativa!");
			}
		}
	}

	@Override
	public void listarTodasMatriculas(ArrayList<Matricula> matriculas) {

	}

}
