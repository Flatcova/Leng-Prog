/*Nombre: Miguel A. Covarrubias Reynoso
Matricula: 1719246
Hora: v3 LMV
Nombre Programa: Tarea21*/

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Tarea21{
	public static void main(String[] args) {
		String letrero=" ";
		int fib1=1, fib2=1;
		
		ArrayList<Integer> Fibonacci = new ArrayList<Integer>();

		Fibonacci.add(fib1);
		for (int i=1;i<100;i++) {
			Fibonacci.add(fib2);
			fib2 = fib1+fib2;
			fib1 = fib2-fib1;
		}
		JOptionPane.showMessageDialog(null, Fibonacci.toString());
	}
}