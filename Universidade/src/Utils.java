
public class Utils {
	static Aluno criarAluno() {
		String nomeGerado = View.solicitarString("Informe o nome do Aluno: ", "ALUNO");
		int idGerado = View.solicitarInt("Informe o id do Aluno: ", "ALUNO");
		Aluno fulano = new Aluno (nomeGerado, idGerado);
		return fulano;
	}
	static Professor criarProfessor() {
		String nomeGerado = View.solicitarString("Informe o nome do Professor: ", "PROFESSOR");
		int idGerado = View.solicitarInt("Informe o id do Professor: ", "PROFESSOR");
		Professor fulano = new Professor (nomeGerado, idGerado);
		return fulano;
	}
	static Turma criarTurma() {
		int idGerado = View.solicitarInt("Informe o id da turma: ", "TURMA");
		Turma turma = new Turma (idGerado);
		return turma;
	}
	static Curso criarCurso() {
		String nomeGerado = View.solicitarString("Informe o nome do Curso: ", "CURSO");
		int idGerado = View.solicitarInt("Informe o id do Curso: ", "CURSO");

		Curso curso = new Curso (idGerado, nomeGerado);
		return curso;
	}
	
}
