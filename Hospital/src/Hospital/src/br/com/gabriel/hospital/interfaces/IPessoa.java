package br.com.gabriel.hospital.interfaces;

public interface IPessoa {
  public String getNome();

  public void setNome(String nome);

  public int getIdade();

  public void setIdade(int idade);

  public String getTipoSanguineo();

  public void setTipoSanguineo(String tipoSanguineo);

  public String getCpf();

  public void setCpf(String cpf);
}
