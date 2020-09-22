import java.util.ArrayList;

public class Curso {
	//Atributtes
	private int id;
	private String nome;
	ArrayList<Turma> turmas = new ArrayList<Turma>();
	
	//Construtores
	Curso(int id, String nome){
		setId(id);
		setNome(nome);
	}
	
	//Getters and Setters 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		if(id < 0) {
			throw new IllegalArgumentException("[CURSO]: O código do curso não pode ser negativo");
		}else {
			this.id = id;
		}
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome == null || nome.trim().length() == 0) {
			throw new IllegalArgumentException("[CURSO]: O nome não pode ser vazio!");
		}else {
			this.nome = nome;
		}
	}

	//Methods 
	Turma criarTurma() {
		if(this.turmas.size()>=3)
			throw new IllegalArgumentException("[CURSO]: Limite de turmas excedido!!");
		else {
			Turma turma = Utils.criarTurma();
			this.turmas.add(turma);
			return turma;
		}
	}
	Turma acharTurma(int id) {
		int flag = 0;
		for (Turma turma : this.turmas) {
			if(turma.getId() == id) {
				return turma; 
			}
			flag = 1;
		}
		if(flag == 1) {
			throw new IllegalArgumentException("[MENU CURSO]: Turma não encontrada");
		}
		return null;
	}
	void transferirAlunos(Aluno aluno1, Turma turma1, Turma turma2) {
		turma1.alunos.remove(aluno1);
		turma2.alunos.add(aluno1);
	}
	void transferirProf(Professor prof1, Professor prof2, Turma turma1, Turma turma2) {
		turma1.setProfessor(prof2);
		turma2.setProfessor(prof1);
	}
	public String toString() {
		String msg = "\nId do curso: " + this.id + "\nNome do curso: " + this.nome;
		for (Turma turma : turmas) {
			msg = msg+turma;
		}
		
		return msg;
	}
}
