/*Nombre: Miguel A. Covarrubias Reynoso
Matricula: 1719246
Hora: v3 LMV
Nombre Programa: Tarea15*/

import javax.swing.JOptionPane;

public class Tarea15{
	public static void main(String[] args) {
		String Valor, letrero=" ";
		float numero;

		Valor = JOptionPane.showInputDialog("Ingresa el numero de datos a imprimir de la serie");
		numero = Integer.parseInt(Valor);

		letrero = letrero+"1";
		for (int i=2; i<=numero; i++) {
			letrero = letrero+", 1/"+i;
		}
		JOptionPane.showMessageDialog(null, "Serie : "+letrero);
	}
}