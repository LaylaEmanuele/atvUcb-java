import java.util.ArrayList;

public class Cliente {
	//Atributos 
	private String nome, cpf, endereco;
	private ArrayList<Filme> filmesCliente = new ArrayList<Filme>();
	
	//Construtores
	 Cliente(String nome, String cpf, String endereco){
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
	}
	
	//Methods
	void alugarFilme() {
		if(this.filmesCliente.size()>2) {
			View.exibirErro("Limite de alugueis excedido!");
		}else {
			Filme filme = null;
			do {
				int id = View.solicitarInt("Qual o id do filme a ser alugado?");
				filme = idFilme(id);
				if(filme == null) {
					View.exibirErro("ID inexistente informe um id valido");
				}
			}while(filme == null);
			
	       verificaSituacao(filme); 	
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
	void verificaSituacao(Filme filme) {
		if(filme.verSituacao() == 0) {
			this.filmesCliente.add(filme);
		}else {
			View.exibirErro("Este filme está alugado no momento");
		}
	}
	String exibirAlugados() {
		String msg = "";
		for (Filme filmes : filmesCliente) {
			msg = View.exibirMsg("ID do filme alugado: " + filmes.acessarId());
			return msg;
		}
		return msg;
	}
	
	public String toString() {
		
		return "[NOME]: " + this.nome + "[CPF] " + this.cpf +"[ENDERECO] " + this.endereco;
	}
}
