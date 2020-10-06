import java.util.ArrayList;

public class Livro {
	//Attributes 
	private int id;
	private String titulo;
	private ArrayList<Classificacao> classificacoes = new ArrayList<Classificacao>();
	private double mediaAvaliacao;

	//Construtor
	Livro(String titulo){
		setTitulo(titulo);
	}

	//Getters and Setters 
	public int getId() {
		return id;
	}

	public void setId(int id) {
		if(id < 0) {
			throw new IllegalArgumentException("[LIVRO]: O id do livro não pode ser negativo");
		}else {
			this.id = id;
		}
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		if(titulo == null || titulo.trim().length() == 0) {
			throw new IllegalArgumentException("[LIVRO]: O título não pode ser vazio!");
		}else {
			this.titulo = titulo;
		}
	}

	public ArrayList<Classificacao> getClassificacoes() {
		return classificacoes;
	}

	public void setClassificacoes(ArrayList<Classificacao> classificacoes) {
		this.classificacoes = classificacoes;
	}

	public double getMediaAvaliacao() {
		return mediaAvaliacao;
	}

	public void setMediaAvaliacao(double mediaAvaliacao) {
		this.mediaAvaliacao = mediaAvaliacao;
	}

	//Methods 
	void addClassificacao(Classificacao classificacao) {
		this.classificacoes.add(classificacao);
	}

	@Override
	public String toString() {
		return "Livro [Id: " + this.id + " Título: " + this.titulo + " Avaliação "+ this.mediaAvaliacao +"]";
	}
}

