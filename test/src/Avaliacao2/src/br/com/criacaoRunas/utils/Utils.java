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
		String nome = View.getString("Insira o nome da sua nova Runa", "Criar Determinação");
		String e1 = View.getString("Qual o primeiro elemento a ser escolhido? \n" + "1- Aperto dos Mortos-Vivos \n" + "2- Pós-Choque \n" + "3- Guardião", "Criar Determinação");
		String e2 = View.getString("Qual o segundo elemento a ser escolhido? \n" + "1- Demolir \n" + "2- Fonte de Vida \n" + "3- Golpe de Escudo", "Criar Determinação");
		String e3 = View.getString("Qual o terceiro elemento a ser escolhido?\n" + "1- Condicionamento \n" + "2- Ventos Revigorantes \n" + "3- Osso Revestido", "Criar Determinação");
		String e4 = View.getString("Qual o quarto elemento a ser escolhido? \n" + "1- Crescimento Excessivo \n" + "2- Revitalizar \n" + "3- Inabalável", "Criar Determinação");
		return new Determinacao(nome, e1, e2, e3, e4);
	}

	public static Dominacao criarDominacao() {
		String nome = View.getString("Insira o nome da sua nova Runa", "Criar Dominação");
		String e1 = View.getString("Qual o primeiro elemento a ser escolhido?\n" + "1- Eletrocutar \n" + "2- Predador \n" + "3- Colheita Sombria \n" + "4- Chuva de Lâminas", "Criar Dominação");
		String e2 = View.getString("Qual o segundo elemento a ser escolhido?\n" + "1- Golpe Desleal \n" + "2- Gosto de Sangue \n" + "3- Impacto Repentino", "Criar Dominação");
		String e3 = View.getString("Qual o terceiro elemento a ser escolhido?\n" + "1- Sentinela Zumbi \n" + "2- Poro Fantasma \n" + "3- Globos Oculares", "Criar Dominação");
		String e4 = View.getString("Qual o quarto elemento a ser escolhido?\n" + "1- Caça Voraz \n" + "2- Caça Ardilosa \n" + "3- Caça Incansável \n" + "4- Caça Suprema", "Criar Dominação");
		return new Dominacao(nome, e1, e2, e3, e4);
	}

	public static Feiticaria criarFeiticaria() {
		String nome = View.getString("Insira o nome da sua nova Runa", "Criar Feitiçaria");
		String e1 = View.getString("Qual o primeiro elemento a ser escolhido?\n" + "1- Invocar Aery \n" + "2- Cometa Arcano \n" + "3- Ímpeto Gradual", "Criar Feitiçaria");
		String e2 = View.getString("Qual o segundo elemento a ser escolhido?\n" + "1- Orbe Anulador \n" + "2- Faixa de Fluxo de Mana \n" + "3- Manto de Nimbus", "Criar Feitiçaria");
		String e3 = View.getString("Qual o terceiro elemento a ser escolhido?\n" + "1- Transcedência \n" + "2- Celeridade \n" + "3- Foco Absoluto", "Criar Feitiçaria");
		String e4 = View.getString("Qual o quarto elemento a ser escolhido?\n" + "1- Chamuscar \n" + "2- Caminhar sobre as Águas \n" + "3- Tempestade Crescente", "Criar Feitiçaria");
		return new Feiticaria(nome, e1, e2, e3, e4);
	}

	public static Inspiracao criarInspiracao() {
		String nome = View.getString("Insira o nome da sua nova Runa", "Criar Inspiração");
		String e1 = View.getString("Qual o primeiro elemento a ser escolhido?\n" + "1- Aprimoramento Glacial \n" + "2- Livro de Feitiços Deslacrado \n" + "3- Protótipo Unirruna", "Criar Inspiração");
		String e2 = View.getString("Qual o segundo elemento a ser escolhido?\n" + "1- Flashtração Hextec \n" + "2- Calçados Mágicos \n" + "3- Sicronia Perfeita", "Criar Inspiração");
		String e3 = View.getString("Qual o terceiro elemento a ser escolhido?\n" + "1- Mercado do Futuro \n" + "2- Pulverizador de Tropas \n" + "3- Entrega de Biscoitos", "Criar Inspiração");
		String e4 = View.getString("Qual o quarto elemento a ser escolhido?\n" + "1- Perspicácia Cósmica \n" + "2- Velocidade de Aproximação \n" + "3- Tônico de Distorção no Tempo", "Criar Inspiração");
		return new Inspiracao(nome, e1, e2, e3, e4);
	}

	public static Precisao criarPrecisao() {
		String nome = View.getString("Insira o nome da sua nova Runa", "Criar Precisão");
		String e1 = View.getString("Qual o primeiro elemento a ser escolhido?\n" + "1- Pressione o Ataque \n" + "2- Ritmo Fatal \n" + "3- Agilidade nos Pés" + "4-  Conquistador", "Criar Precisão");
		String e2 = View.getString("Qual o segundo elemento a ser escolhido?\n" + "1- Cura Excessiva \n" + "2- Triunfo \n" + "3- Presença de Espírito", "Criar Precisão");
		String e3 = View.getString("Qual o terceiro elemento a ser escolhido?\n" + "1- Lenda: Espontaneidade \n" + "2- Lenda: Tenacidade \n" + "3- Lenda: Linhagem", "Criar Precisão");
		String e4 = View.getString("Qual o quarto elemento a ser escolhido?\n" + "1- Golpe de Misericórdia \n" + "2- Dilacerar \n" + "3- Até a Morte", "Criar Precisão");
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
		int resistenciaMagica = View.getInt("Informe a quantidade de resistência mágica que o item oferece: ", "[CADASTRO ITEM]");

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
