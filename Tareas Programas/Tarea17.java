/*Nombre: Miguel A. Covarrubias Reynoso
Matricula: 1719246
Hora: v3 LMV
Nombre Programa: Tarea17*/

import java.util.Scanner;
public class Tarea17
{   
	public static Scanner lee = new Scanner(System.in);
	public static int[] L = new int[]{100, 150, 200, 400, 600, 800} ;
	public static String[] cl = new String[] {"F", "E", "D", "C", "B", "A"};
	public static int op, con, compra, total=0, cuan, otra, entradas=0;
	public static void menu()
     {
	       System.out.println("===================== M E N U ==================");
		   System.out.println("          1.- Zona F con precio de $"+L[0]);
		   System.out.println("          2.- Zona E con precio de $"+L[1]);
		   System.out.println("          3.- Zona D con precio de $"+L[2]);
		   System.out.println("          4.- Zona C con precio de $"+L[3]);
		   System.out.println("          5.- Zona B con precio de $"+L[4]);
		   System.out.println("          6.- Zona A con precio de $"+L[5]);
		   System.out.println("          7.- Informacion");
		   System.out.println("          8.- Salir");
		   System.out.println("          Elija una zona");
		   op = lee.nextInt();
		   op--;
     }
    public static void info()
    {
    	System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		          	System.out.println("          1.-Informacion sobre el total de ventas ");
		          	System.out.println("          2.-Informacion sobre el total de entradas vendidas");
		          	System.out.println("          Elija que tipo de Informacion necesita");
		          	otra = lee.nextInt();	
    }
	public static void main(String[] args)
	{
		 menu();
		 opciones();
	}
    public static void opciones()
    {   switch(op)
        {
        	case 0: 
		          { System.out.println("          Usted eligio la zona "+cl[op]+" con precio de $"+L[op]+" \u00bfEs correcto?");
                    System.out.println("          1.-S\u00ed       2.- No");
                    con = lee.nextInt();
                    if (con ==1)
                    {
                      System.out.println("     \u00bfCuantas entradas quiere?");
                      cuan  = lee.nextInt();
                      compra = cuan * L[op];
                      System.out.println("     Felicidades su compra fue exitosa por el monto de $"+compra);
                      total = total + compra;
                      entradas = entradas +cuan;
                      menu();opciones(); 
                    }
                    else menu();opciones(); 
                   }break;
            case 1: 
		          { System.out.println("          Usted eligio la zona "+cl[op]+" con precio de $"+L[op]+" \u00bfEs correcto?");
                    System.out.println("          1.-S\u00ed       2.- No");
                    con = lee.nextInt();
                    if (con ==1)
                    {
                      System.out.println("     \u00bfCuantas entradas quiere?");
                      cuan  = lee.nextInt();
                      compra = cuan * L[op];
                      System.out.println("     Felicidades su compra fue exitosa por el monto de $"+compra);
                       total = total + compra;
                        entradas = entradas +cuan;
                      menu();opciones(); 
                    }
                    else menu();opciones(); 
                   }break;
            case 2: 
		          { System.out.println("          Usted eligio la zona "+cl[op]+" con precio de $"+L[op]+" \u00bfEs correcto?");
                    System.out.println("          1.-S\u00ed       2.- No");
                    con = lee.nextInt();
                    if (con ==1)
                    {
                      System.out.println("     \u00bfCuantas entradas quiere?");
                      cuan  = lee.nextInt();
                      compra = cuan * L[op];
                      System.out.println("     Felicidades su compra fue exitosa por el monto de $"+compra);
                       total = total + compra;
                       entradas = entradas +cuan;
                      menu();opciones(); 
                    }
                    else menu();opciones(); 
                   }break;
            case 3: 
		          { System.out.println("          Usted eligio la zona "+cl[op]+" con precio de $"+L[op]+" \u00bfEs correcto?");
                    System.out.println("          1.-S\u00ed       2.- No");
                    con = lee.nextInt();
                    if (con ==1)
                    {
                      System.out.println("     \u00bfCuantas entradas quiere?");
                      cuan  = lee.nextInt();
                      compra = cuan * L[op];
                      System.out.println("     Felicidades su compra fue exitosa por el monto de $"+compra);
                       total = total + compra;
                       entradas = entradas +cuan;
                      menu();opciones(); 
                    }
                    else menu();opciones(); 
                   }break;
            case 4: 
		          { System.out.println("          Usted eligio la zona "+cl[op]+" con precio de $"+L[op]+" \u00bfEs correcto?");
                    System.out.println("          1.-S\u00ed       2.- No");
                    con = lee.nextInt();
                    if (con ==1)
                    {
                      System.out.println("     \u00bfCuantas entradas quiere?");
                      cuan  = lee.nextInt();
                      compra = cuan * L[op];
                      System.out.println("     Felicidades su compra fue exitosa por el monto de $"+compra);
                       total = total + compra;
                       entradas = entradas +cuan;
                      menu();opciones(); 
                    }
                    else menu();opciones(); 
                   }break;
            case 5: 
		          { System.out.println("          Usted eligio la zona "+cl[op]+" con precio de $"+L[op]+" \u00bfEs correcto?");
                    System.out.println("          1.-S\u00ed       2.- No");
                    con = lee.nextInt();
                    if (con ==1)
                    {
                      System.out.println("     \u00bfCuantas entradas quiere?");
                      cuan  = lee.nextInt();
                      compra = cuan * L[op];
                      System.out.println("       Felicidades su compra fue exitosa por el monto de $"+compra);
                       total = total + compra;
                       entradas = entradas +cuan;
                      menu();opciones(); 
                    }
                    else menu();opciones(); 
                   }break;
            case 6: 
		          { 
		          	info();
		        	if (otra ==1)
		          	{
		          		System.out.println("      El total de las ventas es $"+total);
		          		menu();opciones();
		          	}	
		          	else
		          	{
                        System.out.println("      El total de entradas vendidas es de "+entradas);
                        menu();opciones();
		          	}		       
		          		if(otra >2)
		          	{
		          		System.out.println("      Esa opcion no existe");
		          		info();
		          	}
                   }break;
             case 7:
                   {
                    break;
                   }
            default:
                  {
                  	System.out.println("        Esa opcion no existe >:C ");
                  	menu();opciones(); 
                  }
        }
	}
}