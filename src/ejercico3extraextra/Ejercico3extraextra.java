/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercico3extraextra;

import ejercico3extraextra.entidades.classPass;
import ejercico3extraextra.servicios.servicios;
import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Ejercico3extraextra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        
          
        
       
        
      /* A través de un menú de opciones:
o A) ingresar la contraseña, recordar que antes de guardarla debe ser ingresada una
contraseña valida).
o B) Mensaje al usuario que tipo de NIVEL es su contraseña
o C) Modificar contraseña, donde primero debe poner su contraseña anterior para
dar permiso
o C) Modificar nombre, donde primero debe poner su contraseña para dar permiso,
SINO impedir cambios
o D) Modificar DNI, donde primero debe poner su contraseña para dar permiso,
SINO impedir cambios*/

       servicios cpass = new servicios();
        classPass nombre = new classPass();
        
        do {
            
        
        
        System.out.println("a. ingresar contraseña valida \n"
                + "b.su nivel de \n"
                + "c.modificar contraseña \n"
                + "d.modificar DNI");
        
        String opc = leer.next();
        
         
        switch (opc) {
               
            case "a":
             
                nombre = cpass.crearPass();
            
            break;
            case "b":
               
                cpass.analizarPass(nombre.getPass()); 
           break;
            case "c":
              
                 cpass.modificarDatos(nombre);
                 break;
            case "d":
                break;
            default:
                throw new AssertionError();
                
        }
        } while (true);
    }
        

    public Ejercico3extraextra() {
    }
    
}
