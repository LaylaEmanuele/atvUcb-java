
public class Veiculo {
	//Atributes
	String modelo, marca, dono;
	float valor, quilometragem;
	
	//Methods
	void calcKm(int dias){
		this.quilometragem+=(90*dias);
	}
	void calcValor(int dias){
		this.valor = this.valor - (this.valor*dias*0.00027397f);
	}
}
