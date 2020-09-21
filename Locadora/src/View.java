import javax.swing.JOptionPane;

public class View {
	static void exibirMensagem(String msg) {
		JOptionPane.showMessageDialog(null, msg);
	}
	static String exibirMsg(String msg) {
		 JOptionPane.showMessageDialog(null, msg);
		 return msg;
	}
	static String solicitarString(String msg) {
		return JOptionPane.showInputDialog(msg);
	}
	static int solicitarInt(String msg) {
		String retorno = JOptionPane.showInputDialog(msg);
		return Integer.parseInt(retorno);
	}
	static double solicitarDouble(String msg) {
		String retorno = JOptionPane.showInputDialog(msg);
		return Double.parseDouble(retorno);
	}
	static void exibirErro(String erro) {
		JOptionPane.showMessageDialog(null, erro, "ERRO!", JOptionPane.ERROR_MESSAGE);
	}
}
