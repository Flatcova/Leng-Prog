/*Nombre: Miguel A. Covarrubias Reynoso
Matricula: 1719246
Hora: v3 LMV
Nombre Programa: Tarea3*/

import javax.swing.JOptionPane;

public class Tarea3{
	public static void main(String[] args) {
		String Valor;
		float valor;

		Valor = JOptionPane.showInputDialog("Ingresa el numero a evaluar");
		valor = Float.parseFloat(Valor);

		if (valor%1 == 0) {
			JOptionPane.showMessageDialog(null, "Es entero");
		}else{
			JOptionPane.showMessageDialog(null, "Es flotante");
		}

		if (valor%2 == 0) {
			JOptionPane.showMessageDialog(null, "Es par");
		}else{
			JOptionPane.showMessageDialog(null, "Es impar");
		}
	}
}