
package Actividad_1;

import java.util.Scanner;
import Actividad_1.Persona;


public class Codo_a_Codo {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            Persona p;
            
            System.out.println("Ingrese sus datos.");
            
            System.out.print("Nombre: ");
            String nom = in.nextLine();
            
            System.out.print("Apellido: ");
            String ape = in.nextLine();
            
            System.out.print("Edad: ");
            int edad = in.nextInt();
            in.nextLine();
            
            System.out.print("Hobbie: ");
            String hobbie = in.nextLine();
            
            System.out.print("Editor de Codigo: ");
            String editor = in.nextLine();
            
            System.out.print("Sistema Operativo: ");
            String so = in.nextLine(); 
            
            System.out.println("\n\n\n\n");
            
            
            p = new Persona(nom, ape, hobbie, editor, so, edad);
            
            System.out.println("Bienvenido al Sistema");
            System.out.println("");
            System.out.println("\u001B[42m"+"\u001B[37m"+"Los datos ingresados son:  "+"\u001B[0m");
            System.out.println(p.toString()+"\u001B[0m");
        }
    }
    
}
