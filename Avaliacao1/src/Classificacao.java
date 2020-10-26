
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
		if(user == null) {
			throw new IllegalArgumentException("[USUÁRIO]: Erro no cadastro do usuário! Objeto == null");
		}else {
			this.user = user;			
		}
	}

	public int getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(int avaliacao) {
		if(avaliacao < 0) {
			throw new IllegalArgumentException("[CLASSIFICAÇÃO]: A classificação do livro não pode ser negativa");
		}else {
			this.avaliacao = avaliacao;
		}
	}


}
