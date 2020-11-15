package br.com.hospital.main;

import java.util.ArrayList;

public class Hospital {
	 private String nome;
	 private ArrayList<Medico> medicos = new ArrayList<Medico>();
	 private ArrayList<Enfermeira> enfermeiras = new ArrayList<Enfermeira>();
	
	Hospital(String nome){
		setNome(nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome.trim().length() == 0) {
			throw new IllegalArgumentException("[HOSPITAL]: O nome não pode ser vazio!");
		}else {
			this.nome = nome;
		}
	}

	public ArrayList<Medico> getMedicos() {
		return medicos;
	}

	public void setMedicos(ArrayList<Medico> medicos) { 
		if(medicos == null) {
			throw new IllegalArgumentException("[HOSPITAL]: Erro no cadastro do médico! Objeto == null");
		}else {
			this.medicos = medicos;			
		}
	}

	public ArrayList<Enfermeira> getEnfermeira() {
		return enfermeiras;
	}

	public void setEnfermeira(ArrayList<Enfermeira> enfermeiras) {
		if(enfermeiras == null) {
			throw new IllegalArgumentException("[HOSPITAL]: Erro no cadastro da enfermeira! Objeto == null");
		}else {
			this.enfermeiras = enfermeiras;			
		}
	}
	 
	 
}
