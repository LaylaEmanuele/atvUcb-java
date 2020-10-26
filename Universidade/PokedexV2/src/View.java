import javax.swing.JOptionPane;

public class View {

	static void showMsg(String msg, String title) {
		JOptionPane.showMessageDialog(null, msg, title, JOptionPane.PLAIN_MESSAGE);
	}

	static String getString(String msg, String title) {
		return JOptionPane.showInputDialog(null, msg, title, JOptionPane.INFORMATION_MESSAGE);
	}

	static int getInt(String msg, String title) {
		return Integer.parseInt(JOptionPane.showInputDialog(null, msg, title, JOptionPane.INFORMATION_MESSAGE));
	}

	static void showError(String error, String title) {
		JOptionPane.showMessageDialog(null, error, title, JOptionPane.ERROR_MESSAGE);
	}
}
