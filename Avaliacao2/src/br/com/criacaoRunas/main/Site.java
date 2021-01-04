package br.com.criacaoRunas.main;

// Imports
import java.util.ArrayList;
import br.com.criacaoRunas.utils.View;

public class Site {
	// Attributes 
	private ArrayList<Jogador> jogadores = new ArrayList<Jogador>();
	private String nome;

	// Constructor
	Site(String nome){
		this.nome = nome;
	}

	// Methods

	public ArrayList<Jogador> getUsers() {
		return jogadores;
	}

	public void setUsers(ArrayList<Jogador> jogadores) {
		if(jogadores == null) {
			throw new IllegalArgumentException("[USU�RIO]: Erro no cadastro do usu�rio! Objeto == null");
		}else {
			this.jogadores = jogadores;			
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome == null || nome.trim().length() == 0) {
			throw new IllegalArgumentException("[SITE]: O nome n�o pode ser vazio!");
		}else {
			this.nome = nome;
		}
	}

	void criarId(Jogador user){
		int  id = View.getInt("Informe um id de sua prefer�ncia: ", "[CADASTRO USU�RIO]");
		for (Jogador jogador : jogadores) {
			if(id == jogador.getId()) {
				throw new IllegalArgumentException("[CADASTRO JOGADOR]: Id j� cadastrado!");
			}
		}
		user.setId(id);
		this.jogadores.add(user);
	}

	Jogador realizarLogin() {
		int id = View.getInt("Id:", "[LOGIN]");
		Jogador usuario = validarLoginId(id);	
		if(usuario == null) {
			throw new IllegalArgumentException("[LOGIN]: Usu�rio n�o cadastrado!");
		}else {
			this.validarLoginSenha(usuario);
			return usuario;
		}

	}

	Jogador validarLoginId(int id) {
		for (Jogador user : jogadores) {
			if(id == user.getId()) {
				Jogador usuario = user;
				return usuario;
			}
		}
		return null;
	}

	void validarLoginSenha(Jogador user) {
		String senha = View.getString("Senha:", "[LOGIN]");
		if(!senha.equals(user.getSenha())){
			throw new IllegalArgumentException("[LOGIN]: Senha incorreta!");
		}
	}


}
