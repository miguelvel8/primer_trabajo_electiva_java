/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

/**
 *
 * @author Miguel
 */
public class Random {
    
    
    public static int Azar()
       { 
          java.util.Random generadorAleatorios = new java.util.Random();
           int azar=0,aux;
          aux=generadorAleatorios.nextInt((4));
          if(aux==0 || aux==1 || aux==3)
          {
              azar=aux;
              
          }
          else
          {
              Azar();
          }
          return azar;
       }
}
