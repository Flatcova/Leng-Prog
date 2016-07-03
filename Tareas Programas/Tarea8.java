/*Nombre: Miguel A. Covarrubias Reynoso
Matricula: 1719246
Hora: v3 LMV
Nombre Programa: Tarea8*/

import javax.swing.JOptionPane;

public class Tarea8{
	public static void main(String[] args) {
		String Valor, letrero=" ";
		int valor, numero=1, suma=0;

		Valor = JOptionPane.showInputDialog("Ingresa el numero de datos a imprimir de la serie");
		valor = Integer.parseInt(Valor);
		valor = valor+(valor-1);
		
			if (numero <= valor) {
				suma+=total(numero);
				numero+=2;
			}if (numero <= valor) {
				suma+=total(numero);
				numero+=2;
			}if (numero <= valor) {
				suma+=total(numero);
				numero+=2;
			}if (numero <= valor) {
				suma+=total(numero);
				numero+=2;
			}if (numero <= valor) {
				suma+=total(numero);
				numero+=2;
			}if (numero <= valor) {
				suma+=total(numero);
				numero+=2;
			}if (numero <= valor) {
				suma+=total(numero);
				numero+=2;
			}
		
		JOptionPane.showMessageDialog(null, "Su suma es : "+suma);
	}

	public static int total(int numero){
		int suma=0;

			if (numero%2 == 1) {
				suma = numero;
			}else{ /* seuridad */
				numero++;
				if (numero%2 == 1) {
					suma = numero;
				}
			}

		return suma;
	}
}