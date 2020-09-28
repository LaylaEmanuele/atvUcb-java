import java.util.ArrayList;
import java.util.Comparator;

public class Corrida {
	//Attributes 
	private ArrayList<Volta> voltas = new ArrayList<Volta>();
	private ArrayList<Piloto> pilotos = null;
	
	//Construtor
	Corrida(ArrayList<Piloto> pilotos){
		this.pilotos = pilotos;
	}
	
	//Getters and Setters 
	public ArrayList<Volta> getVoltas() {
		return voltas;
	}
	public void setVoltas(ArrayList<Volta> voltas) {
		this.voltas = voltas;
	}
	public ArrayList<Piloto> getPilotos() {
		return pilotos;
	}
	public void setPilotos(ArrayList<Piloto> pilotos) {
		this.pilotos = pilotos;
	}
	
	//Methods 
	void realizarCorrida() {
		for (Piloto piloto : pilotos) {
			Volta volta = new Volta(piloto);
			getVoltas().add(volta);
		}
		this.finalizarCorrida();
	}
	void finalizarCorrida() {
		voltas.sort(Comparator.comparingInt(e -> e.getTempoFinal()));
		int size = getVoltas().size();
		Piloto aux;
		String msg = "";
		for (int i = 0; i < size; i++) {
			aux = getVoltas().get((size-1)-i).getPiloto();
			aux.setPosicao(size-i);
			msg += i+1 +"º Lugar\n" + aux.toString() + "\n";
		}
		
		View.exibirMensagem(msg, "[CORRIDA]");
	}
	void addPiloto(Piloto piloto) {
		
	}
	
	
	
	
}
