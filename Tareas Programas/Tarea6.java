/*Nombre: Miguel A. Covarrubias Reynoso
Matricula: 1719246
Hora: v3 LMV
Nombre Programa: Tarea6*/

import javax.swing.JOptionPane;

public class Tarea6{
	public static void main(String[]args){
		String entrada;
		int opc;
		float celsius=0, farenheit=0 ;
		
		entrada = JOptionPane.showInputDialog("\nConversion de grados\n1) Celsius a Farenheit\n2) Farenheit a Celsius\n\n");
		opc = Integer.parseInt(entrada);
		
		switch(opc){
			case 1: {
				entrada = JOptionPane.showInputDialog("Ingresa los grados Celsius");
				celsius = Integer.parseInt(entrada);
				farenheit = (celsius *9)/5+ 32;
				JOptionPane.showMessageDialog(null, "Grados en Farenheit: " + farenheit);
				break;
			}
			case 2: {
				entrada = JOptionPane.showInputDialog("Ingresa los grados Farenheit");
				farenheit = Integer.parseInt(entrada);
				celsius = ((farenheit - 32) * 5)/9;
				JOptionPane.showMessageDialog(null, "Grados en Celsius: " + celsius);
				break;
			}
			default: {
				JOptionPane.showMessageDialog(null, "Opcion invalida"); 
			}
		}
	}
}