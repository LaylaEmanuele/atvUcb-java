package br.com.gabriel.hospital.main;

public class Medico extends Funcionario {
  // MARK: Attributes
  private String CRM;
  private Enfermeira assistente = null;

  // MARK: Constructor
  public Medico(String CRM, String cadastro, String nome, String cpf, int idade, String tipoSanguineo) {
    super(cadastro, nome, cpf, idade, tipoSanguineo);
    setCRM(CRM);
  }

  // MARK: Getters & Setters
  public String getCRM() {
    return this.CRM;
  }

  public void setCRM(String CRM) {
    if (CRM.trim().length() <= 0) {
      throw new IllegalArgumentException("[MÉDICO]: O CRM não pode ser vazio!");
    }

    this.CRM = CRM;
  }

  public Enfermeira getAssistente() {
    return this.assistente;
  }

  public void setAssistente(Enfermeira assistente) {
    this.assistente = assistente;
  }

  @Override
  public String toString() {
    return "{" + " CRM='" + getCRM() + "'" + ", assistente='" + getAssistente() + "'" + "}";
  }
}