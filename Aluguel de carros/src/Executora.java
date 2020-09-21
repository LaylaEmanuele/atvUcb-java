import javax.swing.JOptionPane;

public class Executora {
	public static void main(String[] args) {
		Veiculo carro = new Veiculo();
		carro.dono = "Layla";
		carro.marca = "Fiat";
		carro.modelo = "Mobi";
		carro.valor = 20000;
		String dia = JOptionPane.showInputDialog("Informe a quantidade de dias:");
		int dias = Integer.parseInt(dia);
		carro.calcKm(dias);
		carro.calcValor(dias);
		JOptionPane.showMessageDialog(null, "O novo valor do carro é R$ " + carro.valor + " e sua quilometragem é " + carro.quilometragem + " km");
	}
}
