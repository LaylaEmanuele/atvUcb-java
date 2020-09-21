
public class Pessoa {
	//Atributos
	private String nome;
	private int idade;
	
	//Construtores
	Pessoa(String nome, int idade){
		setIdade(idade);
		setNome(nome);
	}
	
	//Getters and Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome == null || nome.trim().length() == 0) {
			View.exibirErro("O nome não pode ser vazio!", "PESSOA");
		}else {
			this.nome = nome;
		}
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		if(idade < 0) {
			View.exibirErro("A idade não pode ser negativa", "PESSOA");
		}else {
			this.idade = idade;
		}
	}
	
	//Methods
	
	
	
	
}
