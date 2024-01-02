
package taller10;

import java.util.Scanner;

/**
Desarrolla una solución en pseudocódigo que permita mediante un menú (al estilo calculadora matemática), facilitar las operaciones de suma, resta de dos matrices.
Considerar la validación de las reglas para realizar estas operaciones.
Nota: Las matrices se deben llenar con número aleatorios únicos enteros positivos o negativos (-9-0, 0-9).
 * 
 */
public class Ejercicio06CalculadoraMatrices {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limitMt = 3;
        int mt1[][] = new int[limitMt][limitMt];
        int mt2[][] = new int[limitMt][limitMt];
        int matrizResultado[][] = new int[limitMt][limitMt];

        //Generar la matriz 1:
        System.out.println("------ MATRIZ 1: ---------- ");
        for (int i = 0; i < mt1.length; i++) {
            for (int j = 0; j < mt1.length; j++) {
                mt1[i][j] = (int) (Math.random() * (10 - (-9) + 1) + (-9));
                System.out.print(mt1[i][j] + "\t");

            }
            System.out.println("");
        }

        System.out.println("------ MATRIZ 2: ---------- ");
        for (int i = 0; i < mt2.length; i++) {
            for (int j = 0; j < mt2.length; j++) {
                mt2[i][j] = (int) (Math.random() * (10 - (-9) + 1) + (-9));
                System.out.print(mt2[i][j] + "\t");

            }
            System.out.println("");
        }
        System.out.println("--------------");
        System.out.println("Escribe la opcion para seleccionar");
        System.out.println("1.- Sumar matrices");
        System.out.println("2.- Restar matrices");
        int opcion = sc.nextInt();

        if (opcion == 1) {
            System.out.println("---SUMA DE MATRICES---");
            for (int i = 0; i < matrizResultado.length; i++) {
                for (int j = 0; j < matrizResultado.length; j++) {
                    matrizResultado[i][j] = mt1[i][j] + mt2[i][j];
                    System.out.print(matrizResultado[i][j] + "\t");
                }
                System.out.println("");
            }
        } else if (opcion == 2) {
            
            System.out.println("---RESTA DE MATRICES---");
            for (int i = 0; i < matrizResultado.length; i++) {
                for (int j = 0; j < matrizResultado.length; j++) {
                    matrizResultado[i][j] = mt1[i][j] - mt2[i][j];
                    System.out.print(matrizResultado[i][j] + "\t");
                }
                System.out.println("");
            }

        }else{
            System.out.println("Opción no existe :D");
        }

    }
}
