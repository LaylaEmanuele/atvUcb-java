package br.com.gabriel.hospital.main;

import br.com.gabriel.hospital.utils.View;

public class Paciente extends Pessoa {

  // MARK: Constructor
  public Paciente(String nome, String cpf, int idade, String tipoSanguineo) {
    super(nome, cpf, idade, tipoSanguineo);
  }

  // MARK: Methods
  public void doarSangue() {
    View.showMsg("Sangue doado " + this.getNome() + " do tipo: " + this.getTipoSanguineo());
  }
}
