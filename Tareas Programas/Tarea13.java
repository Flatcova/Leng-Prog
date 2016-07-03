/*Nombre: Miguel A. Covarrubias Reynoso
Matricula: 1719246
Hora: v3 LMV
Nombre Programa: Tarea13*/

import javax.swing.JOptionPane;

public class Tarea13{
	public static void main(String[] args) {
		String Salario;
		float salario;

		Salario = JOptionPane.showInputDialog("Ingresa el salario del maestro");
		salario = Float.parseFloat(Salario);

		if (salario < 18000) {
			salario = salario*(float)1.12;
		}else if (salario <= 30000) {
			salario = salario*(float)1.08;
		}else if (salario <= 50000) {
			salario = salario*(float)1.07;
		}else {
			salario = salario*(float)1.06;
		}

		JOptionPane.showMessageDialog(null, "El nuevo salario es de: "+salario);
	}
}