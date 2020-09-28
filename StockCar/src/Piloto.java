
public class Piloto {
	//Attributes
	private String nome;
	private int id;
	private int posicao = 0;
	
	//Construtor 
	Piloto(String nome, int id){
		setNome(nome);
		setId(id);
	}
	
	//Getters and Setters 
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome == null || nome.trim().length() == 0) {
			throw new IllegalArgumentException("[PILOTO]: O nome não pode ser vazio!");
		}else {
			this.nome = nome;
		}
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		if(id < 0) {
			throw new IllegalArgumentException("[PILOTO]: O ID não pode ser negativo");
		}else {
			this.id = id;
		}
	}
	public int getPosicao() {
		return posicao;
	}
	public void setPosicao(int posicao) {
		if(posicao < 0) {
			throw new IllegalArgumentException("[PILOTO]: A posição não pode ser negativa");
		}else {
			this.posicao = posicao;
		}
	}

	//Methods
	@Override
	public String toString() {
		return "Piloto [nome=" + nome + ", id=" + id + "]";
	}
	
	
}
