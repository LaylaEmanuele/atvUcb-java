
public class Executora {
	public static void main(String[] args) {
		int opcao = 0;
		Universidade catolica = new Universidade();
		
		do {
			opcao = View.solicitarInt("Digite a opção desejada: \n" + "1 - Criar curso\n"  + "2 - Criar turma\n" + "0 - Sair", "MENU");
			switch (opcao) {
			case 1:
				Curso curso = Utils.criarCurso();
			//	subMenuCurso(curso);
				break;
			case 2:
				Turma turma = Utils.criarTurma();
			//	subMenuCurso(curso);
				break;
			}
			
		} while (opcao != 0);
	}
	
	/*static void subMenuCurso(Curso curso) {  modificar depois de realizar o criar turma 
		int opcao = 0;
		
		do {
			opcao = View.solicitarInt("Digite a opção desejada: \n" + "1 - Adicionar turma\n" + "2 - Ver dados pessoais\n" + "3 - Depositar\n" + "0 - Voltar", "MENU CONTA");
			switch (opcao) {
			case 1:
				View.exibirMensagem("SALDO ATUAL: " + c.getSaldo());
				break;
			case 2:
				View.exibirMensagem("DONO: " + c.getDono());
				View.exibirMensagem("NUMERO DA CONTA: " + c.getNumero());
				View.exibirMensagem("NUMERO DA AGENCIA: " + c.getAgencia());
				break;	
			case 3:
				double valor = View.solicitarDouble("Digite o valor do depósito: ", "DEPOSITO");
				c.depositar(valor);
				break;
			
			}
			
		} while (opcao != 0);
	}*/
		
		catolica.relatorio();
	
		
}


