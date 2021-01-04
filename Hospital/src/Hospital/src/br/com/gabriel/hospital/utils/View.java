package br.com.gabriel.hospital.utils;

//MARK: Imports
import javax.swing.JOptionPane;

public class View {
  static public void showMsg(String msg) {
    JOptionPane.showMessageDialog(null, msg);
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
