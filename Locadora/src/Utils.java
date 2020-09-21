
public class Utils {
	static Filme criarFilme() {
		String nomeGerado = View.solicitarString("Informe o nome do Filme: ");
		String genero = View.solicitarString("Informe o genero do Filme: ");
		double valor = View.solicitarDouble("Informe o valor do Filme: ");
		int idGerado = View.solicitarInt("Informe o id do Filme: ");
		Filme filme = new Filme (nomeGerado, genero, valor, idGerado);
		return filme;
	}
	static Filial criarFiliais() {
		String nomeGerado = View.solicitarString("Informe o nome da Filial: ");
		int idGerado = View.solicitarInt("Informe o id da Filial: ");
		Filial filial = new Filial (nomeGerado, idGerado);
		return filial;
	}
	static Cliente criarCliente() {
		String nomeGerado = View.solicitarString("Informe o nome do cliente: ");
		String cpfGerado = View.solicitarString("Informe o CPF do cliente: ");
		String endercoGerado = View.solicitarString("Informe o endereço do cliente: ");
		Cliente cliente = new Cliente (nomeGerado, cpfGerado, endercoGerado);
		return cliente;
	}
	static Funcionarios criarFuncionario() {
		String nomeGerado = View.solicitarString("Informe o nome do funcionário: ");
		int idGerado = View.solicitarInt("Informe o id do funcionário: ");
		Funcionarios funcionario = new Funcionarios (nomeGerado, idGerado);
		return funcionario;
	}
}
