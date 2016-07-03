/*Nombre: Miguel A. Covarrubias Reynoso
Matricula: 1719246
Hora: v3 LMV
Nombre Programa: Tarea23*/

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Tarea23{
	public static void main(String[] args) {
		String Valor, letrero=" ";
		int valor, sum=0, may=0, mes=0, exce=0;
		
		ArrayList<Integer> tons = new ArrayList<Integer>();
		
		for (int i=1; i<=12; i++) {
			Valor = JOptionPane.showInputDialog("Ingrese el tonelaje del "+i+" mes: ");
			valor = Integer.parseInt(Valor);
			tons.add(valor);
		}

		for (int j=0; j<tons.size() ; j++) {
			sum += tons.get(j);
		}

		float prom = (float)sum/(float)tons.size();
		letrero += "El promedio del grupo es: "+prom+"\n";

		for (int k=0;k<tons.size() ;k++ ) {
			if (tons.get(k)>prom) {
				 exce ++;
			}
		}
		letrero += "Meses con mayor tonelaje que el promedio: "+exce+"\n";
		
		for (int k=0;k<tons.size() ;k++ ) {
			if (tons.get(k)>may) {
				 may=tons.get(k);
				 mes=k+1;
			}
		}
		letrero += "El mes con mas tonelaje fue el "+mes+" con "+may+" toneladas\n";
		
		JOptionPane.showMessageDialog(null, letrero);
	}
}