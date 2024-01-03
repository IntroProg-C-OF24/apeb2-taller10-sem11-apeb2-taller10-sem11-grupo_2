<<<<<<< HEAD
package taller10;

/**
 *
 * El primer ciclo paralelo C, cuenta con 28 estudiantes, de los cuáles al finalizar el periodo, la Dirección de la carrera de Computación a solicitado las siguientes estadísticas de la materia INTRODUCCIÓN A LA PROGRAMACIÓN en función a los promedios por estudiante, dichos promedios se deben calcular (ponderar) de 3 calificaciones (ACD que representa el 35% de la nota, APE del 35% y la nota del AA con un peso del 30%). En resumen, los requerimientos son los siguientes:

Registre los nombres de cada estudiante de dicho paralelo.
Genere aleatoriamente las notas ACD, APE, AA, para cada uno de los 28 estudiantes de 0-10 pts.
Calcule el promedio de cada uno de los estudiantes del paralelo dada la siguiente ponderación: ACD->35%, APE->35%, y el AA->30%.
Obtenga el promedio del curso, del paralelo C.
Liste los nombres de los estudiantes y su nota, que hayan obtenido un promedio por encima del promedio del curso.
Liste los nombres de los estudiantes y su nota, que hayan obtenido un promedio por debajo del promedio del curso.
Muestre el estudiante con su calificación, si es el del mayor promedio (el más alto de la clase).
Muestre el estudiante con su calificación, si es el del menor promedio (el más bajo de la clase). 
 */
import java.util.Random;
public class Ejercicio01Promedios {

   public static void main(String[] args) {
        String []nameAba = {"Nombre1", "Nombre2", "Nombre3", "Nombre4", "Marco","Adrian"};
        int limEst= nameAba.length;
        int limNotas = 3;
        Random r = new Random();
        double matrizNotas [][] = new double [limEst][limNotas];
        double arrPromedios [] = new double[limEst];
        double estGood[] = new double[limEst];
        double estBad[] = new double[limEst];
        double sumaTotal =0, promedioTotal=0;
        
        for (int i = 0; i < limEst; i++) {
            for (int j = 0; j < limNotas; j++) {
                matrizNotas[i][j]=  r.nextDouble(9,10);   
            }
        }
        for (int i = 0; i < limEst; i++) {
            arrPromedios[i] = (matrizNotas[i][0]*0.35)+(matrizNotas[i][1]*0.35)+(matrizNotas[i][2]*0.3);
            
        }
        
        double notaMax= arrPromedios[1];
        double notaMin= arrPromedios[1];
        for (int i = 0; i < limEst; i++) {
            if (arrPromedios[i]>notaMax){
                notaMax = arrPromedios[i];
        }else if (arrPromedios[i]<notaMin){
                notaMin = arrPromedios[i];
                }
                }
        for (int i = 0; i < limEst; i++) {
            sumaTotal += arrPromedios[i];
            
       }
        
        promedioTotal = sumaTotal/arrPromedios.length;
        for (int i = 0; i < limEst; i++) { 
            if (arrPromedios[i]>promedioTotal){
                estGood[i] = arrPromedios[i];
            }
            if(arrPromedios[i]<promedioTotal){
                estBad[i]= arrPromedios[i];
        }
        }
           
        
        System.out.println("Nombres | ACD\t| APE\t| AA\t| Promedios");
        for (int i = 0; i < limEst; i++) {
            System.out.print(nameAba[i]+"\t");
            for (int j = 0; j < limNotas; j++) {
                System.out.printf("| %.2f\t",matrizNotas[i][j]);
            }
            System.out.printf("|%.2f\t",arrPromedios[i]);
            System.out.println("");
        }

        System.out.println("El promedio es "+promedioTotal);
        
        System.out.println("La nota maxima es: "+notaMax);
        System.out.println("La nota minima es: "+notaMin);
        System.out.println("-------");
              System.out.println("Estudiante encima del promedio: ");
              System.out.println("");
          for (int i = 0; i < limEst; i++) {
              if (estGood[i]>promedioTotal){
              System.out.println(nameAba[i]+" tiene "+estGood[i]+"\t");
              }
          }
          System.out.println("-------");
          System.out.println("Estudiante debajo del promedio: ");
          System.out.println("");
          for (int i = 0; i < limEst; i++) {
              if (estBad[i]<promedioTotal&&estBad[i]!=0.0){
              System.out.println(nameAba[i]+" tiene "+estBad[i]+"\t");
                    }
    }
          System.out.println("");
          System.out.println("-------");
}
}
=======
package taller10;

/**
 *
 * El primer ciclo paralelo C, cuenta con 28 estudiantes, de los cuáles al finalizar el periodo, la Dirección de la carrera de Computación a solicitado las siguientes estadísticas de la materia INTRODUCCIÓN A LA PROGRAMACIÓN en función a los promedios por estudiante, dichos promedios se deben calcular (ponderar) de 3 calificaciones (ACD que representa el 35% de la nota, APE del 35% y la nota del AA con un peso del 30%). En resumen, los requerimientos son los siguientes:

Registre los nombres de cada estudiante de dicho paralelo.
Genere aleatoriamente las notas ACD, APE, AA, para cada uno de los 28 estudiantes de 0-10 pts.
Calcule el promedio de cada uno de los estudiantes del paralelo dada la siguiente ponderación: ACD->35%, APE->35%, y el AA->30%.
Obtenga el promedio del curso, del paralelo C.
Liste los nombres de los estudiantes y su nota, que hayan obtenido un promedio por encima del promedio del curso.
Liste los nombres de los estudiantes y su nota, que hayan obtenido un promedio por debajo del promedio del curso.
Muestre el estudiante con su calificación, si es el del mayor promedio (el más alto de la clase).
Muestre el estudiante con su calificación, si es el del menor promedio (el más bajo de la clase). 
 */
import java.util.Random;
public class Ejercicio01Promedios {

   public static void main(String[] args) {
        String []nameAba = {"Nombre1", "Nombre2", "Nombre3", "Nombre4", "Marco","Adrian"};
        int limEst= nameAba.length;
        int limNotas = 3;
        Random r = new Random();
        double matrizNotas [][] = new double [limEst][limNotas];
        double arrPromedios [] = new double[limEst];
        double estGood[] = new double[limEst];
        double estBad[] = new double[limEst];
        double sumaTotal =0, promedioTotal=0;
        
        for (int i = 0; i < limEst; i++) {
            for (int j = 0; j < limNotas; j++) {
                matrizNotas[i][j]=  r.nextDouble(9,10);   
            }
        }
        for (int i = 0; i < limEst; i++) {
            arrPromedios[i] = (matrizNotas[i][0]*0.35)+(matrizNotas[i][1]*0.35)+(matrizNotas[i][2]*0.3);
            
        }
        
        double notaMax= arrPromedios[1];
        double notaMin= arrPromedios[1];
        for (int i = 0; i < limEst; i++) {
            if (arrPromedios[i]>notaMax){
                notaMax = arrPromedios[i];
        }else if (arrPromedios[i]<notaMin){
                notaMin = arrPromedios[i];
                }
                }
        for (int i = 0; i < limEst; i++) {
            sumaTotal += arrPromedios[i];
            
       }
        
        promedioTotal = sumaTotal/arrPromedios.length;
        for (int i = 0; i < limEst; i++) { 
            if (arrPromedios[i]>promedioTotal){
                estGood[i] = arrPromedios[i];
            }
            if(arrPromedios[i]<promedioTotal){
                estBad[i]= arrPromedios[i];
        }
        }
           
        
        System.out.println("Nombres | ACD\t| APE\t| AA\t| Promedios");
        for (int i = 0; i < limEst; i++) {
            System.out.print(nameAba[i]+"\t");
            for (int j = 0; j < limNotas; j++) {
                System.out.printf("| %.2f\t",matrizNotas[i][j]);
            }
            System.out.printf("|%.2f\t",arrPromedios[i]);
            System.out.println("");
        }

        System.out.println("El promedio es "+promedioTotal);
        
        System.out.println("La nota maxima es: "+notaMax);
        System.out.println("La nota minima es: "+notaMin);
        System.out.println("-------");
              System.out.println("Estudiante encima del promedio: ");
              System.out.println("");
          for (int i = 0; i < limEst; i++) {
              if (estGood[i]>promedioTotal){
              System.out.println(nameAba[i]+" tiene "+estGood[i]+"\t");
              }
          }
          System.out.println("-------");
          System.out.println("Estudiante debajo del promedio: ");
          System.out.println("");
          for (int i = 0; i < limEst; i++) {
              if (estBad[i]<promedioTotal&&estBad[i]!=0.0){
              System.out.println(nameAba[i]+" tiene "+estBad[i]+"\t");
                    }
    }
          System.out.println("");
          System.out.println("-------");
}
}
>>>>>>> 4964a0a2a2951781b273d0f94146d47c05d89150
