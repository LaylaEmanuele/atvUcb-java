import java.util.ArrayList;

public class Locadora {
	//Atributos
	static ArrayList<Filme> filmes = new ArrayList<Filme>();
	ArrayList<Filial> filiais = new ArrayList<Filial>();
	private String nome;
	
	//Construtores
	Locadora(String nome){
		this.nome = nome;
	}
	
	//Methods 
	void cadastrarFilme() {
		if(Locadora.filmes.size()>10) {
			View.exibirErro("Limite de filmes excedido!");
		}else {
			Filme filme = Utils.criarFilme(); 
			Locadora.filmes.add(filme);
		}
	}
	void descadastrarFilme() {
		if(Locadora.filmes.size()<0) {
			View.exibirErro("Não há filmes para se remover!");
		}else {
			Filme filmeExcluir; 
			do {
				int id = View.solicitarInt("Qual o id do filme a ser excluido? ");
				
				filmeExcluir = idFilme(id);
				if(filmeExcluir == null) {
					View.exibirErro("ID inexistente informe um id valido");
				}
			}while(filmeExcluir == null);
			
			Locadora.filmes.remove(filmeExcluir);
	
		}
	}
	Filme idFilme(int id) {
		for (Filme filmes : Locadora.filmes){
	         if (filmes.acessarId() == id){
	        	 return filmes;
	         }
		}
		return null; 
	}
	Filial cadastrarFilial() {
		if(this.filiais.size()>3) {
			View.exibirErro("Limite de filiais excedido!");
		}else {
			Filial filial = Utils.criarFiliais(); 
			this.filiais.add(filial);
			int id = filial.acessarId();
			return filial;
		}
		return null;

	}
	void descadastrarFilial() {
		if(this.filiais.size()<0) {
			View.exibirErro("Não há filiais para se remover!");
		}else {
			Filial filialExcluir; 
			do {
				int id = View.solicitarInt("Qual o id da filial a ser excluida? ");
				
				filialExcluir = idFilial(id);
				if(filialExcluir == null) {
					View.exibirErro("ID inexistente informe um id valido");
				}
			}while(filialExcluir == null);
			
			this.filiais.remove(filialExcluir);
	
		}
	}
	Filial idFilial(int id) {
		for (Filial filiais : this.filiais){
	         if (filiais.acessarId() == id){
	        	 return filiais;
	         }
		}
		return null; 
	}
	
}
