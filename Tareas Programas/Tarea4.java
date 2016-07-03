/*Nombre: Miguel A. Covarrubias Reynoso
Matricula: 1719246
Hora: v3 LMV
Nombre Programa: Tarea4*/

import javax.swing.JOptionPane;

public class Tarea4{
	public static void main(String[] args) {
		String Valor;
		int valor;

		Valor = JOptionPane.showInputDialog("Ingresa el numero a evaluar");
		valor = Integer.parseInt(Valor);

		do{
			valor = valor-2;
		}while(valor > 0);

		if (valor==0) {
			JOptionPane.showMessageDialog(null, "Es par");
		}else{
			JOptionPane.showMessageDialog(null, "Es impar");
		}
	}
}