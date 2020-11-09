
public class Clientes extends Cargo {
	private String cpf;
	
	Clientes(String nome,  String cpf){
		setNome( nome);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		if(cpf == null || cpf.trim().length() == 0) {
			throw new IllegalArgumentException("[CLIENTE]: O CPF não pode ser vazio!");
		}else {
			this.cpf = cpf;
		}
	}
	
}
