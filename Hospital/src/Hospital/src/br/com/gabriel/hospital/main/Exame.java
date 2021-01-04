package br.com.gabriel.hospital.main;

public class Exame {
  // MARK: Attributes
  private Medico medico;
  private Paciente paciente;
  private String tipo;

  // MARK: Constructor
  public Exame(Medico medico, Paciente paciente, String tipo) {
    setMedico(medico);
    setPaciente(paciente);
    setTipo(tipo);
  }

  // MARK: Getters & Setters
  public Medico getMedico() {
    return this.medico;
  }

  public void setMedico(Medico medico) {
    if (medico == null) {
      throw new IllegalArgumentException("[SECRETARIA]: O médico é inválido!");
    }

    this.medico = medico;
  }

  public Paciente getPaciente() {
    return this.paciente;
  }

  public void setPaciente(Paciente paciente) {
    if (paciente == null) {
      throw new IllegalArgumentException("[SECRETARIA]: O paciente é inválido!");
    }

    this.paciente = paciente;
  }

  public String getTipo() {
    return this.tipo;
  }

  public void setTipo(String tipo) {
    if (tipo.trim().length() == 0) {
      throw new IllegalArgumentException("[EXAME]: O tipo não pode ser vazio!");
    }
    this.tipo = tipo;
  }

  @Override
  public String toString() {
    return "{" + " medico='" + getMedico() + "'" + ", paciente='" + getPaciente() + "'" + ", tipo='" + getTipo() + "'"
        + "}";
  }
}