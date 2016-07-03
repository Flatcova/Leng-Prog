/*Nombre: Miguel A. Covarrubias Reynoso
Matricula: 1719246
Hora: v3 LMV
Nombre Programa: Tarea14*/

import javax.swing.JOptionPane;

public class Tarea14{
	public static void main(String[] args) {
		String Compras;
		float compras;

		Compras = JOptionPane.showInputDialog("Ingresa el total de compras");
		compras = Float.parseFloat(Compras);

		JOptionPane.showMessageDialog(null, "Total a pagar sin Descuento: "+compras);
		if (compras < 800) {
			compras = compras*(float)1;
		}else if (compras <= 1500) {
			compras = compras*(float).9;
		}else if (compras <= 5000) {
			compras = compras*(float).85;
		}else {
			compras = compras*(float).8;
		}
		JOptionPane.showMessageDialog(null, "Total a pagar despues del Descuento: "+compras);
	}
}