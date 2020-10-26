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
			throw new IllegalArgumentException("[USUÁRIO]: O id não pode ser negativo");
		}else {
			this.id = id;
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome == null || nome.trim().length() == 0) {
			throw new IllegalArgumentException("[USUÁRIO]: O nome não pode ser vazio!");
		}else {
			this.nome = nome;
		}
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		if(senha == null || senha.trim().length() == 0) {
			throw new IllegalArgumentException("[USUÁRIO]: A senha não pode ser vazia!");
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
				throw new IllegalArgumentException("[PERFIL USUÁRIO]: Este livro já está na sua lista de leitura!");
			}
		}

		this.livros.add(newLivro);
	}

	void removerLivro() {
		this.listarCatalago();
		int id = View.solicitarInt("Qual o id do livro a ser removido: ", "[CATÁLOGO USUÁRIO]");
		Livro livroAux = null;
		for (Livro livro : this.livros) {
			if(id == livro.getId()) {
				livroAux = livro;
			}
		}
		if(livroAux == null) {
			throw new IllegalArgumentException("[CATÁLOGO USUÁRIO]: Este livro não está na sua lista de leitura!");
		}
		this.livros.remove(livroAux);
	}

	void listarCatalago() {
		if(this.livros != null) {
			String msg = "";
			for (Livro livro : this.livros) {
				msg = msg + livro.toString() + "\n";
			}
			View.exibirMensagem(msg, "[CATÁLAGO USUÁRIO]");
		}else {
			throw new IllegalArgumentException("[CATÁLAGO USUÁRIO]: Não há livros na sua lista de leitura!");
		}
	}

	void avaliarLivro(Usuario user) {
		double media = 0;
		if(this.livros != null) {
			int id = View.solicitarInt("Qual o id do livro a ser classificado: ", "[PERFIL USUÁRIO]");
			for (Livro livro : livros) {
				if(id == livro.getId()) {
					for (Classificacao classifica : livro.getClassificacoes()) {
						if(classifica.getUser().equals(user)) {
							throw new IllegalArgumentException("[AVALIAÇÃO LIVRO]: Livro já avaliado!");
						}
					}

					int avaliacao = View.solicitarInt("Qual nota você dar para esse livro de 1-5, sendo 5 Excelente e 1 Ruim: ", "[PERFIL USUÁRIO]");
					if(avaliacao < 0 || avaliacao>5) {
						throw new IllegalArgumentException("[LIVRO]: A avaliacao do livro não pode ser menor que 1 e nem maior do que 5!");
					}else {
						livro.getClassificacoes().add(new Classificacao(user, avaliacao));
						for (Classificacao classificacao : livro.getClassificacoes()) {
							media += classificacao.getAvaliacao();
						}
						media = media/livro.getClassificacoes().size();
						livro.setMediaAvaliacao(media);
					}
				}else {
					throw new IllegalArgumentException("[AVALIAÇÃO LIVRO]: Livro não encontrado na sua lista de leitura!");
				}
			}
		}else {
			throw new IllegalArgumentException("[AVALIAÇÃO LIVRO]: Não há livros na sua lista de leitura para avaliar!");
		}

	}

	void ranking() {
		this.livros.sort(Comparator.comparingDouble(e -> e.getMediaAvaliacao()));
		int size = getLivros().size();
		Livro aux;
		String msg = "";
		for (int i = 0; i < size; i++) {
			aux = getLivros().get((size-1)-i);
			msg += i+1 +"º Lugar\n" + aux.toString() + "\n";
		}

		View.exibirMensagem(msg, "[PERFIL USUÁRIO]");
	}

	@Override
	public String toString() {
		return "Usuario [Id:" + this.id + ", Nome: " + this.nome + ", Livros: " + this.livros + "]";
	}


}
