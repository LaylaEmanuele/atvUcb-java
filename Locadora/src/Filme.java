
public class Filme {
	//Atributos
	private String nome, genero;
	private double valor;
	private int id;
	int situacao; //0 - livre 1 - alugado
	
	//Construtores
	 Filme(String nome, String genero, double valor, int id){
			this.nome = nome;
			this.genero = genero;
			this.valor = valor;
			this.id = id;
	}
		
	//Methods
	public int acessarId() {
		return this.id;
	}
	public int verSituacao() {
		return this.situacao;
	}
	public String toString() {
		return "[ID] " + this.id + "[NOME]: " + this.nome + "[GENERO] " + this.genero +"[VALOR] " + this.valor;
	}
}
