public class Aluno {
	//Atributos
	private int id;
	private String nome;
	
	//Construtores 
	Aluno(String nome, int id){
		setNome(nome);
		setId(id);
	}

	//Getters and Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		if(id < 0) {
			throw new IllegalArgumentException("[ALUNO]: A matricula não pode ser negativa");
		}else {
			this.id = id;
		}
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome == null || nome.trim().length() == 0) {
			throw new IllegalArgumentException("[ALUNO]: O nome não pode ser vazio!");
		}else {
			this.nome = nome;
		}
	}
	
	//Methods 
	public String toString() {
		return "[NOME]: " + this.nome + "[MATRICULA]: " + this.id;
	}
}
