package br.com.gabriel.hospital.main;

// MARK: Imports
import java.util.ArrayList;
import br.com.gabriel.hospital.interfaces.IHospital;

public class Hospital implements IHospital {
  // MARK: Attributes
  private ArrayList<Exame> exames = new ArrayList<Exame>();
  private ArrayList<Medico> medicos = new ArrayList<Medico>();
  private ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
  private ArrayList<Enfermeira> enfermeiras = new ArrayList<Enfermeira>();
  private ArrayList<Secretaria> secretarias = new ArrayList<Secretaria>();
  private String nome;

  // MARK: Constructor
  public Hospital(String nome) {
    setNome(nome);
  }

  // MARK: Methods
  public void cadastrarFuncionario(Medico medico) {
    if (medico == null) {
      throw new IllegalArgumentException("[HOSPITAL]: O m�dico � inv�lido!");
    }

    cadastroExiste(medico.getCadastro());

    getMedicos().forEach(f -> {
      if (f.getCRM().equals(medico.getCRM())) {
        throw new IllegalArgumentException("[HOSPITAL]: J� existe um m�dico com esse CRM no sistema!");
      }
    });

    getMedicos().add(medico);
  }

  public void cadastrarFuncionario(Enfermeira enfermeira) {
    if (enfermeira == null) {
      throw new IllegalArgumentException("[HOSPITAL]: A enfermeira � inv�lida!");
    }

    cadastroExiste(enfermeira.getCadastro());

    getEnfermeiras().add(enfermeira);
  }

  public void cadastrarFuncionario(Secretaria secretaria) {
    if (secretaria == null) {
      throw new IllegalArgumentException("[HOSPITAL]: a secretaria � inv�lida!");
    }

    cadastroExiste(secretaria.getCadastro());

    getSecretarias().add(secretaria);
  }

  public void excluirFuncionario(Medico medico) {
    getMedicos().remove(medico);
  }

  public void excluirFuncionario(Enfermeira enfermeira) {
    getEnfermeiras().remove(enfermeira);
  }

  public void excluirFuncionario(Secretaria secretaria) {
    getSecretarias().remove(secretaria);
  }

  public void definirAssistente(Enfermeira enfermeira, Medico medico) {
    medico.setAssistente(enfermeira);
  }

  private void cadastroExiste(String cadastro) {
    getEnfermeiras().forEach(f -> {
      if (f.getCadastro().equals(cadastro))
        throw new IllegalArgumentException("[HOSPITAL]: J� existe um funcion�rio com esse cadastro no sistema!");
    });

    getMedicos().forEach(f -> {
      if (f.getCadastro().equals(cadastro))
        throw new IllegalArgumentException("[HOSPITAL]: J� existe um funcion�rio com esse cadastro no sistema!");
    });

    getSecretarias().forEach(f -> {
      if (f.getCadastro().equals(cadastro))
        throw new IllegalArgumentException("[HOSPITAL]: J� existe um funcion�rio com esse cadastro no sistema!");
    });
  }

  // MARK: Getters & Setters
  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    if (nome.trim().length() <= 0) {
      throw new IllegalArgumentException("[HOSPITAL]: O nome do hospital n�o pode ser vazio!");
    }

    this.nome = nome;
  }

  public ArrayList<Medico> getMedicos() {
    return this.medicos;
  }

  public ArrayList<Exame> getExames() {
    return this.exames;
  }

  public ArrayList<Paciente> getPacientes() {
    return this.pacientes;
  }

  public ArrayList<Enfermeira> getEnfermeiras() {
    return this.enfermeiras;
  }

  public ArrayList<Secretaria> getSecretarias() {
    return this.secretarias;
  }

  @Override
  public String toString() {
    return "{" + " exames='" + getExames() + "'" + ", medicos='" + getMedicos() + "'" + ", pacientes='" + getPacientes()
        + "'" + ", enfermeiras='" + getEnfermeiras() + "'" + ", secretarias='" + getSecretarias() + "'" + ", nome='"
        + getNome() + "'" + "}";
  }
}
