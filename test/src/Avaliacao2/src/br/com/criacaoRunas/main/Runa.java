package br.com.criacaoRunas.main;

// Imports
import br.com.criacaoRunas.interfaces.IRuna;

abstract public class Runa implements IRuna{
	// Attributes 
	private String nome; 
	private String elemento1; // elementos da runa 
	private String elemento2;
	private String elemento3;
	private String elemento4;

	// Methods 
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		if (nome.trim().length() <= 0) {
			throw new IllegalArgumentException("[RUNA]: O nome da Runa nâo pode ser vazio!");
		}

		this.nome = nome;
	}

	public String getElemento1() {
		return elemento1;
	}

	public void setElemento1(String elemento1) {
		this.elemento1 = elemento1;
	}

	public String getElemento2() {
		return elemento2;
	}

	public void setElemento2(String elemento2) {
		this.elemento2 = elemento2;
	}

	public String getElemento3() {
		return elemento3;
	}

	public void setElemento3(String elemento3) {
		this.elemento3 = elemento3;
	}

	public String getElemento4() {
		return elemento4;
	}

	public void setElemento4(String elemento4) {
		this.elemento4 = elemento4;
	}

	@Override
	public String toString() {
		return "Runa [nome=" + nome + "\n" + ", elemento1=" + elemento1 + "\n" +", elemento2=" + elemento2 +"\n" + ", elemento3="
				+ elemento3 + "\n" +", elemento4=" + elemento4 + "]";
	}
	
}
