
public class Utils {
	static Usuario criarUsuario() {
		String nomeGerado = View.solicitarString("Informe o seu nome: ", "[CADASTRO USU�RIO]");
		String senhaGerada = View.solicitarString("Informe a sua senha: ", "[CADASTRO USU�RIO]");
		Usuario user = new Usuario (nomeGerado, senhaGerada);
		return user;
	}
	static Livro criarLivro() {
		String tituloGerado = View.solicitarString("Informe o t�tulo do livro: ", "[CADASTRO LIVRO]");
		Livro livro = new Livro (tituloGerado);
		return livro;
	}
}
