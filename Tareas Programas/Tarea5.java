/*Nombre: Miguel A. Covarrubias Reynoso
Matricula: 1719246
Hora: v3 LMV
Nombre Programa: Tarea5*/

import javax.swing.JOptionPane;  
  
public class Tarea5{  
  
 public static void main(String args[]){  
   
  String valor=JOptionPane.showInputDialog("Elija el numero de la figura\n1.-Cuadrado\n2.-Rectangulo\n3.-Triangulo\n4.-Circulo");  
  int opcion=Integer.parseInt(valor);  
    
    switch(opcion){  
      
  	case 1:{  
      valor=JOptionPane.showInputDialog("Lado");  
      double lado=Double.parseDouble(valor);  
      double area=lado*lado;  
      JOptionPane.showMessageDialog(null, "El area es: "+area);  
      break;
     } 
  	
  	case 2:{  
      valor=JOptionPane.showInputDialog("Base");  
      double base=Double.parseDouble(valor);  
      valor=JOptionPane.showInputDialog("Altura");  
      double altura=Double.parseDouble(valor);  
      double area=base*altura;  
      JOptionPane.showMessageDialog(null,"El area es: "+area);  
      break;
     } 
       
     case 3:{  
      valor=JOptionPane.showInputDialog("Base");  
      double base=Double.parseDouble(valor);  
      valor=JOptionPane.showInputDialog("Altura");  
      double altura=Double.parseDouble(valor);  
      double area=(base*altura)/2;  
      JOptionPane.showMessageDialog(null,"El area es: "+area);  
      break;
     } 
     
     case 4:{  
      valor=JOptionPane.showInputDialog("Radio");  
      double radio=Double.parseDouble(valor);  
      double area=3.1416*(radio*radio);  
      JOptionPane.showMessageDialog(null,"El area es: "+area);  
      break;
     }  

     default: { 
      JOptionPane.showMessageDialog(null,"Opcion no valida");
      }
    }  
  }
}