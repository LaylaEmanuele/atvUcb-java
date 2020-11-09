
public class Reptil extends Animal{
	String ordem;
	
	Reptil(String nome, String som, String descricao, String ordem){
		this.nome = nome;
		this.som = som;
		this.descricao = descricao;
		this.ordem = ordem;
	}

	@Override
	public String toString() {
		return "Reptil [ordem=" + ordem + ", nome=" + nome + ", som=" + som + ", descricao=" + descricao + "]";
	}

	
	
}
