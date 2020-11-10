
abstract public class Funcionario {
	//Attributes
	private String nome;
	private int id;

	//Getters and Setters 
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		if(nome == null || nome.trim().length() == 0) {
			throw new IllegalArgumentException("[FUNCIONÁRIO]: O nome não pode ser vazio!");
		}else {
			this.nome = nome;
		}
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		if(id<0) {
			throw new IllegalArgumentException("[FUNCIONÁRIO]: O id não pode ser vazio!");
		}else {
			this.id = id;
		}
	}

	


}
