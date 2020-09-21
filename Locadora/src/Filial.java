import java.util.ArrayList;

public class Filial {
	//Atributos 
	static ArrayList<Funcionarios> funcionarios = new ArrayList<Funcionarios>();
	static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	private String nome;
	private int id;
	
	//Construtores 
	Filial(String nome, int id){
		this.nome = nome;
		this.id = id;
	}
	
	//Methods 
	public int acessarId() {
		return this.id;
	}
	Funcionarios cadastrarFuncionario(){
		if(this.funcionarios.size()>2) {
			View.exibirErro("Limite de funcionarios excedido!");
		}else {
			Funcionarios funcionario = Utils.criarFuncionario();
			this.funcionarios.add(funcionario);
			return funcionario;
		}
		return null;
	}

}
