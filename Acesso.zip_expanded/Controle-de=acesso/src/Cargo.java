
abstract public class Cargo {
	private String nome;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome == null || nome.trim().length() == 0) {
			throw new IllegalArgumentException("[CARGO]: O nome não pode ser vazio!");
		}else {
			this.nome = nome;
		}
	}

	void mostrarAcesso() {
		View.exibirMensagem("Possui acesso a: \n Agencia \n", "[CARGO]");
	}
}
