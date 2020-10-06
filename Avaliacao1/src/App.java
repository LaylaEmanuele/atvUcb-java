import java.util.ArrayList;

public class App {
	//Attributes 
	private ArrayList<Livro> livros = new ArrayList<Livro>();
	private ArrayList<Usuario> users = new ArrayList<Usuario>();
	private String nome;

	//Construtor
	App(String nome){
		this.nome = nome;
	}

	//Getters and Setters 
	public ArrayList<Livro> getLivros() {
		return livros;
	}

	public void setLivros(ArrayList<Livro> livros) {
		this.livros = livros;
	}

	public ArrayList<Usuario> getUsers() {
		return users;
	}

	public void setUsers(ArrayList<Usuario> users) {
		this.users = users;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	//Methods
	void criarId(Usuario usuario){
		int  id = View.solicitarInt("Informe um id de sua preferência: ", "[CADASTRO USUÁRIO]");
		for (Usuario user : users) {
			if(id == user.getId()) {
				throw new IllegalArgumentException("[CADASTRO USUÁRIO]: Id já cadastrado!");
			}
		}
		usuario.setId(id);
		this.users.add(usuario);
	}

	Usuario realizarLogin() {
		int id = View.solicitarInt("Id:", "[LOGIN]");
		Usuario usuario = validarLoginId(id);	
		if(usuario == null) {
			throw new IllegalArgumentException("[LOGIN]: Usuário não cadastrado!");
		}else {
			this.validarLoginSenha(usuario);
			return usuario;
		}

	}

	Usuario validarLoginId(int id) {
		for (Usuario user : users) {
			if(id == user.getId()) {
				Usuario usuario = user;
				return usuario;
			}
		}
		return null;
	}

	void validarLoginSenha(Usuario user) {
		String senha = View.solicitarString("Senha:", "[LOGIN]");
		if(!senha.equals(user.getSenha())){
			throw new IllegalArgumentException("[LOGIN]: Senha incorreta!");
		}
	}

	void listarCatalago() {
		String msg = "";
		for (Livro livro : livros) {
			msg = msg + livro.toString() + "\n";
		}
		View.exibirMensagem(msg, "[CATÁLAGO]");
	}
	void cadastrarLivro() { 
		int id = View.solicitarInt("Informe o id do admin", "[CATÁLAGO]"); //Para acessar é necessário informar o id correto
		if(id == 19) {
			this.listarCatalago();
			Livro novolivro = Utils.criarLivro();
			this.criarIdLivro(novolivro);
		}else {
			throw new IllegalArgumentException("[CATÁLAGO]: Id incorreto! Para acessar é necessário informar o id correto!");
		}
	}

	void criarIdLivro(Livro novolivro){
		int  id = View.solicitarInt("Informe o id do livro a ser adicionado: ", "[CADASTRO LIVRO]");

		for (Livro livro : livros) {
			if(id == livro.getId()) {
				throw new IllegalArgumentException("[CADASTRO LIVRO]: Id já cadastrado!");
			}
		}

		novolivro.setId(id);
		this.livros.add(novolivro);
	}

	void adicionarLivroUsuario(Usuario user) {
		this.listarCatalago();
		int id = View.solicitarInt("Informe o id do livro que você deseja adicionar a sua lista de leitura: ", "[PERFIL USUÁRIO]");
		for (Livro livro : livros) {
			if(id == livro.getId()) {
				user.adicionarLivro(livro, id);
				return;
			}
		}
		throw new IllegalArgumentException("[PERFIL USUÁRIO]: Este livro não existe !");
	}

}
