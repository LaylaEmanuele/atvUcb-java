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
			View.exibirErro("O código do curso não pode ser negativo", "CURSO");
		}else {
			this.id = id;
		}
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome == null || nome.trim().length() == 0) {
			View.exibirErro("O nome não pode ser vazio!", "CURSO");
		}else {
			this.nome = nome;
		}
	}

	//Methods 
	void criarTurma() {
		if(this.turmas.size()>=3)
			View.exibirErro("Limite de turmas excedido!!", "CURSO");
		else {
			Turma turma = Utils.criarTurma();
			this.turmas.add(turma);
		}
	}
	void transferirAlunos() {
		
	}
	void transferirProf() {
		
	}
	
	public String toString() {
		String msg = "\nId do curso: " + this.id + "\nNome do curso: " + this.nome;
		for (Turma turma : turmas) {
			msg = msg+turma;
		}
		
		return msg;
	}
}
