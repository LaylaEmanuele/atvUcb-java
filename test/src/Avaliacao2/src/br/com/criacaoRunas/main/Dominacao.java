package br.com.criacaoRunas.main;

public class Dominacao extends Runa{
	// Constructor
	public Dominacao(String nome,String e1, String e2, String e3, String e4){
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
			super.setElemento1("Eletrocutar");
		}else if (e.equals("2")) {
			super.setElemento1("Predador");
		}else if (e.equals("3")){
			super.setElemento1("Colheita Sombria");
		}else if (e.equals("4")){
			super.setElemento1("Chuva de L�minas");
		}else {
			throw new IllegalArgumentException("[RUNA DOMINA��O]: Op��o inv�lida!");
		}
	}

	@Override
	public void setElemento2(String e) {
		if(e.equals("1")) {
			super.setElemento2("Golpe Desleal");
		}else if (e.equals("2")) {
			super.setElemento2("Gosto de Sangue");
		}else if (e.equals("3")){
			super.setElemento2("Impacto Repentino");
		}else {
			throw new IllegalArgumentException("[RUNA DOMINA��O]: Op��o inv�lida!");
		}
	}

	@Override
	public void setElemento3(String e) {
		if(e.equals("1")) {
			super.setElemento3("Sentinela Zumbi");
		}else if (e.equals("2")) {
			super.setElemento3("Poro Fantasma");
		}else if (e.equals("3")){
			super.setElemento3("Globos Oculares");
		}else {
			throw new IllegalArgumentException("[RUNA DOMINA��O]: Op��o inv�lida!");
		}
	}

	@Override
	public void setElemento4(String e) {
		if(e.equals("1")) {
			super.setElemento4("Ca�a Voraz");
		}else if (e.equals("2")) {
			super.setElemento4("Ca�a Ardilosa");
		}else if (e.equals("3")){
			super.setElemento4("Ca�a Incans�vel");
		}else if (e.equals("4")){
			super.setElemento4("Ca�a Suprema");
		}else {
			throw new IllegalArgumentException("[RUNA DOMINA��O]: Op��o inv�lida!");
		}
	} 
}
