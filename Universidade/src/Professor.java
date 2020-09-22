
public class Professor {
	//Atributos
	private int id;
	private String nome;
	
	//Construtores 
	Professor(String nome, int id){
		this.nome = nome;
		this.id = id;
	}
	
	//Getters and Setters 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		if(id < 0) {
			throw new IllegalArgumentException("[PROFESSOR]: A matricula não pode ser negativa");
		}else {
			this.id = id;
		}
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome == null || nome.trim().length() == 0) {
			throw new IllegalArgumentException("[PROFESSOR]: O nome não pode ser vazio!");
		}else {
			this.nome = nome;
		}
	}

	//Methods
	public String toString() {
		return "[NOME]: " + this.nome + "[MATRICULA]: " + this.id;
	}
	
}
