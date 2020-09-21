
public class Conta {
	//Atributos
	private int agencia;
	private int numero;
	private double saldo;
	private Pessoa dono;
	
	//Construtores
	Conta(int numero, int agencia, Pessoa nome){
		this.numero = numero;
		this.agencia = agencia;
		this.dono = nome;
	}
	
	//Methods 
	void depositar(double valor) {
		this.saldo += valor;
	}
	void sacar(double valor) {
		if(this.saldo <= 0)
			View.exibirErro("Sem money", "CONTA");
		else
			this.saldo -= valor;
	}
	void transferir(Conta contaDestino, double valor) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	//Getters and Setters 
	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		if(agencia < 0) {
			View.exibirErro("O numero da agencia não pode ser negativo", "CONTA");
		}else {
			this.agencia = agencia;
		}
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if(numero < 0) {
			View.exibirErro("O numero da conta não pode ser negativo", "CONTA");
		}else {
			this.numero = numero;
		}
	}

	public double getSaldo() {
		return saldo;
	}

	public Pessoa getDono() {
		return dono;
	}

}
