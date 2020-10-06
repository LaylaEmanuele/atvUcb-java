
public class Classificacao {
	//Attributes 
	private Usuario user = null;
	private int avaliacao;

	//Construtor
	Classificacao(Usuario user, int avaliacao){
		setUser(user);
		setAvaliacao(avaliacao);
	}

	//Getters and Setters
	public Usuario getUser() {
		return user;
	}
	public void setUser(Usuario user) {
		this.user = user;
	}

	public int getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(int avaliacao) {
		this.avaliacao = avaliacao;
	}


}
