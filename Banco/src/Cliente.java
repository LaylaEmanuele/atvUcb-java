
public class Cliente {
	//Atributos
	private String nome;
	private String cpf;
	private int id;
	private ContaCorrente contaC = null;
	private ContaEmpresarial contaE = null;
	
	//Construtores
	Cliente(String nome, String cpf, ContaCorrente conta){
		setCpf(cpf);
		setNome(nome);
		this.contaC = conta;
	}
	
	Cliente(String nome, String cpf, ContaEmpresarial conta){
		setCpf(cpf);
		setNome(nome);
		this.contaE = conta;
	}
	
	//Getters and Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome == null || nome.trim().length() == 0) {
			throw new IllegalArgumentException("[CLIENTE]: O nome não pode ser vazio!");
		}else {
			this.nome = nome;
		}
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		if(cpf == null || cpf.trim().length() == 0) {
			throw new IllegalArgumentException("[CLIENTE]: O cpf não pode ser vazio!");
		}else {
			this.cpf = cpf;
		}
	}

	public ContaCorrente getContaC() {
		return contaC;
	}

	public void setContaC(ContaCorrente contaC) {
		this.contaC = contaC;
	}

	public ContaEmpresarial getContaE() {
		return contaE;
	}

	public void setContaE(ContaEmpresarial contaE) {
		this.contaE = contaE;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
	//Methods
	
	
	
	
}
