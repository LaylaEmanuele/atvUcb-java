package br.com.gabriel.hospital.main;

//MARK: Imports
import br.com.gabriel.hospital.interfaces.IFuncionario;
import br.com.gabriel.hospital.utils.View;

public class Funcionario extends Pessoa implements IFuncionario {
  // MARK: Attributes
  private String cadastro;

  // MARK: Constructor
  public Funcionario(String cadastro, String nome, String cpf, int idade, String tipoSanguineo) {
    super(nome, cpf, idade, tipoSanguineo);
    setCadastro(cadastro);
  }

  // MARK: Methods
  public void baterPonto() {
    View.showMsg("Ponto marcado " + this.getNome());
  }

  public String getCadastro() {
    return this.cadastro;
  }

  public void setCadastro(String cadastro) {
    if (cadastro.trim().length() <= 0) {
      throw new IllegalArgumentException("[FUNCIONARIO]: O cadastro não pode ser vazio!");
    }

    this.cadastro = cadastro;
  }

  @Override
  public String toString() {
    return "{" + " cadastro='" + getCadastro() + "'" + "}";
  }
}
