
public class Utils {
	static Piloto criarPiloto() {
		String nomeGerado =  View.solicitarString("Informe o nome do piloto: ", "PILOTO");
		int idGerado = View.solicitarInt("Informe o id do piloto: ", "PILOTO");
		Piloto fulano = new Piloto (nomeGerado, idGerado);
		return fulano;
	}
	
}
