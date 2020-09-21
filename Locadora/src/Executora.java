
public class Executora {
	public static void main(String[] args) {
		Locadora locafacil = new Locadora("Locafácil");
		locafacil.cadastrarFilme();
		Filial filial1 = locafacil.cadastrarFilial();
		Funcionarios funcionario1 = filial1.cadastrarFuncionario();
		Cliente andre = funcionario1.cadastrarCliente();
		andre.alugarFilme();
		
		Locacao loca = new Locacao();
		loca.relatorio();
	}
}
