package br.com.hospital.main;

abstract public class Funcionario {
	private String nome;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome == null || nome.trim().length() == 0) {
			throw new IllegalArgumentException("[FUNCION�RIO]: O nome n�o pode ser vazio!");
		}else {
			this.nome = nome;
		}
	}
}
