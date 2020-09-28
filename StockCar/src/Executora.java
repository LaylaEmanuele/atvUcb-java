import java.util.ArrayList;

public class Executora {
	public static void main(String[] args) {
		Campeonato campeonato = new Campeonato();
		menu(campeonato);
	}

	static void menu(Campeonato campeonato) {
		int opcao = 0;	

		do{
			try {
				opcao = View.solicitarInt("Digite a opção desejada: \n" 
						+"1 - Cadastrar piloto \n"
						+"2 - Realizar campeonato \n"
						+"0 - Sair  \n", "[MENU CAMPEONATO]");
				switch (opcao) {
				case 1:
					Piloto piloto = Utils.criarPiloto();
					campeonato.cadastrarPiloto(piloto);

					break;

				case 2:
					campeonato.realizarCampeonato();
					break;

				}
			} catch (Exception e) {
				View.exibirErro(e.getMessage(), "ERRO");
			}

		}while(opcao != 0);
	}

}
