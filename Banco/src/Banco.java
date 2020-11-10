import java.util.ArrayList;

public class Banco {
	//Atributos
	private String nome;
	private int codigo;
	private ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	
	//Construtores
	Banco(int codigo, String nome){
		setCodigo(codigo);
		setNome(nome);
	}
	
	//Setters and Getters 
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome == null || nome.trim().length() == 0) {
			View.exibirErro("O nome não pode ser vazio!", "BANCO");
		}else {
			this.nome = nome;
		}
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		if(codigo < 0) {
			View.exibirErro("O codigo não pode ser negativo", "BANCO");
		}else {
			this.codigo = codigo;
		}
	}
	

	//Methods 
	void inserirCliente(Cliente c) {
		this.clientes.add(c);
	}
	
	void excluirCliente(Cliente c) {
		this.clientes.remove(c);
	}
//	void transferirContas(Banco bancoDestino, Conta c) {
//		this.excluirConta(c);
//		bancoDestino.inserirConta(c);
//	}
	
	void inserirFuncionario(Funcionario c) {
		this.funcionarios.add(c);
	}
	
	void excluirFuncionario(Funcionario c) {
		this.funcionarios.remove(c);
	}
	
	void excluirC(int numero) {
		for (Cliente cliente : this.clientes) {
			if(cliente.getContaC().getNumero() == numero) {
				cliente.setContaC(null); 
			}
		}
	}
	
	void excluirE(int numero) {
		for (Cliente cliente : this.clientes) {
			if(cliente.getContaE().getNumero() == numero) {
				cliente.setContaE(null); 
			}
		}
	}
	
}
