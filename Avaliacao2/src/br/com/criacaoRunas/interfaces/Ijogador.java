package br.com.criacaoRunas.interfaces;

import java.util.ArrayList;

import br.com.criacaoRunas.main.Determinacao;
import br.com.criacaoRunas.main.Dominacao;
import br.com.criacaoRunas.main.Feiticaria;
import br.com.criacaoRunas.main.Inspiracao;
import br.com.criacaoRunas.main.Item;
import br.com.criacaoRunas.main.Precisao;

public interface Ijogador {
	public String getNome();

	public void setNome(String nome);

	public String getNomeCampeao();

	public void setNomeCampeao(String nomeCampeao);

	public String getLane();

	public void setLane(String lane);

	public void setId(int id);
	
	public int getId();
	
	public void setSenha(String senha);
	
	public String getSenha();
	
	public ArrayList<Determinacao> getDeterminacao();


	public ArrayList<Inspiracao> getInspiracao();

	public ArrayList<Dominacao> getDominacao();

	public ArrayList<Feiticaria> getFeiticaria();

	public ArrayList<Precisao> getPrecisao();

	public ArrayList<Item> getItens();



}
