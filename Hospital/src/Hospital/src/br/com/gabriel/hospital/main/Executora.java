package br.com.gabriel.hospital.main;

import br.com.gabriel.hospital.utils.View;
import br.com.gabriel.hospital.utils.Utils;

/*
***************************************************************
	Nome: Gabriel Roberto Raposo Ferreira                      
	Matrícula: UC20104875                                               
***************************************************************
	Nome: Layla Emanuele Efren Costa                              
	Matrícula: UC19100320                                              
***************************************************************

----------------------------SUMMARY----------------------------------------
 Um sistema simples respons�vel por gerenciar um determinado 
 hospital com seus funcion�rios e pacientes. Pode-se fazer o 
 cadastro de diversos funcion�rios, onde a secretaria �      
 respons�vel pelo cadastro dos pacientes e diversas outras   
 regras de neg�cios
--------------------------------------------------------------------------------
*/

public class Executora {

	public static void main(String[] args) {
		Hospital hospital = new Hospital("Layla");

		menuHospital(hospital);
	}

	static void menuHospital(Hospital hospital) {
		int option = 0;
		String cadastro;

		do {
			try {
				option = View.getInt("Escolha uma opção: \n" + "1 - Adicionar Médico\n" + "2 - Adicionar Enfermeira \n"
						+ "3 - Adicionar Secretaria\n" + "4 - Remover Médico\n" + "5 - Remover Enfermeira\n"
						+ "6 - Remover Secretaria\n" + "7 - Acesso Médico\n" + "8 - Acesso Secretaria\n" + "9 - Acesso Enfermeira\n"
						+ "10 - Acesso Paciente" + "0 - SAIR  \n", "HOSPITAL");

				switch (option) {
					case 1:
						hospital.cadastrarFuncionario(Utils.criarMedico());
						break;

					case 2:
						hospital.cadastrarFuncionario(Utils.criarEnfermeira());
						break;

					case 3:
						hospital.cadastrarFuncionario(Utils.criarSecretaria());
						break;

					case 4:
						cadastro = View.getString("Insira o cadastro do médico que deseja encontrar", "PESQUISA");
						hospital.excluirFuncionario(Utils.encontrarMedico(hospital.getMedicos(), cadastro));
						break;

					case 5:
						cadastro = View.getString("Insira o cadastro da enfermeira que deseja encontrar", "PESQUISA");
						hospital.excluirFuncionario(Utils.encontrarEnfermeira(hospital.getEnfermeiras(), cadastro));
						break;

					case 6:
						cadastro = View.getString("Insira o cadastro da secretaria que deseja encontrar", "PESQUISA");
						hospital.excluirFuncionario(Utils.encontrarSecretaria(hospital.getSecretarias(), cadastro));
						break;

					case 7:
						cadastro = View.getString("Insira o cadastro do médico que deseja encontrar", "PESQUISA");
						menuFuncionario(Utils.encontrarMedico(hospital.getMedicos(), cadastro), hospital);
						break;

					case 8:
						cadastro = View.getString("Insira o cadastro da enfermeira que deseja encontrar", "PESQUISA");
						menuFuncionario(Utils.encontrarEnfermeira(hospital.getEnfermeiras(), cadastro), hospital);
						break;

					case 9:
						cadastro = View.getString("Insira o cadastro da secretaria que deseja encontrar", "PESQUISA");
						menuFuncionario(Utils.encontrarSecretaria(hospital.getSecretarias(), cadastro), hospital);
						break;

					case 10:
						menuPaciente(Utils.encontrarPaciente(hospital.getPacientes(),
								View.getString("Insira o CPF do paciente que deseja encontrar", "PESQUISA")));
						break;

					default:
						break;
				}

			} catch (Exception e) {
				View.showError(e.getMessage(), "ERROR");
			}
		} while (option != 0);
	}

	// MARK: Menu Enfermeira
	static void menuFuncionario(Enfermeira enfermeira, Hospital hospital) {
		int option = 0;

		do {
			try {
				option = View.getInt("Escolha uma opção: \n" + "1 - Bater Ponto\n" + "0 - SAIR  \n", "EMFERMEIRA");

				switch (option) {
					case 2:
						enfermeira.baterPonto();
						break;

					default:
						break;
				}

			} catch (Exception e) {
				View.showError(e.getMessage(), "ERROR");
			}
		} while (option != 0);
	}

	// MARK: Menu Secretaria
	static void menuFuncionario(Secretaria secretaria, Hospital hospital) {
		int option = 0;
		String cpf;
		String tipo;
		String cadastro;

		do {
			try {
				option = View.getInt("Escolha uma opção: \n" + "1 - Adicionar Paciente\n" + "2 - Remover Paciente \n"
						+ "3 - Marcar Exame\n" + "4 - Bater Ponto\n" + "0 - SAIR  \n", "HOSPITAL");

				switch (option) {
					case 1:
						secretaria.cadastrarPaciente(hospital.getPacientes(), Utils.criarPaciente());
						break;

					case 2:
						cpf = View.getString("Insira o cpf do paciente que deseja encontrar", "PESQUISA");
						secretaria.excluirPaciente(hospital.getPacientes(), Utils.encontrarPaciente(hospital.getPacientes(), cpf));
						break;

					case 3:
						tipo = View.getString("Qual o tipo do exame que deseja marcar?", "EXAME");
						cpf = View.getString("Insira o cpf do paciente que está marcando o exame", "PESQUISA");
						cadastro = View.getString("Insira o cadastro do médico que realizara o exame", "PESQUISA");
						secretaria.marcarExame(hospital.getExames(), Utils.encontrarPaciente(hospital.getPacientes(), cpf),
								Utils.encontrarMedico(hospital.getMedicos(), cadastro), tipo);
						break;

					case 4:
						secretaria.baterPonto();
						break;

					default:
						break;
				}

			} catch (Exception e) {
				View.showError(e.getMessage(), "ERROR");
			}
		} while (option != 0);
	}

	// MARK: Menu Médico
	static void menuFuncionario(Medico medico, Hospital hospital) {
		int option = 0;
		String cadastro;

		do {
			try {
				option = View.getInt(
						"Escolha uma opção: \n" + "1 - Definir Assistente\n" + "2 - Bater Ponto\n" + "0 - SAIR  \n", "HOSPITAL");

				switch (option) {
					case 1:
						cadastro = View.getString("Insira o cadastro da enfermeira que ira ser a assistente", "PESQUISA");
						hospital.definirAssistente(Utils.encontrarEnfermeira(hospital.getEnfermeiras(), cadastro), medico);
						break;

					case 2:
						medico.baterPonto();
						break;

					default:
						break;
				}

			} catch (Exception e) {
				View.showError(e.getMessage(), "ERROR");
			}
		} while (option != 0);
	}

	static void menuPaciente(Paciente paciente) {
		int option = 0;

		do {
			try {
				option = View.getInt("Escolha uma opção: \n" + "1 - Doar Sangue\n" + "0 - SAIR  \n", "HOSPITAL");

				switch (option) {
					case 1:
						paciente.doarSangue();

					default:
						break;
				}

			} catch (Exception e) {
				View.showError(e.getMessage(), "ERROR");
			}
		} while (option != 0);
	}
}
