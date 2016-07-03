/*Nombre: Miguel A. Covarrubias Reynoso
Matricula: 1719246
Hora: v3 LMV
Nombre Programa: Tarea24*/

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Tarea24{
	public static void main(String[] args) {
		String entrada, letrero="";
		int col, fil, valor, count=0;
		
		entrada = JOptionPane.showInputDialog("Ingrese de cuantas columnas sera la matriz");
		col = Integer.parseInt(entrada);
		entrada = JOptionPane.showInputDialog("Ingrese de cuantas filas sera la matriz");
		fil = Integer.parseInt(entrada);
		
		int [][] ArgBid = new int[col][fil]; 
		letrero += "\nMatriz: \n";
		for(int i=0; i<col; i++){
			for (int j=0; j<fil; j++){
				entrada = JOptionPane.showInputDialog("Ingrese el valor en la posicion "+i+", "+j);
				valor= Integer.parseInt(entrada);
				ArgBid[i][j] = valor;
				letrero += ArgBid[i][j];
			}
			letrero += "\n";
		}

		entrada = JOptionPane.showInputDialog("Cual es el valor a buscar en la matriz?");
		valor = Integer.parseInt(entrada);

		for(int i=0; i<col; i++){
			for (int j=0; j<fil; j++){
				if(ArgBid[i][j] == valor){
					count ++;
				}
			}
		}
		JOptionPane.showMessageDialog(null, letrero);
		JOptionPane.showMessageDialog(null, "El numero "+valor+" se encuentra "+count+" veces");
	}
}