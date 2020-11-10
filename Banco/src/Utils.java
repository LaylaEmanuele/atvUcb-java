
public class Utils {
	static Cliente criarClienteC() {
		String nomeGerado = View.solicitarString("Digite o seu nome: ", "[CLIENTE]");
		String cpfGerado = View.solicitarString("Digite seu cpf: ", "[CLIENTE]");
		ContaCorrente conta = Utils.criarContaCorrente();
		Cliente fulano = new Cliente(nomeGerado, cpfGerado, conta);
		return fulano;
	}
	
	static Cliente criarClienteE() {
		String nomeGerado = View.solicitarString("Digite o seu nome: ", "[CLIENTE]");
		String cpfGerado = View.solicitarString("Digite seu cpf: ", "[CLIENTE]");
		ContaEmpresarial conta = Utils.criarContaEmpresarial();
		Cliente fulano = new Cliente(nomeGerado, cpfGerado, conta);
		return fulano;
	}
	
	static ContaCorrente criarContaCorrente() {
		int numeroGerado = View.solicitarInt("Digite o numero da conta: ", "CONTA");
		int agenciaGerada = View.solicitarInt("Digite o numero da agencia: ", "CONTA");
		ContaCorrente c = new ContaCorrente(numeroGerado, agenciaGerada);
		return c;
	}
	
	static ContaEmpresarial criarContaEmpresarial() {
		int numeroGerado = View.solicitarInt("Digite o numero da conta: ", "CONTA");
		int agenciaGerada = View.solicitarInt("Digite o numero da agencia: ", "CONTA");
		ContaEmpresarial c = new ContaEmpresarial(numeroGerado, agenciaGerada);
		return c;
	}
	
	static Contador criarContador() {
		String nomeGerado = View.solicitarString("Digite o seu nome: ", "[FUNCIONARIO]");
		int idGerado = View.solicitarInt("Digite o seu id: ", "[FUNCIONARIO]");
		Contador fulano = new Contador(nomeGerado, idGerado);
		return fulano;
	}
	
	static Gerente criarGerente() {
		String nomeGerado = View.solicitarString("Digite o seu nome: ", "[FUNCIONARIO]");
		int idGerado = View.solicitarInt("Digite o seu id: ", "[FUNCIONARIO]");
		Gerente fulano = new Gerente(nomeGerado, idGerado);
		return fulano;
	}
	
}
