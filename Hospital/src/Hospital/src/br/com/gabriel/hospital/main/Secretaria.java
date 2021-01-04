package br.com.gabriel.hospital.main;

import java.util.ArrayList;

public class Secretaria extends Funcionario {

  // MARK: Constructor
  public Secretaria(String cadastro, String nome, String cpf, int idade, String tipoSanguineo) {
    super(cadastro, nome, cpf, idade, tipoSanguineo);
  }

  // MARK: Methods
  public void marcarExame(ArrayList<Exame> exames, Paciente paciente, Medico medico, String tipo) {
    exames.add(new Exame(medico, paciente, tipo));
  }

  public void cadastrarPaciente(ArrayList<Paciente> pacientes, Paciente paciente) {
    pacientes.add(paciente);
  }

  public void excluirPaciente(ArrayList<Paciente> pacientes, Paciente paciente) {
    pacientes.remove(paciente);
  }
}
