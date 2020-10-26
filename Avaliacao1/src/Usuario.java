import java.util.ArrayList;
import java.util.Comparator;

public class Usuario {
	//Attributes 
	private int id;
	private String nome;
	private String senha;
	private ArrayList<Livro> livros = null;


	//Construtor
	Usuario(String nome, String senha){
		setNome(nome);
		setSenha(senha);
	}

	//Getters and Setters 
	public int getId() {
		return id;
	}

	public void setId(int id) {
		if(id < 0) {
			throw new IllegalArgumentException("[USU�RIO]: O id n�o pode ser negativo");
		}else {
			this.id = id;
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome == null || nome.trim().length() == 0) {
			throw new IllegalArgumentException("[USU�RIO]: O nome n�o pode ser vazio!");
		}else {
			this.nome = nome;
		}
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		if(senha == null || senha.trim().length() == 0) {
			throw new IllegalArgumentException("[USU�RIO]: A senha n�o pode ser vazia!");
		}else {
			this.senha = senha;
		}
	}

	public ArrayList<Livro> getLivros() {
		return livros;
	}

	public void setLivros(ArrayList<Livro> livros) {
		if(livros == null) {
			throw new IllegalArgumentException("[LIVRO]: Erro no cadastro do livro! Objeto == null");
		}else {
			this.livros = livros;			
		}
	}


	//Methods 	
	void adicionarLivro(Livro newLivro, int id) {
		for (Livro livro : this.livros) {
			if(id == livro.getId()) {
				throw new IllegalArgumentException("[PERFIL USU�RIO]: Este livro j� est� na sua lista de leitura!");
			}
		}

		this.livros.add(newLivro);
	}

	void removerLivro() {
		this.listarCatalago();
		int id = View.solicitarInt("Qual o id do livro a ser removido: ", "[CAT�LOGO USU�RIO]");
		Livro livroAux = null;
		for (Livro livro : this.livros) {
			if(id == livro.getId()) {
				livroAux = livro;
			}
		}
		if(livroAux == null) {
			throw new IllegalArgumentException("[CAT�LOGO USU�RIO]: Este livro n�o est� na sua lista de leitura!");
		}
		this.livros.remove(livroAux);
	}

	void listarCatalago() {
		if(this.livros != null) {
			String msg = "";
			for (Livro livro : this.livros) {
				msg = msg + livro.toString() + "\n";
			}
			View.exibirMensagem(msg, "[CAT�LAGO USU�RIO]");
		}else {
			throw new IllegalArgumentException("[CAT�LAGO USU�RIO]: N�o h� livros na sua lista de leitura!");
		}
	}

	void avaliarLivro(Usuario user) {
		double media = 0;
		if(this.livros != null) {
			int id = View.solicitarInt("Qual o id do livro a ser classificado: ", "[PERFIL USU�RIO]");
			for (Livro livro : livros) {
				if(id == livro.getId()) {
					for (Classificacao classifica : livro.getClassificacoes()) {
						if(classifica.getUser().equals(user)) {
							throw new IllegalArgumentException("[AVALIA��O LIVRO]: Livro j� avaliado!");
						}
					}

					int avaliacao = View.solicitarInt("Qual nota voc� dar para esse livro de 1-5, sendo 5 Excelente e 1 Ruim: ", "[PERFIL USU�RIO]");
					if(avaliacao < 0 || avaliacao>5) {
						throw new IllegalArgumentException("[LIVRO]: A avaliacao do livro n�o pode ser menor que 1 e nem maior do que 5!");
					}else {
						livro.getClassificacoes().add(new Classificacao(user, avaliacao));
						for (Classificacao classificacao : livro.getClassificacoes()) {
							media += classificacao.getAvaliacao();
						}
						media = media/livro.getClassificacoes().size();
						livro.setMediaAvaliacao(media);
					}
				}else {
					throw new IllegalArgumentException("[AVALIA��O LIVRO]: Livro n�o encontrado na sua lista de leitura!");
				}
			}
		}else {
			throw new IllegalArgumentException("[AVALIA��O LIVRO]: N�o h� livros na sua lista de leitura para avaliar!");
		}

	}

	void ranking() {
		this.livros.sort(Comparator.comparingDouble(e -> e.getMediaAvaliacao()));
		int size = getLivros().size();
		Livro aux;
		String msg = "";
		for (int i = 0; i < size; i++) {
			aux = getLivros().get((size-1)-i);
			msg += i+1 +"� Lugar\n" + aux.toString() + "\n";
		}

		View.exibirMensagem(msg, "[PERFIL USU�RIO]");
	}

	@Override
	public String toString() {
		return "Usuario [Id:" + this.id + ", Nome: " + this.nome + ", Livros: " + this.livros + "]";
	}


}
