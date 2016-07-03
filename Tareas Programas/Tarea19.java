/*Nombre: Miguel A. Covarrubias Reynoso
Matricula: 1719246
Hora: v3 LMV
Nombre Programa: Tarea19*/

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Tarea19{
	public static void main(String[] args) {
		String entrada, nombre, letrero=" ";
		int valor, movimiento, salida=0, otro=1, borrar=1;
		
		ArrayList<String> Lista = new ArrayList<String>();

		String[] opciones = {"Si","No"};
		String[] options={"Agregar Nombre","Eliminar nombre por posicion","Eliminar nombre","Vaciar Lista","Imprimir Lista","Salir"};
		do{
			movimiento = JOptionPane.showOptionDialog(null, "Menu de opciones", "Opciones", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[5]);
			switch(movimiento){
				case 0:{
					entrada = JOptionPane.showInputDialog("Ingrese el nombre: ");
					Lista.add(entrada);
					JOptionPane.showMessageDialog(null, "Nombre ingresado\n"+ Lista.toString());
					break;
				}
				case 1:{
					entrada = JOptionPane.showInputDialog("Ingrese posicion a borrar: \n"+Lista.toString());
					valor = Integer.parseInt(entrada);

					if (valor > Lista.size()) {
						JOptionPane.showMessageDialog(null, "No se tiene registro en esa posicion intenta de nuevo");
					}else{
						borrar = JOptionPane.showOptionDialog(null, 
						"Esta seguro de querer borrar este nombre ?",
						"Eliminar nombre por posicion",
						JOptionPane.YES_NO_CANCEL_OPTION,
						JOptionPane.QUESTION_MESSAGE,
						null,
						opciones,
						opciones[1]);

						if (borrar == 0) {
							Lista.remove(valor-1);
							JOptionPane.showMessageDialog(null, "Posicion borrada\n"+ Lista.toString());
						}
					}
					break;
				}
				case 2:{
					entrada = JOptionPane.showInputDialog("Ingrese nombre a borrar: \n"+Lista.toString());

					if (!Lista.contains(entrada)) {
						JOptionPane.showMessageDialog(null, "No se encuentra este nombre intenta de nuevo");
					}else{
						borrar = JOptionPane.showOptionDialog(null, 
						"Esta seguro de querer borrar este nombre ?",
						"Eliminar por nombre",
						JOptionPane.YES_NO_CANCEL_OPTION,
						JOptionPane.QUESTION_MESSAGE,
						null,
						opciones,
						opciones[1]);

						if (borrar == 0) {
							Lista.remove(entrada);
							JOptionPane.showMessageDialog(null, "Nombre borrado\n"+ Lista.toString());
						}
					}
					break;
				}
				case 3:{
					if (Lista.size() == 0) {
						JOptionPane.showMessageDialog(null, "No se encuentran valores en la lista aun");
					}else{
						borrar = JOptionPane.showOptionDialog(null, 
						"Esta seguro de borrar toda la Lista?",
						"Eliminar lista",
						JOptionPane.YES_NO_CANCEL_OPTION,
						JOptionPane.QUESTION_MESSAGE,
						null,
						opciones,
						opciones[1]);

						if (borrar == 0) {
							Lista.clear();
							JOptionPane.showMessageDialog(null, "Lista borrada\n"+ Lista.toString());
						}	
					}
					break;
				}
				case 4:{
					JOptionPane.showMessageDialog(null, Lista.toString());
					break;
				}
				case 5:{
					otro = JOptionPane.showOptionDialog(null, 
					"Seguro que quieres salir?",
					"Salida",
					JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.QUESTION_MESSAGE,
					null,
					opciones,
					opciones[1]);
					break;
				}
				default:{
					JOptionPane.showMessageDialog(null, "Lo sentimos esta opcion no existe");
					break;
				}
			}
		}while(otro==1);
	}
}