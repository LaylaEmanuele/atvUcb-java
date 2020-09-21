import javax.swing.JOptionPane;

public class View {
	static void exibirMensagem(String msg) {
		JOptionPane.showMessageDialog(null, msg);
	}
	static String solicitarString(String msg, String titulo) {
		return JOptionPane.showInputDialog(null, msg, titulo, JOptionPane.DEFAULT_OPTION);
	}
	static int solicitarInt(String msg, String titulo) {
		String retorno = JOptionPane.showInputDialog(null, msg, titulo, JOptionPane.INFORMATION_MESSAGE);
		return Integer.parseInt(retorno);
	}
	static void exibirErro(String erro, String titulo) {
		JOptionPane.showMessageDialog(null, erro, titulo, JOptionPane.ERROR_MESSAGE);
	}
	static double solicitarDouble(String msg, String titulo) {
		String retorno = JOptionPane.showInputDialog(null, msg, titulo, JOptionPane.INFORMATION_MESSAGE);
		return Double.parseDouble(retorno);
	}
	
}
