/*Nombre: Miguel A. Covarrubias Reynoso
Matricula: 1719246
Hora: v3 LMV
Nombre Programa: Tarea10*/

import javax.swing.JOptionPane;

public class Tarea10{
	public static void main(String[] args) {
		String Valor, letrero=" ";
		int valor, numero=1, rep=0;

		Valor = JOptionPane.showInputDialog("Ingresa el numero de datos a imprimir de la serie");
		valor = Integer.parseInt(Valor);

		for (int i=0; i<valor; i++) {
			if (rep >0){
				if (rep != numero-1) {
					letrero = letrero+numero+", ";
					rep ++;
				}else{
					if (numero == 2) {
						letrero = letrero+numero+", ";
						numero ++;
						rep = 0;
					}else{
						numero++;
						letrero = letrero+"-"+numero+", ";
						numero++;
						rep = 0;	
					}	
				}
			}
			else if (rep <= 0) {
				if (numero%2 == 0) {
					letrero = letrero+numero+", ";
					rep ++;
				}else{
					letrero = letrero+"-"+numero+", ";
					numero++;
				}
			}	
		}
		JOptionPane.showMessageDialog(null, "Serie : "+letrero);
	}
}