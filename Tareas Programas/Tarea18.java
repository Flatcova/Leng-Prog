/*Nombre: Miguel A. Covarrubias Reynoso
Matricula: 1719246
Hora: v3 LMV
Nombre Programa: Tarea18*/

import javax.swing.JOptionPane;

public class Tarea18{
	public static void main (String[] args){
		String entrada, buscador=" ";
		int i,n,cont=0,b;
		int[]A;

		entrada=JOptionPane.showInputDialog("ingrese el total de numeros");
		n=Integer.parseInt(entrada);
		A=new int[n];
		for(i=0;i<n;i++){
			entrada=JOptionPane.showInputDialog("A["+(i+1)+"]=");
			A[i]=Integer.parseInt(entrada);
		}
		
		entrada=JOptionPane.showInputDialog("Ingrese numero a buscar");
		b=Integer.parseInt(entrada);
		for(i=0; i<n; i++){
			if(b == A[i]){
				cont ++;
			}
		}
		JOptionPane.showMessageDialog(null, "Se encontro el "+b+", y esta "+cont+" veces");
		
		String impresion="A=[";
		for(i=0;i<n;i++){
			impresion=impresion+A[i]+" ";
		}
		JOptionPane.showMessageDialog(null, impresion+"]");
	}
}	
