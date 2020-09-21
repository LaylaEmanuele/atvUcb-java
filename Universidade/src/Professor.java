
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
			View.exibirErro("A matricula não pode ser negativa", "PROFESSOR");
		}else {
			this.id = id;
		}
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome == null || nome.trim().length() == 0) {
			View.exibirErro("O nome não pode ser vazio!", "PROFESSOR");
		}else {
			this.nome = nome;
		}
	}

	//Methods
	public String toString() {
		return "[NOME]: " + this.nome + "[MATRICULA]: " + this.id;
	}
	
}
