package br.com.gabriel.hospital.utils;

import java.util.ArrayList;
import br.com.gabriel.hospital.main.Medico;
import br.com.gabriel.hospital.main.Secretaria;
import br.com.gabriel.hospital.main.Enfermeira;
import br.com.gabriel.hospital.main.Paciente;

public class Utils {
  public static Medico criarMedico() {
    String CRM = View.getString("Insira o CRM do Médico", "Criar Médico");
    String cadastro = View.getString("Insira o cadastro de funcionário Médico", "Criar Médico");
    String nome = View.getString("Insira o nome do Médico", "Criar Médico");
    int idade = View.getInt("Insira a idade do Médico", "Criar Médico");
    String tipoSanguineo = View.getString("Insira o tipo sanguíneo do Médico", "Criar Médico");
    String cpf = View.getString("Insira o CPF do Médico", "Criar Médico");

    return new Medico(CRM, cadastro, nome, cpf, idade, tipoSanguineo);
  }

  public static Secretaria criarSecretaria() {
    String cadastro = View.getString("Insira o cadastro de funcionário Secretaria", "Criar Secretaria");
    String nome = View.getString("Insira o nome do Secretaria", "Criar Secretaria");
    int idade = View.getInt("Insira a idade do Secretaria", "Criar Secretaria");
    String tipoSanguineo = View.getString("Insira o tipo sanguíneo do Secretaria", "Criar Secretaria");
    String cpf = View.getString("Insira o CPF do Secretaria", "Criar Secretaria");

    return new Secretaria(cadastro, nome, cpf, idade, tipoSanguineo);
  }

  public static Enfermeira criarEnfermeira() {
    String cadastro = View.getString("Insira o cadastro de funcionário Enfermeira", "Criar Enfermeira");
    String nome = View.getString("Insira o nome do Enfermeira", "Criar Enfermeira");
    int idade = View.getInt("Insira a idade do Enfermeira", "Criar Enfermeira");
    String tipoSanguineo = View.getString("Insira o tipo sanguíneo do Enfermeira", "Criar Enfermeira");
    String cpf = View.getString("Insira o CPF do Enfermeira", "Criar Enfermeira");

    return new Enfermeira(cadastro, nome, cpf, idade, tipoSanguineo);
  }

  public static Paciente criarPaciente() {
    String nome = View.getString("Insira o nome do Paciente", "Criar Paciente");
    int idade = View.getInt("Insira a idade do Paciente", "Criar Paciente");
    String tipoSanguineo = View.getString("Insira o tipo sanguíneo do Paciente", "Criar Paciente");
    String cpf = View.getString("Insira o CPF do Paciente", "Criar Paciente");

    return new Paciente(nome, cpf, idade, tipoSanguineo);
  }

  public static Medico encontrarMedico(ArrayList<Medico> medicos, String cadastro) {
    for (Medico medico : medicos) {
      if (medico.getCadastro().equals(cadastro)) {
        return medico;
      }
    }

    throw new IllegalArgumentException("[HOSPITAL]: Não foi encontrado um médico com o cadastro informado!");
  }

  public static Secretaria encontrarSecretaria(ArrayList<Secretaria> secretarias, String cadastro) {
    for (Secretaria secretaria : secretarias) {
      if (secretaria.getCadastro().equals(cadastro)) {
        return secretaria;
      }
    }

    throw new IllegalArgumentException("[HOSPITAL]: Não foi encontrado uma secretaria com o cadastro informado!");
  }

  public static Enfermeira encontrarEnfermeira(ArrayList<Enfermeira> enfermeiras, String cadastro) {
    for (Enfermeira enfermeira : enfermeiras) {
      if (enfermeira.getCadastro().equals(cadastro)) {
        return enfermeira;
      }
    }

    throw new IllegalArgumentException("[HOSPITAL]: Não foi encontrado um enfermeira com o cadastro informado!");
  }

  public static Paciente encontrarPaciente(ArrayList<Paciente> pacientes, String cpf) {
    for (Paciente paciente : pacientes) {
      if (paciente.getCpf().equals(cpf)) {
        return paciente;
      }
    }

    throw new IllegalArgumentException("[HOSPITAL]: Não foi encontrado um paciente com o cpf informado!");
  }
}
