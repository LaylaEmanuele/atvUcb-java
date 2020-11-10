
public class Executora {
	public static void main(String[] args) {
		Banco nubank = new Banco(222, "Nubank");
		int opcao = 0;
		Conta contaexcluir;
		do {
			opcao = View.solicitarInt("Digite a opção desejada: \n" + "1 - Gerente \n" + "2 - Contador \n" + "0 - Sair", "MENU");
			switch (opcao) {
			case 1:
				Gerente gerente = Utils.criarGerente();
				nubank.inserirFuncionario(gerente);
				menuConta(gerente, nubank);
				break;
			case 2:
				Contador contador = Utils.criarContador();
				nubank.inserirFuncionario(contador);
				menuConta(contador, nubank);
				break;
			}
		} while (opcao != 0);
		
	}
	static void menuConta(Funcionario funcionario, Banco nubank) {
		int opcao = 0;
		int idConta;
		do {
			opcao = View.solicitarInt("Digite a opção desejada: \n" + "1 - Criar conta corrente \n" + "2 - Criar conta empresarial \n" 
		+ "3 - Excluir conta corrente \n" + "4 - Excluir conta empresarial \n" + "0 - Sair", "[MENU CRIAÇÃO CONTA]");
			switch (opcao) {
			case 1:
				ContaCorrente conta1 = Utils.criarContaCorrente();
				Cliente cliente1 = conta1.getPessoa();
				nubank.inserirCliente(cliente1);
				subMenuConta(conta1);
				break;
			case 2:
				ContaEmpresarial conta2 = Utils.criarContaEmpresarial();
				Cliente cliente2 = conta2.getPessoa();
				nubank.inserirCliente(cliente2);
				subMenuConta(conta2);
				break;
			case 3:
				idConta= View.solicitarInt("Qual o numero da conta a ser excluída?", "[MENU EXCLUSÃO CONTA]");
				nubank.excluirC(idConta);
				break;
			case 4:
				idConta= View.solicitarInt("Qual o numero da conta a ser excluída?", "[MENU EXCLUSÃO CONTA]");
				nubank.excluirE(idConta);
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
