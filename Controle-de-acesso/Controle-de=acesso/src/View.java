import javax.swing.JOptionPane;

public class View {
	static void exibirMensagem(String msg, String titulo) {
		JOptionPane.showMessageDialog(null, msg, titulo, JOptionPane.PLAIN_MESSAGE);
	}
	static void exibirM(int msg, String titulo) {
		JOptionPane.showMessageDialog(null, msg, titulo, JOptionPane.PLAIN_MESSAGE);
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
}
