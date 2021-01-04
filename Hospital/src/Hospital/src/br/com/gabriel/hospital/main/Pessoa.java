package br.com.gabriel.hospital.main;

import br.com.gabriel.hospital.interfaces.IPessoa;

public class Pessoa implements IPessoa {
  // MARK: Attributes
  private String nome;
  private int idade;
  private String tipoSanguineo;
  private String cpf;

  // MARK: Constructor
  public Pessoa(String nome, String cpf, int idade, String tipoSanguineo) {
    setNome(nome);
    setIdade(idade);
    setTipoSanguineo(tipoSanguineo);
    setCpf(cpf);
  }

  // MARK: Methods
  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    if (nome.trim().length() <= 0) {
      throw new IllegalArgumentException("[PESSOA]: O nome não pode ser vazio!");
    }

    this.nome = nome;
  }

  public int getIdade() {
    return this.idade;
  }

  public void setIdade(int idade) {
    if (idade < 0) {
      throw new IllegalArgumentException("[PESSOA]: A idade não pode ser negativa!");
    }

    this.idade = idade;
  }

  public String getTipoSanguineo() {
    return this.tipoSanguineo;
  }

  public void setTipoSanguineo(String tipoSanguineo) {
    if (tipoSanguineo.trim().length() <= 0) {
      throw new IllegalArgumentException("[PESSOA]: O tipo saguineo não pode ser vazio!");
    }

    this.tipoSanguineo = tipoSanguineo;
  }

  public String getCpf() {
    return this.cpf;
  }

  public void setCpf(String cpf) {
    if (tipoSanguineo.trim().length() <= 0) {
      throw new IllegalArgumentException("[PESSOA]: O cpf não pode ser vazio!");
    }

    this.cpf = cpf;
  }

  @Override
  public String toString() {
    return "{" + " nome='" + getNome() + "'" + ", idade='" + getIdade() + "'" + ", tipoSanguineo='" + getTipoSanguineo()
        + "'" + ", cpf='" + getCpf() + "'" + "}";
  }
}
