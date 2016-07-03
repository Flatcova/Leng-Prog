/*Nombre: Miguel A. Covarrubias Reynoso
Matricula: 1719246
Hora: v3 LMV
Nombre Programa: Tarea9*/

import javax.swing.JOptionPane;

public class Tarea9{
	public static void main(String[] args) {
		String Valor, letrero=" ";
		int valor, numero;

		Valor = JOptionPane.showInputDialog("Ingresa el numero de datos a imprimir de la serie");
		valor = Integer.parseInt(Valor);

		for (int i=1; i<=valor; i++) {
			numero = (int)Math.pow(i, (2*i-1));
			letrero = letrero+numero+", ";
		}
		
		JOptionPane.showMessageDialog(null, "Serie : "+letrero);
	}
}