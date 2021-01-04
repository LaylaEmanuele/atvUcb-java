package br.com.criacaoRunas.main;

// Imports
import java.util.ArrayList;
import br.com.criacaoRunas.interfaces.Ijogador;

public class Jogador implements Ijogador{
	// Attributes 
	private int id;
	private String senha; 
	private String nome; 
	private String nomeCampeao;
	private String lane;
	private ArrayList<Determinacao> determinacao = new ArrayList<Determinacao>();
	private ArrayList<Inspiracao> inspiracao = new ArrayList<Inspiracao>();
	private ArrayList<Dominacao> dominacao = new ArrayList<Dominacao>();
	private ArrayList<Feiticaria> feiticaria = new ArrayList<Feiticaria>();
	private ArrayList<Precisao> precisao = new ArrayList<Precisao>();
	private ArrayList<Item> itens = new ArrayList<Item>();

	// Constructor
	public Jogador(String nome, String senha){
		setNome(nome);
		setSenha(senha);
	}
	
	// Methods
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		if (nome.trim().length() <= 0) {
			throw new IllegalArgumentException("[JOGADOR]: O nome do Jogador nâo pode ser vazio!");
		}

		this.nome = nome;
	}
	
	public String getNomeCampeao() {
		return nomeCampeao;
	}

	public void setNomeCampeao(String nomeCampeao) {
		if (nomeCampeao.trim().length() <= 0) {
			throw new IllegalArgumentException("[JOGADOR]: O nome do Campeão nâo pode ser vazio!");
		}

		this.nomeCampeao = nomeCampeao;
	}

	public String getLane() {
		return lane;
	}

	public void setLane(String lane) {
		if (lane.trim().length() <= 0) {
			throw new IllegalArgumentException("[JOGADOR]: O nome da lane do Campeão nâo pode ser vazio!");
		}
		this.lane = lane;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		if(id < 0) {
			throw new IllegalArgumentException("[JOGADOR]: O id não pode ser negativo");
		}else {
			this.id = id;
		}
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		if(senha == null || senha.trim().length() == 0) {
			throw new IllegalArgumentException("[JOGADOR]: A senha não pode ser vazia!");
		}else {
			this.senha = senha;
		}
	}	

	public ArrayList<Determinacao> getDeterminacao() {
		return determinacao;
	}

	public ArrayList<Inspiracao> getInspiracao() {
		return inspiracao;
	}

	public ArrayList<Dominacao> getDominacao() {
		return dominacao;
	}

	public ArrayList<Feiticaria> getFeiticaria() {
		return feiticaria;
	}

	public ArrayList<Precisao> getPrecisao() {
		return precisao;
	}

	public ArrayList<Item> getItens() {
		return itens;
	}
	
	public void criarRuna(Determinacao runa) {
		getDeterminacao().add(runa);
	}

	public void criarRuna(Dominacao runa) {
		getDominacao().add(runa);
	}

	public void criarRuna(Feiticaria runa) {
		getFeiticaria().add(runa);
	}

	public void criarRuna(Inspiracao runa) {
		getInspiracao().add(runa);
	}
	
	public void criarRuna(Precisao runa) {
		getPrecisao().add(runa);
	}
	
	public void removerRuna(Determinacao runa) {
		getDeterminacao().remove(runa);
	}

	public void removerRuna(Dominacao runa) {
		getDominacao().remove(runa);
	}

	public void removerRuna(Feiticaria runa) {
		getFeiticaria().remove(runa);
	}

	public void removerRuna(Inspiracao runa) {
		getInspiracao().remove(runa);
	}
	
	public void removerRuna(Precisao runa) {
		getPrecisao().remove(runa);
	}
	
	
	@Override
	public String toString() {
		return "Jogador [determinacao=" + determinacao.toString() + "\n" +", inspiracao=" + inspiracao.toString() + "\n" +", dominacao=" + dominacao.toString()
				+"\n" + ", feiticaria=" + feiticaria.toString() + "\n" +", precisao=" + precisao.toString() + "\n" +", itens=" + itens + "]";
	}	
		
	
}
