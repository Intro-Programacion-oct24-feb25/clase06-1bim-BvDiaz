/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class ComercioTres {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); // 10,2 / 10.2
        
        String nombre;
        String apellido;
        int edad;
        double sueldoBasico;
        int numeroProductos;
        
        double productividad;
        double coeficiente = 0.6;
        double bono  = 0;
        
        double porcentajeSeguro = 8;
        double adicionalSeguro;
        
        double sueldoFinal; 
        
        System.out.println("Ingrese el nombre por favor");
        nombre = entrada.nextLine();
        
        System.out.println("Ingrese el apellido por favor");
        apellido = entrada.nextLine();
        
        System.out.println("Ingrese la edad por favor");
        edad = entrada.nextInt();

        System.out.println("Ingrese el sueldo básico por favor");
        sueldoBasico = entrada.nextDouble();     
        
        System.out.println("Ingrese el porcentaje de descuento por favor");
        sueldoBasico = entrada.nextDouble();  
        
        System.out.println("Ingrese el número de productos vendidos "
                + "por favor");
        numeroProductos = entrada.nextInt();
        
        
        //if (porcentajeSeguro >= 1 && porcentajeSeguro <= 15) {
        //    porcentajeSeguro = porcentajeSeguro + 0;
        //} else {
        //    porcentajeSeguro = 10; //Este condicional si funcionara para el decuento ya que estamos 
                                    //asignando el rango especifico que nos demanada la problematica.
        //}
      
        //if (porcentajeSeguro > 15) {
        //    porcentajeSeguro = 10;
        //}                           //Este no cumple lo solicitado ya q estamos diciendo si descuento es mayor
                                    //que 15 entonces sera 10 de descuento pero si escribimos un porcentaje negativo se usara el negativo.

        if (porcentajeSeguro < 1 || porcentajeSeguro > 15) {
            porcentajeSeguro = 10;
        }                              //Este si cumple ya que es lo mismo que el primero pero con un or y ahi deberia cambiar la condicion como se muestra
                                       //esta correcto.

        //if (porcentajeSeguro < 1 && porcentajeSeguro > 15) {
        //    porcentajeSeguro = 10;
        //}                            //Esta no cumple ya que si asignamos 15 o 1 dara por igual al 10 descuento cuando deberia dar el 15 0 1
                                       //dependiendo de cual colocamos.
        
        // calcular la productividad
        productividad = numeroProductos * coeficiente;
        
        if (productividad<=30){
            bono = 25; // $25
        }else{
            if (productividad>=31 && productividad<80){
                bono = 50;
            }else{
                if (productividad>=80 && productividad < 200) {
                    bono = 100;
                }else{
                    if(productividad >= 200){
                        bono = 200;
                    }
                }
            }
        }
        
       
        adicionalSeguro = (sueldoBasico * 8)/100;
        sueldoFinal = adicionalSeguro + bono + sueldoBasico;
        
        System.out.printf("Reporte de Empleado EL GRAN COMERCIO\n\n"
                + "Nombres: %s\n"
                + "Apellidos: %s\n"
                + "Edad: %d\n"
                + "Sueldo: $%.2f\n"
                + "Número de productos vendidos: %d\n"
                + "\tProductidad: %.2f\n"
                + "\tBono: $%.2f\n"
                + "Adicional del seguro: $%.2f\n\n"
                + "Sueldo final: $%.2f\n", 
                nombre, 
                apellido,
                edad,
                sueldoBasico,
                numeroProductos,
                productividad,
                bono,
                adicionalSeguro,
                sueldoFinal);
        
        
    }
    
}
