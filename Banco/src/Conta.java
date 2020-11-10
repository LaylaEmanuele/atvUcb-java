
abstract public class Conta {
	//Atributos
	private int agencia;
	private int numero;
	private double saldo;
	private Cliente pessoa;
	private int status; //1 ativo 0 Inativa	
	
	//Construtores
	
	
	//Methods 
	void depositar(double valor) {
		this.saldo += valor;
	}
	void sacar(double valor) {
		if(this.saldo <= 0)
			throw new IllegalArgumentException("[CONTA]: Sem dinheiro!");
		else
			this.saldo -= valor;
	}
	void transferir(Conta contaDestino, double valor) {  //polimorfismo 
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	//Getters and Setters 
	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		if(agencia < 0) {
			throw new IllegalArgumentException("[CONTA]: O número da agência não pode ser negativo!");
		}else {
			this.agencia = agencia;
		}
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if(numero < 0) {
			throw new IllegalArgumentException("[CONTA]: O número da conta não pode ser negativa!");
		}else {
			this.numero = numero;
		}
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		if(saldo < 0) {
			throw new IllegalArgumentException("[CONTA]: O valor do saldo a ser inserido não pode ser negativo!");
		}else {
			this.saldo = saldo;
		}
	}

	public int getStatus() {
		return status;
	}
	
	public void setStatus(int status) {
		this.status = status;
	}

	public Cliente getPessoa() {
		return pessoa;
	}
	
	public void setPessoa(Cliente pessoa) {
		this.pessoa = pessoa;
	}

}
