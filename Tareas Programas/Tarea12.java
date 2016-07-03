/*Nombre: Miguel A. Covarrubias Reynoso
Matricula: 1719246
Hora: v3 LMV
Nombre Programa: Tarea12*/

import javax.swing.JOptionPane;

public class Tarea12{
	public static void main(String[] args) {
		String Sonidos;
		int sonxmin;
		float Fa, Ce;

		Sonidos = JOptionPane.showInputDialog("Ingresa la cantidad de Sonidos por minuto");
		sonxmin = Integer.parseInt(Sonidos);

		Fa = ((float)sonxmin/4)+40;
		Ce = (Fa-32)/(float)1.8;

		JOptionPane.showMessageDialog(null, "Los grados en Fahrenheit son: "+Fa);
		JOptionPane.showMessageDialog(null, "Los grados en Celsius son: "+Ce);
	}
}