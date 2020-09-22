import java.util.ArrayList;

public class Universidade {
	//Atributes
	private String nome;
	ArrayList<Curso> cursos = new ArrayList<Curso>();
	
	//Construtores 
	Universidade(String nome) {
		setNome(nome);
	}

	//Getters and Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome.trim().length() == 0) {
			throw new IllegalArgumentException("[UNIVERSIDADE]: O nome não pode ser vazio!");
		}else {
			this.nome = nome;
		}
	}
	
	//Methods 
	Curso acharCurso(int id) {
		int flag = 0;
		for (Curso curso : this.cursos) {
			if(curso.getId() == id) {
				return curso; 
			}
		}
		flag = 1;
		if(flag == 1) {
			throw new IllegalArgumentException("[UNIVERSIDADE]: Curso não encontrado");
		}
		return null;
	}
	void relatorio() {
		String msg;
		for (Curso curso : cursos) {
			msg = curso.toString();
			View.exibirMensagem(msg);
		}
	}
}
