package br.com.criacaoRunas.main;

import br.com.criacaoRunas.interfaces.Iitem;

public class Item implements Iitem{
	// Attributes
	private String nome;
	private int dano;
	private int armadura;
	private int mana;
	private int resistenciaMagica;
	
	// Constructor 
	public Item(String nome, int dano, int armadura, int mana, int resistenciaMagica) {
		setNome(nome);
		setDano(dano);
		setArmadura(armadura);
		setMana(mana);
		setResistenciaMagica(resistenciaMagica);
	}
	
	// Methods
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		if (nome.trim().length() <= 0) {
			throw new IllegalArgumentException("[ITEM]: O nome do item nâo pode ser vazio!");
		}

		this.nome = nome;
	}
	
	public int getDano() {
		return dano;
	}
	
	public void setDano(int dano) {
		if(dano < 0) {
			throw new IllegalArgumentException("[ITEM]: O valor do dano não pode ser negativo!");
		}else {
			this.dano = dano;
		}
	}
	
	public int getArmadura() {
		return armadura;
	}
	
	public void setArmadura(int armadura) {
		if(armadura < 0) {
			throw new IllegalArgumentException("[ITEM]: O valor da armadura não pode ser negativa!");
		}else {
			this.armadura = armadura;
		}
	}
	
	public int getMana() {
		return mana;
	}
	
	public void setMana(int mana) {
		if(mana < 0) {
			throw new IllegalArgumentException("[ITEM]: O valor da mana não pode ser negativa!");
		}else {
			this.mana = mana;
		}
	}
	
	public int getResistenciaMagica() {
		return resistenciaMagica;
	}
	
	public void setResistenciaMagica(int resistenciaMagica) {
		if(resistenciaMagica < 0) {
			throw new IllegalArgumentException("[ITEM]: O valor da resistência mágica não pode ser negativa!");
		}else {
			this.resistenciaMagica = resistenciaMagica;
		}
	}

	@Override
	public String toString() {
		return "\nItem [nome=" + nome +  "\n" +  ", dano=" + dano +  "\n" +  ", armadura=" + armadura +  "\n" +  ", mana=" + mana
				+  "\n" +  ", resistenciaMagica=" + resistenciaMagica + "]";
	}

}
