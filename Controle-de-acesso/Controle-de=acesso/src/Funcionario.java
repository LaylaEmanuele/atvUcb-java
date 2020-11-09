
public class Funcionario extends Cargo{
	int id;
	Funcionario(String nome,  int id){
		setNome( nome);
		setId(id);
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		if(id < 0) {
			throw new IllegalArgumentException("[FUNCIONÁRIO]: O id não pode ser negativo");
		}else {
			this.id = id;
		}
	}

	@Override
	void mostrarAcesso() {
		super.mostrarAcesso();
		View.exibirMensagem("Caixas \n Sala de Cofre","[FUNCIONÁRIO]");
	}
}
