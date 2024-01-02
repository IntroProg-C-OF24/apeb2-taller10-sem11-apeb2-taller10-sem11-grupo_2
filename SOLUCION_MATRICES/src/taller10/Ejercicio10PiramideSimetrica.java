
package taller10;

import java.util.Scanner;
public class Ejercicio10PiramideSimetrica {
        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la altura de la piramide");
        int altura = sc.nextInt();
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= altura - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = altura - 1; i >= 1; i--) {
            for (int j = 1; j <= altura - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }    
    }
}
