package br.com.criacaoRunas.utils;

// Imports
import javax.swing.JOptionPane;

abstract public class View {
	static public void exibirMensagem(String msg, String titulo) {
		JOptionPane.showMessageDialog(null, msg, titulo, JOptionPane.PLAIN_MESSAGE);
	}

	static public String getString(String msg, String title) {
		return JOptionPane.showInputDialog(null, msg, title, JOptionPane.INFORMATION_MESSAGE);
	}

	static public int getInt(String msg, String title) {
		return Integer.parseInt(JOptionPane.showInputDialog(null, msg, title, JOptionPane.INFORMATION_MESSAGE));
	}

	static public void showError(String error, String title) {
		JOptionPane.showMessageDialog(null, error, title, JOptionPane.ERROR_MESSAGE);
	}
}
