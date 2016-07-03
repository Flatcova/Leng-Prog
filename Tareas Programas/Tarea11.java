/*Nombre: Miguel A. Covarrubias Reynoso
Matricula: 1719246
Hora: v3 LMV
Nombre Programa: Tarea11*/
import javax.swing.JOptionPane;
public class Tarea11{
	public static void main (String[]args){
		String entrada, letrero="";
		int i,n,j,k,x=1,y=2,z=2;

		entrada=JOptionPane.showInputDialog("Ingrese el total de numeros: ");
		n = Integer.parseInt(entrada);

		for(i=2;i<=n+1;i++){
			if(i%2==0){
				if(i==2){
					letrero = letrero + i+", ";
				}
				else{
					for(k=1;k<=y;k++){
						z = z + 2;
						letrero = letrero + z + ", ";
					}
					y = y + 1;
				}
			}
			else{
				for(j=1;j<=3;j++){
					x= x + 2;
					letrero = letrero + "-"+ x + ", ";
				}
			}
		}
		
		JOptionPane.showMessageDialog(null, "Serie: " + letrero);
	}
} 