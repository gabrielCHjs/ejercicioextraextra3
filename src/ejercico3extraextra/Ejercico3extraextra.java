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
 
       servicios cpass = new servicios();
        classPass nombre = new classPass();
      
        boolean salir = false;
        
        do {
   
            System.out.println("a. ingresar contraseña valida \n"
                    + "b.su nivel de \n"
                    + "c.modificar contraseña \n"
                    + "d.modificar DNI \n"
                    + "e.salir");

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
                case "e": salir= true;
                    break;
                default:
                    throw new AssertionError();
            }
        } while (!salir  );
    }
        

    public Ejercico3extraextra() {
    }
    
}
