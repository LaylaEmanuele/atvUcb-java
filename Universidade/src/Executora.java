
public class Executora {
	public static void main(String[] args) {
		int opcao = 0;
		Curso curso;
		Universidade catolica = null;
		do {
			try {
				catolica = Utils.criarUniversidade();
			} catch (Exception e) {
				View.exibirErro(e.getMessage(), "ERRO");
			}
		}while(catolica == null );

		do {
			opcao = View.solicitarInt("Digite a opção desejada: \n" + "1 - Criar curso\n"  + "2 - Criar turma\n" + "0 - Sair", "MENU");
			try {
				switch (opcao) {
				case 1:
					curso = Utils.criarCurso();
					catolica.cursos.add(curso);
					if(curso.turmas.size() != 0) {
						subMenuCurso(curso);
					}
					break;
				case 2:
					int id = View.solicitarInt("Informe o código do curso que sera adicionado a nova turma: ", "MENU");
					curso = catolica.acharCurso(id);
					if(curso != null) {
						Turma turma = curso.criarTurma();
						subMenuTurma(turma);
					}				
					break;
				}
			} catch (Exception e) {
				View.exibirErro(e.getMessage(), "ERRO");
			}	
		} while (opcao != 0);

		catolica.relatorio();

	}

	static void subMenuCurso(Curso curso) {  
		int opcao = 0;
		int id = 0;
		Turma turma1, turma2;
		Professor prof1, prof2;
		do {
			opcao = View.solicitarInt("Digite a opção desejada: \n" + "1 - Transferir aluno\n" + "2 - Transferir professor\n" + "0 - Voltar", "MENU CONTA");
			try {
				switch (opcao) {
				case 1:
					id = View.solicitarInt("Informe o codigo da turma origem: ", "MENU CURSO");
					turma1 = curso.acharTurma(id);
					
					id = View.solicitarInt("Informe o codigo da turma destino: ", "MENU CURSO");
					turma2 = curso.acharTurma(id);
					
					id = View.solicitarInt("Informe a matrícula do aluno a ser transferido: ", "MENU CURSO");
					Aluno aluno = turma1.acharAluno(id);
					break;
				case 2:
					id = View.solicitarInt("Informe o codigo da turma origem: ", "MENU CURSO");
					turma1 = curso.acharTurma(id);
					
					id = View.solicitarInt("Informe o codigo da turma destino: ", "MENU CURSO");
					turma2 = curso.acharTurma(id);
					
					prof1 = turma1.getProfessor();
					prof2 = turma2.getProfessor();
					curso.transferirProf(prof1, prof2, turma1, turma2);
					
					break;	
				}
			}catch (Exception e) {
				View.exibirErro(e.getMessage(), "ERRO");	
			}

		} while (opcao != 0);
	}
	static void subMenuTurma(Turma turma) {   
		int opcao = 0;
		do {
			opcao = View.solicitarInt("Digite a opção desejada: \n" + "1 - Adicionar aluno\n" + "2 - Adicionar professor\n" + "0 - Voltar", "MENU TURMA");
			switch (opcao) {
			case 1:
				turma.addAluno();
				break;
			case 2:
				turma.addProf();
				break;
			}

		} while (opcao != 0);
	}
}


