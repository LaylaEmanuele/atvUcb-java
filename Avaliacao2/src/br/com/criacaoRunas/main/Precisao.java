package br.com.criacaoRunas.main;

public class Precisao extends Runa{
	// Constructor
	public Precisao(String nome, String e1, String e2, String e3, String e4){
		setNome(nome);
		setElemento1(e1);
		setElemento2(e2);
		setElemento3(e3);
		setElemento4(e4);
	}

	// Methods
	@Override
	public void setElemento1(String e) {
		if(e.equals("1")) {
			super.setElemento1("Pressione o Ataque");
		}else if (e.equals("2")) {
			super.setElemento1("Ritmo Fatal");
		}else if (e.equals("3")){
			super.setElemento1("Agilidade nos Pés");
		}else if (e.equals("4")){
			super.setElemento1("Conquistador");
		}else {
			throw new IllegalArgumentException("[RUNA PRECISÃO]: Opção inválida!");
		}
	}

	@Override
	public void setElemento2(String e) {
		if(e.equals("1")) {
			super.setElemento2("Cura Excessiva");
		}else if (e.equals("2")) {
			super.setElemento2("Triunfo");
		}else if (e.equals("3")){
			super.setElemento2("Presença de Espírito");
		}else {
			throw new IllegalArgumentException("[RUNA PRECISÃO]: Opção inválida!");
		}
	}

	@Override
	public void setElemento3(String e) {
		if(e.equals("1")) {
			super.setElemento3("Lenda: Espontaneidade");
		}else if (e.equals("2")) {
			super.setElemento3("Lenda: Tenacidade");
		}else if (e.equals("3")){
			super.setElemento3("Lenda: Linhagem");
		}else {
			throw new IllegalArgumentException("[RUNA PRECISÃO]: Opção inválida!");
		}
	}

	@Override
	public void setElemento4(String e) {
		if(e.equals("1")) {
			super.setElemento4("Golpe de Misericórdia");
		}else if (e.equals("2")) {
			super.setElemento4("Dilacerar");
		}else if (e.equals("3")){
			super.setElemento4("Até a Morte");
		}else {
			throw new IllegalArgumentException("[RUNA PRECISÃO]: Opção inválida!");
		}
	} 
}

