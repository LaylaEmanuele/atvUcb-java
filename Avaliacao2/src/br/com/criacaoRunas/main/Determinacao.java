package br.com.criacaoRunas.main;

import br.com.criacaoRunas.utils.View;

public class Determinacao extends Runa{

	// Constructor
	public Determinacao(String nome,String e1, String e2, String e3, String e4){
		setNome(nome);
		setElemento1(e1);
		setElemento2(e2);
		setElemento3(e3);
		setElemento4(e4);
	}

	// Methods
	@Override
	public void setElemento1(String e) {
		if (e.equals("1")) {
			super.setElemento1("Aperto dos Mortos-Vivos");
		} else if (e.equals("2")) {
			super.setElemento1("Pós-Choque");
		} else if (e.equals("3")) {
			super.setElemento1("Guardião");
		} else {
			throw new IllegalArgumentException("[RUNA DETERMINAÇÃO]: Opção inválida!");
		}
	}

	@Override
	public void setElemento2(String e) {
		if (e.equals("1")) {
			super.setElemento2("Demolir");
		} else if (e.equals("2")) {
			super.setElemento2("Fonte de Vida");
		} else if (e.equals("3")) {
			super.setElemento2("Golpe de Escudo");
		} else {
			throw new IllegalArgumentException("[RUNA DETERMINAÇÃO]: Opção inválida!");
		}
	}

	@Override
	public void setElemento3(String e) {
		if (e.equals("1")) {
			super.setElemento3("Condicionamento");
		} else if (e.equals("2")) {
			super.setElemento3("Ventos Revigorantes");
		} else if (e.equals("3")) {
			super.setElemento3("Osso Revestido");
		} else {
			throw new IllegalArgumentException("[RUNA DETERMINAÇÃO]: Opção inválida!");
		}
	}

	@Override
	public void setElemento4(String e) {
		if(e.equals( "1")) {
			super.setElemento4("Crescimento Excessivo");
		}else if (e.equals( "2")) {
			super.setElemento4("Revitalizar");
		}else if (e.equals( "3")){
			super.setElemento4("Inabalável");
		}else {
			throw new IllegalArgumentException("[RUNA DETERMINAÇÃO]: Opção inválida!");
		}
	}
}
