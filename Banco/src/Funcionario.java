
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
			throw new IllegalArgumentException("[FUNCION�RIO]: O nome n�o pode ser vazio!");
		}else {
			this.nome = nome;
		}
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		if(id<0) {
			throw new IllegalArgumentException("[FUNCION�RIO]: O id n�o pode ser vazio!");
		}else {
			this.id = id;
		}
	}

	


}
