/*
*   Ingrese una cadena de texto y verifique que pertenece a un  de un día de la 
*   semana.
 */
package paquete01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        System.out.println("Ingrese el nombre del día de la semana");
        String cadena = entrada.nextLine();
        
        switch(cadena){
            case "Lunes":
                System.out.printf("%s", cadena.toUpperCase());
                break;
            
            case "Martes":
            case "martes":
                System.out.printf("%s", cadena.toUpperCase());
                break;
            
                case "Miercoles":
                System.out.printf("%s", cadena.toUpperCase());
                break; 
                
                 case "Jueves":
                System.out.printf("%s", cadena.toUpperCase());
                break;
                
            case "Viernes":
            case "VIERNES":
            case "viernes":
                System.out.printf("%s", cadena.toUpperCase());
                break;
                
                 case "Sabado":
                System.out.printf("%s", cadena.toUpperCase());
                break;
            
            case "Domingo":
                System.out.printf("%s, es el séptimo día "
                        + "de la semana", cadena);
                break;
                
            default:
                System.out.println("ninguna de las anteriores");
                break;
        }
        
    }
}
