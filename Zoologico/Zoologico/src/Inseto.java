
public class Inseto extends Animal{
	String tMetamorfose; //se é completa ou incompleta
	
	Inseto (String nome, String som, String descricao, String meta){
		this.nome = nome;
		this.som = som;
		this.descricao = descricao;
		this.tMetamorfose = meta;
	}

	@Override
	public String toString() {
		return "Inseto [tMetamorfose=" + tMetamorfose + ", nome=" + nome + ", som=" + som + ", descricao=" + descricao
				+ "]";
	}



}
