<<<<<<< HEAD

package taller10;
/* Crea un juego de tres en raya utilizando una matriz bidimensional de 3x3. Permita a dos jugadores marcar sus movimientos alternativamente. El juego debe verificar si alguno de los jugadores ha ganado o si hay un empate.
*/
import java.util.Scanner;
public class Ejercicio04TresEnRaya {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] mt = new char[3][3];
        char jugadorActual = 'X';
        boolean hayGanador = false;
        int movimientos = 0;

        // Inicializar la matriz
        for (int i = 0; i < mt.length; i++) {
            for (int j = 0; j < mt.length; j++) {
                mt[i][j] = '-';
            }
        }

        // Jugar hasta que haya un ganador o empate
        while (!hayGanador && movimientos < 9) {
            // Mostrar la matriz
            System.out.println("Tablero actual:");
            for (int i = 0; i < mt.length; i++) {
                for (int j = 0; j < mt.length; j++) {
                    System.out.print(mt[i][j] + " ");
                }
                System.out.println();
            }

            // Pedir al jugador que haga su movimiento
            System.out.println("Jugador " + jugadorActual + ", es tu turno.");
            System.out.print("Fila (1-3): ");
            int fila = sc.nextInt() - 1;
            System.out.print("Columna (1-3): ");
            int columna = sc.nextInt() - 1;

            // Verificar si la posición está disponible
            if (mt[fila][columna] == '-') {
                mt[fila][columna] = jugadorActual;
                movimientos++;

                // Verificar si el jugador actual ha ganado
                if (mt[fila][0] == jugadorActual && mt[fila][1] == jugadorActual && mt[fila][2] == jugadorActual ||
                        mt[0][columna] == jugadorActual && mt[1][columna] == jugadorActual && mt[2][columna] == jugadorActual ||
                        fila == columna && mt[0][0] == jugadorActual && mt[1][1] == jugadorActual && mt[2][2] == jugadorActual ||
                        fila + columna == 2 && mt[0][2] == jugadorActual && mt[1][1] == jugadorActual && mt[2][0] == jugadorActual) {
                    hayGanador = true;
                    System.out.println("¡Jugador " + jugadorActual + " ha ganado!");
                }

                // Cambiar al siguiente jugador
                jugadorActual = jugadorActual == 'X' ? 'O' : 'X';
            } else {
                System.out.println("La posición seleccionada no está disponible. Por favor, intenta de nuevo.");
            }
        }

        // Mostrar el resultado final
        if (!hayGanador) {
            System.out.println("¡Empate!");
        }

        System.out.println("Matriz final:");
        for (int i = 0; i < mt.length; i++) {
            for (int j = 0; j < mt.length; j++) {
                System.out.print(mt[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Gracias por jugar 💚");
    }

    }

=======

package taller10;
/* Crea un juego de tres en raya utilizando una matriz bidimensional de 3x3. Permita a dos jugadores marcar sus movimientos alternativamente. El juego debe verificar si alguno de los jugadores ha ganado o si hay un empate.
*/
import java.util.Scanner;
public class Ejercicio04TresEnRaya {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] mt = new char[3][3];
        char jugadorActual = 'X';
        boolean hayGanador = false;
        int movimientos = 0;

        // Inicializar la matriz
        for (int i = 0; i < mt.length; i++) {
            for (int j = 0; j < mt.length; j++) {
                mt[i][j] = '-';
            }
        }

        // Jugar hasta que haya un ganador o empate
        while (!hayGanador && movimientos < 9) {
            // Mostrar la matriz
            System.out.println("Tablero actual:");
            for (int i = 0; i < mt.length; i++) {
                for (int j = 0; j < mt.length; j++) {
                    System.out.print(mt[i][j] + " ");
                }
                System.out.println();
            }

            // Pedir al jugador que haga su movimiento
            System.out.println("Jugador " + jugadorActual + ", es tu turno.");
            System.out.print("Fila (1-3): ");
            int fila = sc.nextInt() - 1;
            System.out.print("Columna (1-3): ");
            int columna = sc.nextInt() - 1;

            // Verificar si la posición está disponible
            if (mt[fila][columna] == '-') {
                mt[fila][columna] = jugadorActual;
                movimientos++;

                // Verificar si el jugador actual ha ganado
                if (mt[fila][0] == jugadorActual && mt[fila][1] == jugadorActual && mt[fila][2] == jugadorActual ||
                        mt[0][columna] == jugadorActual && mt[1][columna] == jugadorActual && mt[2][columna] == jugadorActual ||
                        fila == columna && mt[0][0] == jugadorActual && mt[1][1] == jugadorActual && mt[2][2] == jugadorActual ||
                        fila + columna == 2 && mt[0][2] == jugadorActual && mt[1][1] == jugadorActual && mt[2][0] == jugadorActual) {
                    hayGanador = true;
                    System.out.println("¡Jugador " + jugadorActual + " ha ganado!");
                }

                // Cambiar al siguiente jugador
                jugadorActual = jugadorActual == 'X' ? 'O' : 'X';
            } else {
                System.out.println("La posición seleccionada no está disponible. Por favor, intenta de nuevo.");
            }
        }

        // Mostrar el resultado final
        if (!hayGanador) {
            System.out.println("¡Empate!");
        }

        System.out.println("Matriz final:");
        for (int i = 0; i < mt.length; i++) {
            for (int j = 0; j < mt.length; j++) {
                System.out.print(mt[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Gracias por jugar 💚");
    }

    }

>>>>>>> 4964a0a2a2951781b273d0f94146d47c05d89150
