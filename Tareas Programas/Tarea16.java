/*Nombre: Miguel A. Covarrubias Reynoso
Matricula: 1719246
Hora: v3 LMV
Nombre Programa: Tarea16*/

import javax.swing.JOptionPane;

public class Tarea16{
	public static void main(String[] args) {
		String Valor, letrero=" ";
		int numero, producto=1;

		Valor = JOptionPane.showInputDialog("Ingresa el numero de datos a imprimir de la serie");
		numero = Integer.parseInt(Valor);

		for (int i=1; i<=numero; i++) {
			producto *= i;
			letrero = letrero+producto+", ";
		}
		JOptionPane.showMessageDialog(null, "Serie : "+letrero);
	}
}