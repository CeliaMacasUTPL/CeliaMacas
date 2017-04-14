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
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // creo una variable para pedir por consola los datos
            Scanner calIva = new Scanner(System.in);
            //creacion de variables
             double cantprod1,cantprod2,cantprod3,resp1,resp2,resp3,subtotal,iva,total;
             int pro1,pro2,pro3;

             
   
            //asignacion de variables
            
             cantprod1=5.5;
             cantprod2=17;
             cantprod3=2.78;
 
            //solicitud de ingreso de variables 
             System.out.println(" Ingrese la cantidad del producto1");
             pro1=calIva.nextInt();
             System.out.println(" Ingrese la cantidad del producto2");
             pro2=calIva.nextInt();
             System.out.println(" Ingrese la cantidad del producto3");
             pro3=calIva.nextInt();

             //operaciones
             resp1= pro1*cantprod1;
             resp2= pro2*cantprod2;
             resp3= pro3*cantprod3;
             subtotal = resp1+resp2+resp3;
             iva= subtotal* 0.14;
             total =subtotal+iva;            
     
          
        
              // presentar en pantalla
              System.out.println(" el valor total es  :"+total);
            
    }
    
}
