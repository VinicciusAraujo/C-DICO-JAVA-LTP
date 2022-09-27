package vetor;

import javax.swing.JOptionPane;

import salgado.salgado;

public class vetor{
	
	vetor(){
//               BY
//Vinicius Franco Gonçalves Araújo

//Crie um programa em Java que dado 10 números quaisquer digitados 
//pelo usuário o programa retorne ele ordenado.

int x1, x2, x3,x4 ,x5 ,x6 ,x7 ,x8 ,x9 ,x10, y;

x1 = Integer.parseInt(JOptionPane.showInputDialog("Escolha um número"));
x2 = Integer.parseInt(JOptionPane.showInputDialog("Escolha um número"));
x3= Integer.parseInt(JOptionPane.showInputDialog("Escolha um número"));
x4 = Integer.parseInt(JOptionPane.showInputDialog("Escolha um número"));
x5 = Integer.parseInt(JOptionPane.showInputDialog("Escolha um número"));
x6 = Integer.parseInt(JOptionPane.showInputDialog("Escolha um número"));
x7 = Integer.parseInt(JOptionPane.showInputDialog("Escolha um número"));
x8 = Integer.parseInt(JOptionPane.showInputDialog("Escolha um número"));
x9 = Integer.parseInt(JOptionPane.showInputDialog("Escolha um número"));
x10 = Integer.parseInt(JOptionPane.showInputDialog("Escolha um número"));

JOptionPane.showInternalMessageDialog(null, "Numeros: " + x1 + " " + x2 
+ " " + x3 + " " + x4 + " " + x5 + " " + x6 + " "+ x7 + " " + x8 + " "+ x9 + " " + x10);
	}
		
		public static void main(String[] args) {
			vetor teste = new vetor();

	}

}

