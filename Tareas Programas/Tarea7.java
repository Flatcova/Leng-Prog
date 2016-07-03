/*Nombre: Miguel A. Covarrubias Reynoso
Matricula: 1719246
Hora: v3 LMV
Nombre Programa: Tarea7*/

import javax.swing.JOptionPane;

public class Tarea7{
	public static void main(String[] args) {
		String Valor, letrero=" ";
		int valor, numero=1, suma=0;

		Valor = JOptionPane.showInputDialog("Ingresa el numero de datos a imprimir de la serie");
		valor = Integer.parseInt(Valor);

		for (int i=1; i<=valor; i++) {
			letrero = letrero+numero+", ";
			suma +=numero;
			numero += 2; 
		}
		
		JOptionPane.showMessageDialog(null, "Serie : "+letrero);
		JOptionPane.showMessageDialog(null, "Su suma es : "+suma);
	}
}