
public class Executora {
	
	public static void main(String[] args) {
		menu();
	}
	static void menu() {
		int op = 0, senha;
		 op = View.solicitarInt("Selecione seu cargo:\n 1 - Cliente \n 2 - Funcionário \n 3- Gerente \n 4 - Diretor", "[LOGIN]");
		 senha = View.solicitarInt("Informe a senha:", "[LOGIN]");
		 try { 
			 if(senha == 1234) {
				 switch(op) {
				 case 1:
					 Clientes cliente = Utils.criarCliente();
					 cliente.mostrarAcesso();
					 break;
				 case 2:
					 Funcionario funcionario = Utils.criarFuncionario();
					 funcionario.mostrarAcesso();
					 break;
				 case 3:
					 Gerentes gerente = Utils.criarGerente();
					 gerente.mostrarAcesso();
					 break;
				 case 4:
					 
					 break;
				 }
			 }else {
				 new IllegalArgumentException("Senha incorreta!");
			 }
			 
		 }catch (Exception e) { 
				View.exibirErro(e.getMessage(), "ERRO"); 
			}
		 
		 
		 
	}
}

