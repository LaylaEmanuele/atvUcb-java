import java.util.ArrayList;

public class Turma {
	//Atributos
	private int id;
	private Professor professor = null;
	ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	
	//Construtores
	Turma(int id){
		setId(id);
	}
	
	//Getters and Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		if(id < 0) {
			throw new IllegalArgumentException("[TURMA]: O ID da turma não pode ser negativo");
		}else {
			this.id = id;
		}
	}
	Aluno acharAluno(int id) {
		int flag = 0; 
		for (Aluno aluno : this.alunos) {
			if(aluno.getId() == id) {
				return aluno; 
			}	
		}
		if(flag == 1) {
			throw new IllegalArgumentException("[MENU CURSO]: Aluno não encontrado");
		}
		return null;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		if(professor == null) {
			throw new IllegalArgumentException("[TURMA]: Informe um professor valido ");
		}else {
			this.professor = professor;
		}
	}

	//Methods 
	void addAluno() {
		if (this.alunos.size()>=5)
			throw new IllegalArgumentException("[TURMA]: Turma cheia!");
		else {
			Aluno aluno = Utils.criarAluno();
			this.alunos.add(aluno);
		}
	}
	void removerAluno() {
		if (this.alunos.size()>=5)
			throw new IllegalArgumentException("[TURMA]: Turma cheia!");
		else {
			Aluno aluno = Utils.criarAluno();
			this.alunos.remove(aluno);
		}
	}
	void addProf() {
		if(this.professor != null)
			throw new IllegalArgumentException("[TURMA]: Já tem um professor essa turma!");
		else {
			Professor prof = Utils.criarProfessor();
			this.professor = prof;
		}
	}
	public String toString() {
		String msg = "\nID da turma: " + this.id + "\nProfessor:" + this.professor +"\nAlunos:";
		for (Aluno aluno : alunos) {
			msg = msg + aluno;
		}
		return msg;
	}
}
