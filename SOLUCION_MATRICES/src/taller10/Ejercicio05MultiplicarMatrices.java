
package taller10;
import java.util.Scanner;
import java.util.Random;
/**
 Desarrolla una solución que permita multiplicar dos matrices bidimensionales. El usuario debe ingresar las dimensiones y los elementos de ambas matrices. Realiza la multiplicación y muestra el resultado al final. Nota: Las matrices se deben llenar con número aleatorios únicos enteros positivos o negativos (-9-0, 0-9).
 */
public class Ejercicio05MultiplicarMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Random r = new Random ();
        System.out.println("Ingrese el tama;o de filas de la matriz");
        int t1 = sc.nextInt();
        System.out.println("Ingrese el tama;o de columnas de la matriz");
        int t2 = sc.nextInt();
        float mat[][] = new float[t1][t2];
        float mat2[][] = new float[t1][t2];
        float mat3[][] = new float[t1][t2];
        // Generar matrices (limite desde el 1 hasta el 20
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
            mat[i][j] = r.nextFloat(2,21);        
            }
        }
         for (int i = 0; i < mat2.length; i++) {
            for (int j = 0; j < mat2.length; j++) {
            mat2[i][j] = r.nextFloat(2,21);        
            }
        }
         // Multiplicar matrices
         for (int i = 0; i < mat3.length; i++) {
            for (int j = 0; j < mat3.length; j++) {
            mat3[i][j] = mat[i][j]*mat2[i][j];        
            }
        }
         // Presentar datos
         System.out.println("---------- MATRIZ 1----------");
         for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.printf("%.2f\t\t",mat[i][j]);
            }
             System.out.println("");
        }
         System.out.println("---------- MATRIZ 2----------");
         for (int i = 0; i < mat2.length; i++) {
            for (int j = 0; j < mat2.length; j++) {
                System.out.printf("%.2f\t\t",mat2[i][j]);
            }
            System.out.println("");
        }
         System.out.println("---------- RESULTADO DE MULTIPLICACION ----------");
         for (int i = 0; i < mat3.length; i++) {
            for (int j = 0; j < mat3.length; j++) {
                System.out.printf("%.2f\t\t",mat3[i][j]);
            }
            System.out.println("");
        }
    }
}
