
public class Diretores extends Cargo {
@Override
void mostrarAcesso() {
	super.mostrarAcesso();
	View.exibirMensagem("Sala de cofre", "[DIRETORES]");
}
}
