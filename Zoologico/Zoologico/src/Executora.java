
public class Executora {
	public static void main(String[] args) {
		Mamifero baleia = new Mamifero("Baleia", "Bufar", "Um dos maiores mamiferos que existe", "Carnivora");
		Mamifero leao = new Mamifero("Leao", "Rugindo", "Muito rapido e veloz", "Carnivoro");
		Mamifero cachorro = new Mamifero("Cachorro", "Latindo", "Melhor amigo do homem", "Carnivoro");

		Inseto abelha = new Inseto("Abelha", "Zumbir", "Ajuda na polização", "Completa");
		Inseto formiga = new Inseto("Formiga", "Zinindo", "Trabalha em uma grande equipe", "Completa");
		Inseto borboleta = new Inseto("Borboleta", "Batendo as asas", "Ajuda na polização", "Completa");

		Reptil crocodilo = new Reptil("Crocodilo", "Sem som", "Possui uma mordida bem forte", "Crocodylia");
		Reptil serpente  = new Reptil("Serpente", "Sibilando", "Possui a capacidade de engolir animais maiores que ela mesma", "Escamados");
		Reptil tartaruga = new Reptil("Tartaruga", "Sem som", "Vivem mais de 150 anos", "Chelonia");

		String relatorio = baleia.toString() + "\n" + leao.toString() + "\n" + cachorro.toString() + "\n" + abelha.toString() + "\n" + formiga.toString() + "\n"  + borboleta.toString()  
		+ "\n" + crocodilo.toString() + "\n" + serpente.toString() + "\n" + tartaruga.toString();

		View.showMsg(relatorio);
	}

}
