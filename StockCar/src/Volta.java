import java.util.Random;

public class Volta {
	//Attributes
	private Piloto piloto = null;
	private int tempoFinal;
	private int[] tempoV = {300, 550, 650};

	//Construtor
	Volta(Piloto piloto){
		setPiloto(piloto);
	}
	
	//Getters and Setters 
	public Piloto getPiloto() {
		return piloto;
	}
	public void setPiloto(Piloto piloto) {
		this.piloto = piloto;
	}
	public int getTempoFinal() {
		return tempoFinal;
	}
	public void setTempoFinal(int tempoFinal) {
		this.tempoFinal = tempoFinal;
	}
	public int[] getTempoV() {
		return tempoV;
	}
	
	//Methods
	public void setTempoV(int[] tempoV) {
		int j;
		int tempoTotal = 0;
		int[] aux = getTempoV();
		Random rand = new Random();
		
		for (int i = 0; i < aux.length; i++) {
			j = rand.nextInt(200)-100;
			tempoTotal += aux[i]+j;
		}
		
		this.tempoFinal = tempoTotal;
	}

}
