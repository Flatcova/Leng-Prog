/*Nombre: Miguel A. Covarrubias Reynoso
Matricula: 1719246
Hora: v3 LMV
Nombre Programa: Tarea22*/

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Tarea22{
	public static void main(String[] args) {
		String Valor, letrero=" ";
		int valor, otro=1, sum=0, apro=0, exce=0;
		
		ArrayList<Integer> Calif = new ArrayList<Integer>();

		String[] opciones = {"Si","No"};
		do{
			Valor = JOptionPane.showInputDialog("Ingrese la calificacion: ");
			valor = Integer.parseInt(Valor);
			Calif.add(valor);

			otro = JOptionPane.showOptionDialog(null, 
				"Desea ingresar otra calificacion ?",
				"Calificaciones",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null,
				opciones,
				opciones[1]);
		}while(otro==0);

		for (int i=0; i<Calif.size() ; i++) {
			sum += Calif.get(i);
			if (Calif.get(i) >= 1500) {
				exce ++;
			}
			if(Calif.get(i) > 1300){
				apro ++;
			}
		}

		float prom = (float)sum/(float)Calif.size();
		letrero += "El promedio del grupo es: "+prom+"\n";

		float porcentaje = ((float)apro/(float)Calif.size())*100;
		letrero += "Porcentaje de aprovados: "+porcentaje+"%\n";
		letrero += "Cantidad de aprovados con 1500 o mayor: "+exce+"\n";
		
		JOptionPane.showMessageDialog(null, letrero);
	}
}