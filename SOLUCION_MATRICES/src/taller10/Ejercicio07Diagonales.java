package taller10;

public class Ejercicio07Diagonales {
//Dada una matriz cuadrada y con número aleatorios únicos enteros positivos o negativos (-9-0, 0-9) 
    //generados automáticamente, presente los elementos de la diagonal secundaria, 
    //los ubicados sobre la diagonal secundaria, y bajo dicha diagonal.

    public static void main(String[] args) {
        int limitMt = 3;
        int mt[][] = new int[limitMt][limitMt];

        for (int i = 0; i < mt.length; i++) {
            for (int j = 0; j < mt.length; j++) {
                mt[i][j] = (int) (Math.random() * (10 - (-9) + 1) + (-9));
                System.out.print(mt[i][j] + "\t");

            }
            System.out.println("");
        }
        //Imprimir diagonal secundaria:

        System.out.println("Diagonal secundaria: ");
        for (int i = 0; i < mt.length; i++) {
            System.out.print(mt[i][mt.length - i - 1] + "\t");
        }

        System.out.println("");
        System.out.println("Sobre la diagonal secundaria: ");

        for (int i = 0; i < mt.length; i++) {
            for (int j = 0; j < mt.length - 1 - i; j++) {
                System.out.print(mt[i][j] + "\t");
            }
            System.out.println("");
        }

        System.out.println("Bajo la diagonal secundaria: ");

        for (int i = 1; i < mt.length; i++) {
            for (int j = mt.length - i; j < mt.length; j++) {
                System.out.print(mt[i][j] + "\t");
            }
            System.out.println("");
        }

    }

    /* 
EJEMPLO CON UNA MATRIZ DE 3 x 3.:
    
-5	-1	6	
7	0	-3	
3	-2	-5	
    
Diagonal secundaria: 
6	0	3	
    
Sobre la diagonal secundaria: 
-5	-1	
7	
    
Bajo la diagonal secundaria: 
-3	
-2	-5	
    
     */
}
