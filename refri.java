package refri;

import javax.swing.JOptionPane;

public class refri{
	
	refri(){
		
		float valor;
		int menu;
		menu = Integer.parseInt(JOptionPane.showInputDialog("Escolha seu refrigerante:\n 1 Guarana 10$\n 2 Fanta 6,50$\n 3 Coca-Cola 8$"));
		
		if (menu == 0) {
			JOptionPane.showMessageDialog(null , "SEM VALOR");
		}
		
		
		if (menu == 1) {
			valor = Float.parseFloat(JOptionPane.showInputDialog("DIGITE O VALOR:"));
			if (valor == 10) {
				JOptionPane.showMessageDialog(null , "Guarana COMPRADA");
			}
			if (valor < 10) {
				JOptionPane.showMessageDialog(null , "Faltando " + ((valor - 10) * (-1)));
			}
			if (valor > 10) {
				JOptionPane.showMessageDialog(null , "Troco: " + (valor - 10));
			}
		}
		if (menu == 2) {
			valor = Float.parseFloat(JOptionPane.showInputDialog("DIGITE O VALOR:"));
			if (valor == 6.50) {
				JOptionPane.showMessageDialog(null , " Fanta COMPRADA");
			}
			if (valor < 6.50) {
				JOptionPane.showMessageDialog(null , "Faltando " + ((valor - 6.50) * (-1)));
			}
			if (valor > 6.50) {
				JOptionPane.showMessageDialog(null , "Troco: " + (valor - 6.50));
			}
		}
		if (menu == 3) {
			valor = Float.parseFloat(JOptionPane.showInputDialog("DIGITE O VALOR:"));
			if (valor == 8) {
				JOptionPane.showMessageDialog(null , "Coca-cola COMPRADA");
			}
			if (valor < 8) {
				JOptionPane.showMessageDialog(null , "Faltando " + ((valor - 8) * (-1)));
			}
			if (valor > 8) {
				JOptionPane.showMessageDialog(null , "Troco: " + (valor - 8 ));
			}
		}
	}
	public static void main(String[] args) {
		refri teste = new refri();

	}

}

