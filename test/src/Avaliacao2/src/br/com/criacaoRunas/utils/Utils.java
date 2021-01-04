package br.com.criacaoRunas.utils;

import java.util.ArrayList;

// Imports
import br.com.criacaoRunas.main.Determinacao;
import br.com.criacaoRunas.main.Dominacao;
import br.com.criacaoRunas.main.Feiticaria;
import br.com.criacaoRunas.main.Inspiracao;
import br.com.criacaoRunas.main.Item;
import br.com.criacaoRunas.main.Jogador;
import br.com.criacaoRunas.main.Precisao; 

public class Utils {
	public static Determinacao criarDeterminacao() {
		String nome = View.getString("Insira o nome da sua nova Runa", "Criar Determina��o");
		String e1 = View.getString("Qual o primeiro elemento a ser escolhido? \n" + "1- Aperto dos Mortos-Vivos \n" + "2- P�s-Choque \n" + "3- Guardi�o", "Criar Determina��o");
		String e2 = View.getString("Qual o segundo elemento a ser escolhido? \n" + "1- Demolir \n" + "2- Fonte de Vida \n" + "3- Golpe de Escudo", "Criar Determina��o");
		String e3 = View.getString("Qual o terceiro elemento a ser escolhido?\n" + "1- Condicionamento \n" + "2- Ventos Revigorantes \n" + "3- Osso Revestido", "Criar Determina��o");
		String e4 = View.getString("Qual o quarto elemento a ser escolhido? \n" + "1- Crescimento Excessivo \n" + "2- Revitalizar \n" + "3- Inabal�vel", "Criar Determina��o");
		return new Determinacao(nome, e1, e2, e3, e4);
	}

	public static Dominacao criarDominacao() {
		String nome = View.getString("Insira o nome da sua nova Runa", "Criar Domina��o");
		String e1 = View.getString("Qual o primeiro elemento a ser escolhido?\n" + "1- Eletrocutar \n" + "2- Predador \n" + "3- Colheita Sombria \n" + "4- Chuva de L�minas", "Criar Domina��o");
		String e2 = View.getString("Qual o segundo elemento a ser escolhido?\n" + "1- Golpe Desleal \n" + "2- Gosto de Sangue \n" + "3- Impacto Repentino", "Criar Domina��o");
		String e3 = View.getString("Qual o terceiro elemento a ser escolhido?\n" + "1- Sentinela Zumbi \n" + "2- Poro Fantasma \n" + "3- Globos Oculares", "Criar Domina��o");
		String e4 = View.getString("Qual o quarto elemento a ser escolhido?\n" + "1- Ca�a Voraz \n" + "2- Ca�a Ardilosa \n" + "3- Ca�a Incans�vel \n" + "4- Ca�a Suprema", "Criar Domina��o");
		return new Dominacao(nome, e1, e2, e3, e4);
	}

	public static Feiticaria criarFeiticaria() {
		String nome = View.getString("Insira o nome da sua nova Runa", "Criar Feiti�aria");
		String e1 = View.getString("Qual o primeiro elemento a ser escolhido?\n" + "1- Invocar Aery \n" + "2- Cometa Arcano \n" + "3- �mpeto Gradual", "Criar Feiti�aria");
		String e2 = View.getString("Qual o segundo elemento a ser escolhido?\n" + "1- Orbe Anulador \n" + "2- Faixa de Fluxo de Mana \n" + "3- Manto de Nimbus", "Criar Feiti�aria");
		String e3 = View.getString("Qual o terceiro elemento a ser escolhido?\n" + "1- Transced�ncia \n" + "2- Celeridade \n" + "3- Foco Absoluto", "Criar Feiti�aria");
		String e4 = View.getString("Qual o quarto elemento a ser escolhido?\n" + "1- Chamuscar \n" + "2- Caminhar sobre as �guas \n" + "3- Tempestade Crescente", "Criar Feiti�aria");
		return new Feiticaria(nome, e1, e2, e3, e4);
	}

	public static Inspiracao criarInspiracao() {
		String nome = View.getString("Insira o nome da sua nova Runa", "Criar Inspira��o");
		String e1 = View.getString("Qual o primeiro elemento a ser escolhido?\n" + "1- Aprimoramento Glacial \n" + "2- Livro de Feiti�os Deslacrado \n" + "3- Prot�tipo Unirruna", "Criar Inspira��o");
		String e2 = View.getString("Qual o segundo elemento a ser escolhido?\n" + "1- Flashtra��o Hextec \n" + "2- Cal�ados M�gicos \n" + "3- Sicronia Perfeita", "Criar Inspira��o");
		String e3 = View.getString("Qual o terceiro elemento a ser escolhido?\n" + "1- Mercado do Futuro \n" + "2- Pulverizador de Tropas \n" + "3- Entrega de Biscoitos", "Criar Inspira��o");
		String e4 = View.getString("Qual o quarto elemento a ser escolhido?\n" + "1- Perspic�cia C�smica \n" + "2- Velocidade de Aproxima��o \n" + "3- T�nico de Distor��o no Tempo", "Criar Inspira��o");
		return new Inspiracao(nome, e1, e2, e3, e4);
	}

	public static Precisao criarPrecisao() {
		String nome = View.getString("Insira o nome da sua nova Runa", "Criar Precis�o");
		String e1 = View.getString("Qual o primeiro elemento a ser escolhido?\n" + "1- Pressione o Ataque \n" + "2- Ritmo Fatal \n" + "3- Agilidade nos P�s" + "4-  Conquistador", "Criar Precis�o");
		String e2 = View.getString("Qual o segundo elemento a ser escolhido?\n" + "1- Cura Excessiva \n" + "2- Triunfo \n" + "3- Presen�a de Esp�rito", "Criar Precis�o");
		String e3 = View.getString("Qual o terceiro elemento a ser escolhido?\n" + "1- Lenda: Espontaneidade \n" + "2- Lenda: Tenacidade \n" + "3- Lenda: Linhagem", "Criar Precis�o");
		String e4 = View.getString("Qual o quarto elemento a ser escolhido?\n" + "1- Golpe de Miseric�rdia \n" + "2- Dilacerar \n" + "3- At� a Morte", "Criar Precis�o");
		return new Precisao(nome, e1, e2, e3, e4);
	}

	public static Jogador criarJogador() {
		String nomeGerado = View.getString("Informe o seu nome: ", "[CADASTRO JOGADOR]");
		String senhaGerada = View.getString("Informe a sua senha: ", "[CADASTRO JOGADOR]");
		Jogador user = new Jogador (nomeGerado, senhaGerada);
		return user;
	}

	public static Item criarItem() {
		String nomeGerado = View.getString("Informe o nome do Item", "[CADASTRO ITEM]");
		int dano = View.getInt("Informe a quantidade de dano que o item fornece: ", "[CADASTRO ITEM]");
		int armadura = View.getInt("Informe a quantidade de armadura que o item fornece: ", "[CADASTRO ITEM]");
		int mana = View.getInt("Informe a quantidade de mana que o item fornece: ", "[CADASTRO ITEM]");
		int resistenciaMagica = View.getInt("Informe a quantidade de resist�ncia m�gica que o item oferece: ", "[CADASTRO ITEM]");

		return new Item(nomeGerado, dano, armadura, mana, resistenciaMagica);
	}

	public static Determinacao encontrarDeterminacao(ArrayList<Determinacao> runas, String nome){
		return runas.stream().filter(r -> nome.equals(r.getNome())).findAny().orElse(null);	
	}
	
	public static Dominacao encontrarDominacao(ArrayList<Dominacao> runas, String nome){
		return runas.stream().filter(r -> nome.equals(r.getNome())).findAny().orElse(null);	
	}
	
	public static Feiticaria encontrarFeiticaria(ArrayList<Feiticaria> runas, String nome){
		return runas.stream().filter(r -> nome.equals(r.getNome())).findAny().orElse(null);	
	}
	
	public static Inspiracao encontrarInspiracao(ArrayList<Inspiracao> runas, String nome){
		return runas.stream().filter(r -> nome.equals(r.getNome())).findAny().orElse(null);	
	}
	
	public static Precisao encontrarPrecisao(ArrayList<Precisao> runas, String nome){
		return runas.stream().filter(r -> nome.equals(r.getNome())).findAny().orElse(null);	
	}
	
}
