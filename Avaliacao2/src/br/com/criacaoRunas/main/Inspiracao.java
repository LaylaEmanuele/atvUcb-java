package br.com.criacaoRunas.main;

public class Inspiracao extends Runa{
	// Constructor
	public Inspiracao(String nome, String e1, String e2, String e3, String e4){
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
			super.setElemento1("Aprimoramento Glacial");
		}else if (e.equals("2")) {
			super.setElemento1("Livro de Feitiços Deslacrado");
		}else if (e.equals("3")){
			super.setElemento1("Protótipo Unirruna");
		}else {
			throw new IllegalArgumentException("[RUNA INSPIRAÇÃO]: Opção inválida!");
		}
	}

	@Override
	public void setElemento2(String e) {
		if(e.equals("1")) {
			super.setElemento2("Flashtração Hextec");
		}else if (e.equals("2")) {
			super.setElemento2("Calçados Mágicos");
		}else if (e.equals("3")){
			super.setElemento2("Sicronia Perfeita");
		}else {
			throw new IllegalArgumentException("[RUNA INSPIRAÇÃO]: Opção inválida!");
		}
	}

	@Override
	public void setElemento3(String e) {
		if(e.equals("1")) {
			super.setElemento3("Mercado do Futuro");
		}else if (e.equals("2")) {
			super.setElemento3("Pulverizador de Tropas");
		}else if (e.equals("3")){
			super.setElemento3("Entrega de Biscoitos");
		}else {
			throw new IllegalArgumentException("[RUNA INSPIRAÇÃO]: Opção inválida!");
		}
	}

	@Override
	public void setElemento4(String e) {
		if(e.equals("1")) {
			super.setElemento4("Perspicácia Cósmica");
		}else if (e.equals("2")) {
			super.setElemento4("Velocidade de Aproximação");
		}else if (e.equals("3")){
			super.setElemento4("Tônico de Distorção no Tempo");
		}else {
			throw new IllegalArgumentException("[RUNA INSPIRAÇÃO]: Opção inválida!");
		}
	} 
}

