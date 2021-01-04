package br.com.criacaoRunas.main;

import br.com.criacaoRunas.utils.Utils;
import br.com.criacaoRunas.utils.View;

public class Executora {

	public static void main(String[] args) {
		Site blitz = new Site("Blitz");
		View.exibirMensagem("Bem vindo ao Blitz!", "[HOME]");
		menuInicial(blitz);	
	}

	static void menuInicial(Site blitz) {
		int opcao = 0;	
		Jogador user;
		do{
			try {
				opcao = View.getInt("Digite a op��o desejada: \n" 
						+"1 - Realizar cadastro \n"
						+"2 - Fazer login \n"
						+"0 - Sair  \n", "[MENU INICIAL]");
				switch (opcao) {
				case 1:
					user = Utils.criarJogador();					
					blitz.criarId(user);
					blitz.getUsers().add(user);
					subMenuPerfil(user, blitz);
					break;

				case 2:
					user = blitz.realizarLogin(); 
					subMenuPerfil(user, blitz);						
					break;
				}
			} catch (Exception e) {
				View.showError(e.getMessage(), "ERRO");
			}

		}while(opcao != 0);
	}

	static void subMenuPerfil(Jogador user, Site blitz) {
		int opcao = 0;	
		do{
			try {
				opcao = View.getInt("Digite a op��o desejada: \n" 
						+"1 - Registrar campe�o \n"
						+"2 - Alterar campe�o \n"
						+"3 - Criar Runa \n"
						+"4 - Listar Runas e Itens criados \n"
						+"5 - Remover Runa \n"
						+"6 - Criar Item\n"
						+"0 - Sair  \n", "[PERFIL USU�RIO]");
				switch (opcao) {
				case 1:
					String nome = View.getString("Qual o nome do seu campe�o?", "[REGISTRO CAMPE�O]");
					user.setNomeCampeao(nome);
					String lane = View.getString("Qual a lane do seu campe�o?", "[REGISTRO CAMPE�O]");
					user.setLane(lane);
					break;

				case 2:
					String novoNome = View.getString("Qual o nome do seu campe�o?", "[REGISTRO CAMPE�O]");
					user.setNomeCampeao(novoNome);
					String novaLane = View.getString("Qual a lane do seu campe�o?", "[REGISTRO CAMPE�O]");
					user.setLane(novaLane);

					break;
				case 3:
					menuCriarRunas(user);

					break;

				case 4:
					
					View.exibirMensagem(user.toString(), "[LISTA DE RUNAS]"); 
					break;

				case 5:
					menuExcluirRunas(user);
					break;

				case 6:
					user.getItens().add(Utils.criarItem());
					break;	
					
				default:
					break;
				}
				

			} catch (Exception e) { 
				View.showError(e.getMessage(), "ERRO"); 
			}

		}while(opcao != 0);
	}
	
	static void menuCriarRunas(Jogador jogador) {
		int opcao = 0;	
	
		do{
			try {
				opcao = View.getInt("Qual Runa ser� criada: \n" 
						+"1 - Determina��o \n"
						+"2 - Domina��o \n"
						+"3 - Feiti�aria \n"
						+"4 - Inspira��o \n"
						+"5 - Precis�o \n"
						+"0 - Sair  \n", "[MENU CRIAR RUNAS]");
				switch (opcao) {
				case 1:
					jogador.criarRuna(Utils.criarDeterminacao());
					
					break;

				case 2:
					jogador.criarRuna(Utils.criarDominacao());
					break;
				
				case 3:
					jogador.criarRuna(Utils.criarFeiticaria());
					break;
				
				case 4:
					jogador.criarRuna(Utils.criarInspiracao());
					break;
					
				case 5:	
					jogador.criarRuna(Utils.criarPrecisao());
					break;
					
				default:
					break;
				
				}
				
				
			} catch (Exception e) {
				View.showError(e.getMessage(), "ERRO");
			}

		}while(opcao != 0);
	}

	static void menuExcluirRunas(Jogador jogador) {
		int opcao = 0;	
		String nome;
		do{
			try {
				opcao = View.getInt("Qual Runa ser� exclu�da: \n" 
						+"1 - Determina��o \n"
						+"2 - Domina��o \n"
						+"3 - Feiti�aria \n"
						+"4 - Inspira��o \n"
						+"5 - Precis�o \n"
						+"0 - Sair  \n", "[MENU EXCLUIR RUNAS]");
				switch (opcao) {
				case 1:
					nome = View.getString("Qual o nome da Runa a ser exclu�da?", "[MENU EXCLUIR RUNAS]");
					Determinacao runaDeterminacao = Utils.encontrarDeterminacao(jogador.getDeterminacao(), nome);
					if(runaDeterminacao == null) {
						throw new IllegalArgumentException("[MENU EXCLUIR RUNAS]: Runa n�o encontrada!");
					}
					jogador.removerRuna(runaDeterminacao);
					
					break;

				case 2:
					nome = View.getString("Qual o nome da Runa a ser exclu�da?", "[MENU EXCLUIR RUNAS]");
					Dominacao runaDominacao = Utils.encontrarDominacao(jogador.getDominacao(), nome);
					if(runaDominacao == null) {
						throw new IllegalArgumentException("[MENU EXCLUIR RUNAS]: Runa n�o encontrada!");
					}
					jogador.removerRuna(runaDominacao);
					break;
				
				case 3:
					nome = View.getString("Qual o nome da Runa a ser exclu�da?", "[MENU EXCLUIR RUNAS]");
					Feiticaria runaFeiticaria = Utils.encontrarFeiticaria(jogador.getFeiticaria(), nome);
					if(runaFeiticaria == null) {
						throw new IllegalArgumentException("[MENU EXCLUIR RUNAS]: Runa n�o encontrada!");
					}
					jogador.removerRuna(runaFeiticaria);
					break;
				
				case 4:
					nome = View.getString("Qual o nome da Runa a ser exclu�da?", "[MENU EXCLUIR RUNAS]");
					Inspiracao runaInspiracao = Utils.encontrarInspiracao(jogador.getInspiracao(), nome);
					if(runaInspiracao == null) {
						throw new IllegalArgumentException("[MENU EXCLUIR RUNAS]: Runa n�o encontrada!");
					}
					jogador.removerRuna(runaInspiracao);
					break;
					
				case 5:	
					nome = View.getString("Qual o nome da Runa a ser exclu�da?", "[MENU EXCLUIR RUNAS]");
					Precisao runaPrecisao = Utils.encontrarPrecisao(jogador.getPrecisao(), nome);
					if(runaPrecisao == null) {
						throw new IllegalArgumentException("[MENU EXCLUIR RUNAS]: Runa n�o encontrada!");
					}
					jogador.removerRuna(runaPrecisao);
					break;
				
				}
			} catch (Exception e) {
				View.showError(e.getMessage(), "ERRO");
			}

		}while(opcao != 0);
	}
}
