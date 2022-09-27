package salgado;

import javax.swing.JOptionPane;

public class salgado {

	salgado() {

		float valor;
		int menu;

		// Menu com os Salgadinhos
		menu = Integer.parseInt(JOptionPane.showInputDialog("Escolha seu Salgado:"
				+ "\n 1 Salgado de Pizza 10,00 $"
				+ "\n 2 Salgado de Carne 6,50 $"
				+ "\n 3 Salgado de Salgadinho 7,00 $"
				+ "\n 4 Salgado de Bacon 6,00 $"));
        // Escolha dos Salgados se for = 0 
		if (menu == 0) {
			JOptionPane.showMessageDialog(null, "SEM VALOR");
		}
        // Escolha dos Salgados se for = 1 (Salgadinho de Pizza 10,00)
		if (menu == 1) {
			valor = Float.parseFloat(JOptionPane.showInputDialog("DIGITE O VALOR:"));
			if (valor == 10) {
				JOptionPane.showMessageDialog(null, "Salgadinho de Pizza comprado");
			}
			if (valor < 10) {
				JOptionPane.showMessageDialog(null, "Está faltando: " + ((valor - 10) * (-1)) + "Reais");
			}
			if (valor > 10) {
				JOptionPane.showMessageDialog(null, "Troco: " + (valor - 10));
			}
		}
		// Escolha dos Salgados se for = 1 (Salgadinho de Carne 6,50)
		if (menu == 2) {
			valor = Float.parseFloat(JOptionPane.showInputDialog("DIGITE O VALOR:"));
			if (valor == 6.50) {
				JOptionPane.showMessageDialog(null, "Salgadinho de Carne comprado");
			}
			if (valor < 6.50) {
				JOptionPane.showMessageDialog(null, "Está faltando: " + ((valor - 6.50) * (-1)) + "Reais");
			}
			if (valor > 6.50) {
				JOptionPane.showMessageDialog(null, "Troco: " + (valor - 6.50));
			}
		}
		// Escolha dos Salgados se for = 1 (Salgadinho de Salgadinho 7,00)
		if (menu == 3) {
			valor = Float.parseFloat(JOptionPane.showInputDialog("DIGITE O VALOR:"));
			if (valor == 7) {
				JOptionPane.showMessageDialog(null, "Salgadinho de Salgadinho");
			}
			if (valor < 7) {
				JOptionPane.showMessageDialog(null, "Está faltando " + ((valor - 7) * (-1)) + "Reais");
			}
			if (valor > 7) {
				JOptionPane.showMessageDialog(null, "Troco: " + (valor - 7));
			}
		}
		// Escolha dos Salgados se for = 1 (Salgadinho de Bacon 6,00)
		if (menu == 4) {
			valor = Float.parseFloat(JOptionPane.showInputDialog("DIGITE O VALOR:"));
			if (valor == 6) {
				JOptionPane.showMessageDialog(null, "Salgadinho de Bacon");
			}
			if (valor < 6) {
				JOptionPane.showMessageDialog(null, "Está faltando " + ((valor - 6) * (-1)) + "Reais");
			}
			if (valor > 6) {
				JOptionPane.showMessageDialog(null, "Troco: " + (valor - 6));
			}
		}
	}

	public static void main(String[] args) {
		salgado teste = new salgado();

	}

}
