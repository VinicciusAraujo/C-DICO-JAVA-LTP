package vetor;

import javax.swing.JOptionPane;

import salgado.salgado;

public class vetor{
	
	vetor(){
//               BY
//Vinicius Franco Gon�alves Ara�jo

//Crie um programa em Java que dado 10 n�meros quaisquer digitados 
//pelo usu�rio o programa retorne ele ordenado.

int x1, x2, x3,x4 ,x5 ,x6 ,x7 ,x8 ,x9 ,x10, y;

x1 = Integer.parseInt(JOptionPane.showInputDialog("Escolha um n�mero"));
x2 = Integer.parseInt(JOptionPane.showInputDialog("Escolha um n�mero"));
x3= Integer.parseInt(JOptionPane.showInputDialog("Escolha um n�mero"));
x4 = Integer.parseInt(JOptionPane.showInputDialog("Escolha um n�mero"));
x5 = Integer.parseInt(JOptionPane.showInputDialog("Escolha um n�mero"));
x6 = Integer.parseInt(JOptionPane.showInputDialog("Escolha um n�mero"));
x7 = Integer.parseInt(JOptionPane.showInputDialog("Escolha um n�mero"));
x8 = Integer.parseInt(JOptionPane.showInputDialog("Escolha um n�mero"));
x9 = Integer.parseInt(JOptionPane.showInputDialog("Escolha um n�mero"));
x10 = Integer.parseInt(JOptionPane.showInputDialog("Escolha um n�mero"));

JOptionPane.showInternalMessageDialog(null, "Numeros: " + x1 + " " + x2 
+ " " + x3 + " " + x4 + " " + x5 + " " + x6 + " "+ x7 + " " + x8 + " "+ x9 + " " + x10);
	}
		
		public static void main(String[] args) {
			vetor teste = new vetor();

	}

}

