package br.com.gabriel.hospital.interfaces;

//MARK: Imports
import br.com.gabriel.hospital.main.Enfermeira;
import br.com.gabriel.hospital.main.Medico;
import br.com.gabriel.hospital.main.Secretaria;

public interface IHospital {
  public void cadastrarFuncionario(Medico medico);

  public void cadastrarFuncionario(Enfermeira enfermeira);

  public void cadastrarFuncionario(Secretaria secretaria);

  public void excluirFuncionario(Medico medico);

  public void excluirFuncionario(Enfermeira enfermeira);

  public void excluirFuncionario(Secretaria secretaria);
}
