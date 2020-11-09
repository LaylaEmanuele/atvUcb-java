
public class Mamifero extends Animal {
	String tAlimentacao; //tipo de alimentacao  herbivero carnivero ou onivero 
	boolean pelos; //0 sim e 1 nao 
	
	Mamifero(String nome, String som, String descricao,String  tAlimentacao){
		this.nome = nome;
		this.som = som;
		this.descricao = descricao;
		this.tAlimentacao = tAlimentacao;
	}

	@Override
	public String toString() {
		return "Mamifero [tAlimentacao=" + tAlimentacao + ", pelos=" + pelos + ", nome=" + nome + ", som=" + som
				+ ", descricao=" + descricao + "]";
	}
	
}
