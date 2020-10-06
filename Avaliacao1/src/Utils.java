
public class Utils {
	static Usuario criarUsuario() {
		String nomeGerado = View.solicitarString("Informe o seu nome: ", "[CADASTRO USUÁRIO]");
		String senhaGerada = View.solicitarString("Informe a sua senha: ", "[CADASTRO USUÁRIO]");
		Usuario user = new Usuario (nomeGerado, senhaGerada);
		return user;
	}
	static Livro criarLivro() {
		String tituloGerado = View.solicitarString("Informe o título do livro: ", "[CADASTRO LIVRO]");
		Livro livro = new Livro (tituloGerado);
		return livro;
	}
}
