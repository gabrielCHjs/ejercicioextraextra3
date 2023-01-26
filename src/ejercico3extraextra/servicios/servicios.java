/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercico3extraextra.servicios;

import ejercico3extraextra.entidades.classPass;
import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class servicios {
  
        Scanner leer = new Scanner (System.in);
             
  // public classPass crearPersona () {
     
       
       
  // }       
    
    
    
   public String crearPass (){
       System.out.println("ingresar contraseña");
      String pass ;
       pass = leer.next();
       if (pass.length()!=10) {
           
      do {
          System.out.println("reingrese la contraseña");
          pass = leer.next();
         
       } while (pass.length()!=10);
       }
         System.out.println( "ingreso correcto: "+ pass );
       return pass;
     
   }
   
   public void analizarPass( String pass){
         
        int a = 0;
        int z = 0;
        int c = 0;
        
       
      for (int i = 0; i < 10; i++) {
           
            switch (pass.substring(i,i+1) ) {
             
             case "a":
                 a++;
                  
                  break;
                  case "z":
                 z++;
             
                 break;
         
                         
          }
         
           
       }
           
       if (z>0 && a>=2) { System.out.println("su nivel es alto");
           
       } else if  (z>0 ){ {System.out.println("su nivel medio ");}
       
       }else { System.out.println("su nivel es bajo"); }
   }
   //public void modificarDatos (classPass p1 ){
   public void modificarDatos (classPass p1, int op){
        System.out.println("cambio de datos");
       System.out.println("ingresa contraseña");
       String j = leer.next();
       
       if (j.equalsIgnoreCase(p1.getPass())) {
           switch(op) {
               case 1:
                   System.out.println("modificar nombre");
                   p1.setNombre(leer.next());
                   break;
               case 2:
                   System.out.println("modificar DNI");
                   p1.setDni(leer.next());
                   break;
           }
           
           
             
       } else {System.out.println("contraseña incorrecta");}
       
   }

   public void mostrarPass(classPass p1){
       System.out.println("Datos Pass ");
       System.out.println("Nombre: "+ p1.getNombre());
       System.out.println("DNI: " + p1.getDni());
       System.out.println("Contraseña: " + p1.getPass());
       
   }

  
   
   
}
