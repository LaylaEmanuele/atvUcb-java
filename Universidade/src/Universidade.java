import java.util.ArrayList;

public class Universidade {
	String nome;
	ArrayList<Curso> cursos = new ArrayList<Curso>();
	
	void criarCurso() {
		Curso curso = Utils.criarCurso();
		this.cursos.add(curso);
	}
	void relatorio() {
		String msg;
		for (Curso curso : cursos) {
			msg = curso.toString();
			View.exibirMensagem(msg);
		}
	}
}
