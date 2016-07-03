/*Nombre: Miguel A. Covarrubias Reynoso
Matricula: 1719246
Hora: v3 LMV
Nombre Programa: Tarea26*/

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Tarea26{
	public static void main(String[] args) {
		String entrada, letrero=" ";
		int col, fil, col2, fil2, filmul, colmul, suma=0, valor;
		do{
		entrada = JOptionPane.showInputDialog("Ingrese de cuantas columnas sera la primera matriz");
		col = Integer.parseInt(entrada);
		entrada = JOptionPane.showInputDialog("Ingrese de cuantas filas sera la primera matriz");
		fil = Integer.parseInt(entrada);
		
		entrada = JOptionPane.showInputDialog("Ingrese de cuantas columnas sera la segunda matriz");
		col2 = Integer.parseInt(entrada);
		entrada = JOptionPane.showInputDialog("Ingrese de cuantas filas sera la segunda matriz");
		fil2 = Integer.parseInt(entrada);
		
		if(fil != col2 && col != fil2){
			JOptionPane.showMessageDialog(null, "Para multiplicar las colmnas de una matriz y las filas de otra deben iguales");
		}
		}while(fil != col2 && col != fil2);
			
		int [][] Primero = new int[col][fil]; 
		int [][] Segundo = new int[col2][fil2];
		int [][] Multi;
		if (col == fil2) {
			colmul = col2;
			filmul = fil;
			Multi = new int[colmul][filmul];
		}else{
			colmul = col;
			filmul = fil2;
			Multi = new int[colmul][filmul];
		}
		
		for(int i=0; i<col; i++){
			for (int j=0; j<fil; j++){
				entrada = JOptionPane.showInputDialog("Ingrese el valor en la posicion "+i+", "+j+" de la primera matriz");
				valor= Integer.parseInt(entrada);
				Primero[i][j] = valor;
			}
		}
		for(int i=0; i<col2; i++){
			for (int j=0; j<fil2; j++){
				entrada = JOptionPane.showInputDialog("Ingrese el valor en la posicion "+i+", "+j+" de la segunda matriz");
				valor= Integer.parseInt(entrada);
				Segundo[i][j] = valor;
			}
		}
		letrero += "Primera matriz: \n";
		for(int i=0; i<col; i++){
			for (int j=0; j<fil; j++){
				letrero += Primero[i][j];
			}
			letrero += "\n";
		}
		letrero += "\nSegunda matriz: \n";
		for(int i=0; i<col2; i++){
			for (int j=0; j<fil2; j++){
				letrero += Segundo[i][j];
			}
			letrero += "\n";
		}
		letrero += "\nMatriz resultante: \n";
		for(int i=0; i<col; i++){
			for (int j=0; j<fil2; j++){
				for (int k=0; k<col2; k++){
						suma += Primero[i][k] * Segundo[k][j];
				}
				Multi[i][j] = suma;
				suma=0;
				letrero += Multi[i][j];
			}
			letrero += "\n";
		}
		
		JOptionPane.showMessageDialog(null, letrero);
	}
}