/*Nombre: Miguel A. Covarrubias Reynoso
Matricula: 1719246
Hora: v3 LMV
Nombre Programa: Tarea20*/

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Tarea20{
	public static void main(String[] args) {
		String letrero=" ";
		int nulo=0, pos=0, neg=0;
		Integer valores[]={-1,42,null,23,-234,-12,23,null,null,-23,123};
		
		for (int i=0;i<valores.length;i++) {
			if (valores[i] != null) {
				if (valores[i] > 0){
					pos ++;
				}else{
					neg ++;
				}
			}else{
				nulo ++;
			}
		}

		JOptionPane.showMessageDialog(null, "Cantidad de valores: \n"+
											"Nulos: "+ nulo+"\n"+
											"Positivos: "+ pos+"\n"+
											"Negativos: "+ neg);
	}
}