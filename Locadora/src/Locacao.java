import java.util.ArrayList;

public class Locacao {
	ArrayList<Locacao> locacacoes = new ArrayList<Locacao>();
	void relatorio() {
		String msg;
		for (Funcionarios funcionarios : Filial.funcionarios) {
			msg = funcionarios.toString();
			View.exibirMensagem(msg);
		}
		for (Cliente clientes : Filial.clientes) {
			msg = clientes.toString();
			View.exibirMensagem(msg);
			clientes.exibirAlugados();
		}
		for (Filme filmes : Locadora.filmes) {
			msg = filmes.toString();
			View.exibirMensagem(msg);
		}
		
	}
}
