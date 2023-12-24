/*
Con el objetivo de manipular correctamente los ciclos repetitivos anidados, se solicita,
dado la altura de la salida, generar por pantalla las siguientes figuras. 
Nota: Ud. puede elegir libremente el caracter a mostrar en la figura.
 */
package taller10;

import java.util.Scanner;

/**
 *
 * @author Carlos Sánchez
 */
public class Ejercicio09Piramide {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la longitud de la piramide");
        int longitud = sc.nextInt();

        for (int i = 0; i < longitud; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    /*
    Ejemplo con pirámide de 3 niveles
Ingrese la longitud de la piramide
3
    
    
* 
* * 
* * * 
    
    
     */
}
