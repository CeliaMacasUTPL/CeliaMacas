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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Creo una variable para pedir por consola los datos
        Scanner datos = new Scanner(System.in);
            //creacion de variables
             double costo;
             double axmc;
             double longitud;
             double ancho;
             
          
            //asignacion de variables
            System.out.println(" ingrese precio de metro cuadrado ");
              axmc=datos.nextDouble();
            System.out.println(" ingrese la longitud del terreno ");
              longitud=datos.nextDouble();
            System.out.println(" ingrese el ancho del terreno ");
              ancho=datos.nextDouble();
     
             // realizo la operacion
               costo = (axmc* (longitud* ancho)); 
              
              // presentar en pantalla
              System.out.println(" el costo del terreno es :"+costo);
    }
    
}
