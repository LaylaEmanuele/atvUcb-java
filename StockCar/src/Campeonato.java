import java.util.ArrayList;
import java.util.Comparator;

public class Campeonato {
	//Atributes
	private ArrayList<Piloto> pilotos = new ArrayList<Piloto>();
	private ArrayList<Corrida> corridas = new ArrayList<Corrida>();
	
	//Construtor
	Campeonato(){
		for(int i=0; i<=5; i++) {
			Corrida aux = new Corrida(pilotos);
			corridas.add(aux);
		}	
	}
	
	//Getters and Setters 
	public ArrayList<Corrida> getCorridas() {
		return corridas;
	}
	public void setCorridas(ArrayList<Corrida> corridas) {
		this.corridas = corridas;
	}
	public ArrayList<Piloto> getPilotos() {
		return pilotos;
	}
	public void setPilotos(ArrayList<Piloto> pilotos) {
		this.pilotos = pilotos;
	}

	//Methods 
	void realizarCampeonato() {
		if(pilotos.size() < 5) {
			throw new IllegalArgumentException("[CAMPEONATO]: Não pode realizar o campeonato com menos de 5 pilotos!");
		}
		for (Corrida corrida : getCorridas()) {
			corrida.realizarCorrida();
		}
		this.finalizarCampeonato();
	}
	void finalizarCampeonato() {
		this.pilotos.sort(Comparator.comparingInt(e -> e.getPosicao()));
		int size = this.pilotos.size();
		Piloto aux;
		String msg = "";
		for (int i = 0; i < size; i++) {
			aux = this.pilotos.get((size-1)-i);
			msg += i+1 +"º Lugar\n" + aux.toString() + "\n\n";
		}
		
		View.exibirMensagem(msg, "[CAMPEONATO]");
	}
	void cadastrarPiloto(Piloto piloto) {
		this.pilotos.add(piloto);
	}
	
}
