package taller10;

/**
 *
 * @author Carlos Sánchez
 */
public class Ejercicio01Promedios {

    public static void main(String[] args) {
        String nomAbad[] = {"Juan S.", "Juan D.", "Ricardo", "Carlos", "Est 1", "Est 2"};
        int limitEst = nomAbad.length, limNotas = 3;

        double matrizNotas[][] = new double[limitEst][limNotas];
        double arrPromedio[] = new double[limitEst];

        int indiceNoteAlta = 0, indiceNoteBaja = 10;

        System.out.println(" \t NOMBRES | ACD | APE | AA | PROMEDIOS");
        for (int i = 0; i < limitEst; i++) {
            System.out.print("[ " + nomAbad[i] + " ] ");
            int promedioActual = 0;
            for (int j = 0; j < limNotas; j++) {

                matrizNotas[i][j] = Math.random() * 9 + 1;
                System.out.printf("\t %.2f ", matrizNotas[i][j]);

            }
            arrPromedio[i] = (matrizNotas[i][0] * 0.35) + (matrizNotas[i][1] * 0.35) + (matrizNotas[i][2] * 0.30);

            if (arrPromedio[i] > arrPromedio[indiceNoteAlta]) {
                indiceNoteAlta = i;
            }

            if (arrPromedio[i] < arrPromedio[indiceNoteBaja]) {
                indiceNoteBaja = i;
            }
            System.out.printf("   %.2f", arrPromedio[i]);
            System.out.println("");
        }

        System.out.printf("Estudiante con la nota mas alta: " + nomAbad[indiceNoteAlta] + "| Puntaje: %.2f \n", arrPromedio[indiceNoteAlta]);
        System.out.printf("Estudiante con la nota mas baja: " + nomAbad[indiceNoteBaja] + "| Puntaje: %.2f \n", arrPromedio[indiceNoteBaja]);
    }
}
