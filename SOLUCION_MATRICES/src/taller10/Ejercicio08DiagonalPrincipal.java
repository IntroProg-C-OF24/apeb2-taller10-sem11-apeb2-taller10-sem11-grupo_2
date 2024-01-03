<<<<<<< HEAD
/*
Dada una matriz cuadrada y con número aleatorios únicos enteros positivos o negativos 
(-9-0, 0-9) generados automáticamente, presente los elementos de la diagonal principal, 
los ubicados sobre la diagonal principal, y bajo dicha principal.
 */
package taller10;

/**

 */
public class Ejercicio08DiagonalPrincipal {

    public static void main(String[] args) {
        int limitMt = 3;
        int mt[][] = new int[limitMt][limitMt];

        //Generar la matriz:
        for (int i = 0; i < mt.length; i++) {
            for (int j = 0; j < mt.length; j++) {
                mt[i][j] = (int) (Math.random() * (10 - (-9) + 1) + (-9));
                System.out.print(mt[i][j] + "\t");

            }
            System.out.println("");
        }
        System.out.println("Diagonal principal: ");
        for (int i = 0; i < mt.length; i++) {
            System.out.print(mt[i][i] + "\t");
        }

        System.out.println("");
        System.out.println("Sobre la diagonal principal: ");

        for (int i = 0; i < mt.length; i++) {
            for (int j = i+1; j < mt.length; j++) {
                System.out.print(mt[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("Debajo de la diagonal principal: ");

        for (int i = 1; i < mt.length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(mt[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}

/*
Ejemplo con una matriz de 3 x 3:
------------------------------------
-6	6	-5	
-8	0	-6	
7	7	2	
------------------------------------
Diagonal principal: 
-6	0	2	
------------------------------------
Sobre la diagonal principal: 
6	-5	
-6	
------------------------------------
Debajo de la diagonal principal: 
-8	
7	7	
------------------------------------
*/
=======
/*
Dada una matriz cuadrada y con número aleatorios únicos enteros positivos o negativos 
(-9-0, 0-9) generados automáticamente, presente los elementos de la diagonal principal, 
los ubicados sobre la diagonal principal, y bajo dicha principal.
 */
package taller10;

/**

 */
public class Ejercicio08DiagonalPrincipal {

    public static void main(String[] args) {
        int limitMt = 3;
        int mt[][] = new int[limitMt][limitMt];

        //Generar la matriz:
        for (int i = 0; i < mt.length; i++) {
            for (int j = 0; j < mt.length; j++) {
                mt[i][j] = (int) (Math.random() * (10 - (-9) + 1) + (-9));
                System.out.print(mt[i][j] + "\t");

            }
            System.out.println("");
        }
        System.out.println("Diagonal principal: ");
        for (int i = 0; i < mt.length; i++) {
            System.out.print(mt[i][i] + "\t");
        }

        System.out.println("");
        System.out.println("Sobre la diagonal principal: ");

        for (int i = 0; i < mt.length; i++) {
            for (int j = i+1; j < mt.length; j++) {
                System.out.print(mt[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("Debajo de la diagonal principal: ");

        for (int i = 1; i < mt.length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(mt[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}

/*
Ejemplo con una matriz de 3 x 3:
------------------------------------
-6	6	-5	
-8	0	-6	
7	7	2	
------------------------------------
Diagonal principal: 
-6	0	2	
------------------------------------
Sobre la diagonal principal: 
6	-5	
-6	
------------------------------------
Debajo de la diagonal principal: 
-8	
7	7	
------------------------------------
*/
>>>>>>> 4964a0a2a2951781b273d0f94146d47c05d89150
