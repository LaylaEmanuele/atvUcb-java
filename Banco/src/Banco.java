import java.util.ArrayList;

public class Banco {
	//Atributos
	private String nome;
	private int codigo;
	ArrayList<Conta> contas = new ArrayList<Conta>();
	
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
	void inserirConta(Conta c) {
		this.contas.add(c);
	}
	
	void excluirConta(Conta c) {
		this.contas.remove(c);
	}
	void transferirContas(Banco bancoDestino, Conta c) {
		this.excluirConta(c);
		bancoDestino.inserirConta(c);
	}
}
