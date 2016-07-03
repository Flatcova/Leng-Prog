/*Nombre: Miguel A. Covarrubias Reynoso
Matricula: 1719246
Hora: v3 LMV
Nombre Programa: Tarea25*/

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Tarea25{
	public static void main(String[] args) {
		String entrada, letrero=" ";
		int col, fil, col2, fil2, valor;
		do{
		entrada = JOptionPane.showInputDialog("Ingrese de cuantas columnas sera la primera matriz");
		col = Integer.parseInt(entrada);
		entrada = JOptionPane.showInputDialog("Ingrese de cuantas filas sera la primera matriz");
		fil = Integer.parseInt(entrada);

		entrada = JOptionPane.showInputDialog("Ingrese de cuantas columnas sera la segunda matriz");
		col2 = Integer.parseInt(entrada);
		entrada = JOptionPane.showInputDialog("Ingrese de cuantas filas sera la segunda matriz");
		fil2 = Integer.parseInt(entrada);

		if(col != col2 || fil != fil2){
			JOptionPane.showMessageDialog(null, "Para sumar las matrices deben ser iguales");
		}
		}while(col != col2 || fil != fil2);
			
		int [][] Primero = new int[col][fil]; 
		int [][] Segundo = new int[col2][fil2];
		int [][] Suma = new int[col][fil];
		letrero += "\nPrimera matriz: \n";
		for(int i=0; i<col; i++){
			for (int j=0; j<fil; j++){
				entrada = JOptionPane.showInputDialog("Ingrese el valor en la posicion "+i+", "+j+" de la Primera matriz");
				valor= Integer.parseInt(entrada);
				Primero[i][j] = valor;
				letrero += Primero[i][j];
			}
			letrero += "\n";
		}
		letrero += "\nSegunda matriz: \n";
		for(int i=0; i<col; i++){
			for (int j=0; j<fil; j++){
				entrada = JOptionPane.showInputDialog("Ingrese el valor en la posicion "+i+", "+j+" de la Segunda matriz");
				valor= Integer.parseInt(entrada);
				Segundo[i][j] = valor;
				letrero += Segundo[i][j];
			}
			letrero += "\n";
		}
		letrero += "\nMatriz Resultante: \n";
		for(int i=0; i<col; i++){
			for (int j=0; j<fil; j++){
				Suma[i][j] = Primero[i][j] + Segundo[i][j];
				letrero += Suma[i][j];
			}
			letrero += "\n";
		}
		JOptionPane.showMessageDialog(null, letrero);
	}
}