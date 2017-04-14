/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Creo una variable para pedir por consola los datos
            Scanner datos = new Scanner(System.in);
            //creacion de variables
             int hora;
             int min;
             int seg;
             int dias;
             int total;
          
            //asignacion de variables
            System.out.println(" ingrese la hora ");
              hora=datos.nextInt();
            
     
             // realizo la operacion
             dias = hora *24;
              min= hora * 60;
              seg= hora *3600;
            
        
              // presentar en pantalla
              System.out.println(" la cantidad de horas es  :"+dias+ "-" +min+"-" +seg);
    }
    
}
