
public class Executora {
	public static void main(String[] args) {
		Banco nubank = new Banco(222, "Nubank");
		int opcao = 0;
		Conta contaexcluir;
		do {
			opcao = View.solicitarInt("Digite a opção desejada: \n" + "1 - Criar conta\n" + "0 - Sair", "MENU");
			switch (opcao) {
			case 1:
				Conta c = Utils.criarConta();
				subMenuConta(c);
				break;

			}
			
		} while (opcao != 0);
	}
	
	static void subMenuConta(Conta c) {
		int opcao = 0;
		
		do {
			opcao = View.solicitarInt("Digite a opção desejada: \n" + "1 - Ver saldo\n" + "2 - Ver dados pessoais\n" + "3 - Depositar\n" + "0 - Voltar", "MENU CONTA");
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
	}
}
