package br.com.criacaoRunas.main;

public class Feiticaria extends Runa{
	// Constructor
	public Feiticaria(String nome, String e1, String e2, String e3, String e4){
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
			super.setElemento1("Invocar Aery");
		}else if (e.equals("2")) {
			super.setElemento1("Cometa Arcano");
		}else if (e.equals("3")){
			super.setElemento1("Ímpeto Gradual");
		}else {
			throw new IllegalArgumentException("[RUNA FEITIÇARIA]: Opção inválida!");
		}
	}

	@Override
	public void setElemento2(String e) {
		if(e.equals("1")) {
			super.setElemento2("Orbe Anulador");
		}else if (e.equals("2")) {
			super.setElemento2("Faixa de Fluxo de Mana");
		}else if (e.equals("3")){
			super.setElemento2("Manto de Nimbus");
		}else {
			throw new IllegalArgumentException("[RUNA FEITIÇARIA]: Opção inválida!");
		}
	}

	@Override
	public void setElemento3(String e) {
		if(e.equals("1")) {
			super.setElemento3("Transcedência");
		}else if (e.equals("2")) {
			super.setElemento3("Celeridade");
		}else if (e.equals("3")){
			super.setElemento3("Foco Absoluto");
		}else {
			throw new IllegalArgumentException("[RUNA FEITIÇARIA]: Opção inválida!");
		}
	}

	@Override
	public void setElemento4(String e) {
		if(e.equals("1")) {
			super.setElemento4("Chamuscar");
		}else if (e.equals("2")) {
			super.setElemento4("Caminhar sobre as Águas");
		}else if (e.equals("3")){
			super.setElemento4("Tempestade Crescente");
		}else {
			throw new IllegalArgumentException("[RUNA FEITIÇARIA]: Opção inválida!");
		}
	} 
}

