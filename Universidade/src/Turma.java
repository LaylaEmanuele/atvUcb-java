import java.util.ArrayList;

public class Turma {
	//Atributos
	private int id;
	Professor professor = null;
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
			View.exibirErro("O ID da turma não pode ser negativo", "TURMA");
		}else {
			this.id = id;
		}
	}

	//Methods 
	void addAluno() {
		if (this.alunos.size()>=5)
			View.exibirErro("Turma cheia!", "TURMA");
		else {
			Aluno aluno = Utils.criarAluno();
			this.alunos.add(aluno);
		}
	}
	void addProf() {
		if(this.professor != null)
			View.exibirErro("Já tem um professor essa turma!", "TURMA");
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
