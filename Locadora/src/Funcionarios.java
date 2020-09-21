
public class Funcionarios {
	//Atributos
	private String nome;
	private int id;
	
	//Construtores
	Funcionarios(String nome, int id){
		this.nome = nome;
		this.id = id;
	}
	
	//Methods
	Cliente cadastrarCliente() {
		Cliente cliente = Utils.criarCliente();
		Filial.clientes.add(cliente);
		return cliente;
	}
	
	public String toString() {
		return "[ID] " + this.id + "[NOME]: " + this.nome;
	}
}
