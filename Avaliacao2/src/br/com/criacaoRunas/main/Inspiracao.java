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
			super.setElemento1("Livro de Feiti�os Deslacrado");
		}else if (e.equals("3")){
			super.setElemento1("Prot�tipo Unirruna");
		}else {
			throw new IllegalArgumentException("[RUNA INSPIRA��O]: Op��o inv�lida!");
		}
	}

	@Override
	public void setElemento2(String e) {
		if(e.equals("1")) {
			super.setElemento2("Flashtra��o Hextec");
		}else if (e.equals("2")) {
			super.setElemento2("Cal�ados M�gicos");
		}else if (e.equals("3")){
			super.setElemento2("Sicronia Perfeita");
		}else {
			throw new IllegalArgumentException("[RUNA INSPIRA��O]: Op��o inv�lida!");
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
			throw new IllegalArgumentException("[RUNA INSPIRA��O]: Op��o inv�lida!");
		}
	}

	@Override
	public void setElemento4(String e) {
		if(e.equals("1")) {
			super.setElemento4("Perspic�cia C�smica");
		}else if (e.equals("2")) {
			super.setElemento4("Velocidade de Aproxima��o");
		}else if (e.equals("3")){
			super.setElemento4("T�nico de Distor��o no Tempo");
		}else {
			throw new IllegalArgumentException("[RUNA INSPIRA��O]: Op��o inv�lida!");
		}
	} 
}

