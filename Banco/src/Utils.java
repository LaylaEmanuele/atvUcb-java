
public class Utils {
	static Pessoa criarPessoa() {
		String nomeGerado = View.solicitarString("Digite o seu nome: ", "PESSOA");
		int idadeGerada = View.solicitarInt("Digite sua idade: ", "PESSOA");
		Pessoa fulano = new Pessoa(nomeGerado, idadeGerada);
		return fulano;
	}
	
	static Conta criarConta() {
		Pessoa fulano = Utils.criarPessoa();
		int numeroGerado = View.solicitarInt("Digite o numero da conta: ", "CONTA");
		int agenciaGerada = View.solicitarInt("Digite o numero da agencia: ", "CONTA");
		Conta c = new Conta(numeroGerado, agenciaGerada, fulano);
		return c;
	}
	
}
