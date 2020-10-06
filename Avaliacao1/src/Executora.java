
public class Executora {

	public static void main(String[] args) {
		App goodreads = new App("Goodreads");
		View.exibirMensagem("Bem vindo ao GoodReads!", "[HOME]");
		menuInicial(goodreads);	
	}

	static void menuInicial(App goodreads) {
		int opcao = 0;	
		Usuario user;
		do{
			try {
				opcao = View.solicitarInt("Digite a opção desejada: \n" 
						+"1 - Realizar cadastro \n"
						+"2 - Fazer login \n"
						+"3 - Admin \n"
						+"0 - Sair  \n", "[MENU INICIAL]");
				switch (opcao) {
				case 1:
					user = Utils.criarUsuario();					
					goodreads.criarId(user);
					subMenuPerfil(user, goodreads);
					break;

				case 2:
					user = goodreads.realizarLogin(); 
					subMenuPerfil(user, goodreads);						
					break;

				case 3:
					goodreads.cadastrarLivro();
					break;
				}
			} catch (Exception e) {
				View.exibirErro(e.getMessage(), "ERRO");
			}

		}while(opcao != 0);
	}

	static void subMenuPerfil(Usuario user, App goodreads) {
		int opcao = 0;	
		do{
			try {
				opcao = View.solicitarInt("Digite a opção desejada: \n" 
						+"1 - Adicionar um livro na sua lista de leitura \n"
						+"2 - Remover um livro na sua lista de leitura \n"
						+"3 - Ver ranking global \n"
						+"4 - Avaliar livro \n"
						+"5 - Ver sua lista de leitura \n"
						+"0 - Sair  \n", "[PERFIL USUÁRIO]");
				switch (opcao) {
				case 1:

					if(goodreads.getLivros().size() == 0) {
						throw new IllegalArgumentException("[PERFIL USUÁRIO]: Não há livros cadastrados no APP para você adicionar!");
					}
					goodreads.adicionarLivroUsuario(user);
					break;

				case 2:
					user.removerLivro();

					break;
				case 3:
					if(goodreads.getLivros().size() == 0) {
						throw new IllegalArgumentException("[RANKING GLOBAL]: Não há livros cadastrados no GoodReads ainda! Logo, logo adicionaremos novos livros para gerar o ranking :D");
					}

					user.ranking();		
					break;

				case 4:
					user.avaliarLivro(user);
					break;

				case 5:
					user.listarCatalago();
					break; 	
				}

			} catch (Exception e) { 
				View.exibirErro(e.getMessage(), "ERRO"); 
			}

		}while(opcao != 0);
	}

}
