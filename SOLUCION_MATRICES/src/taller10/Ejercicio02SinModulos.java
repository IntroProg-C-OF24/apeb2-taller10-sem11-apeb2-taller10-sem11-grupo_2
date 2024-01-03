
package taller10;
import java.util.Scanner;
public class Ejercicio02SinModulos {


    public static void main(String[] args) {
        
        int capacidadTienda = 10;
        String tienda[][] = new String[capacidadTienda][3];
        Scanner sc = new Scanner(System.in);
        boolean mostrarMenu = true;
        int productosTotales = 1;
        //Agregar un producto por defecto:
        tienda[0][0] = "Leche"; //Nombre
        tienda[0][1] = "$1.25"; //Precio
        tienda[0][2] = "Disponibles: 3"; //Cantidad:

        while (mostrarMenu) {
            System.out.println("Producto \tPrecio \t\t Cantidad:");
            for (int i = 0; i < tienda.length; i++) {
                for (int j = 0; j < tienda[i].length; j++) {
                    if (tienda[i][j] != null) {
                        System.out.print(tienda[i][j] + "\t\t");
                    } else {
                        System.out.print("X \t\t");
                    }
                }
                System.out.println("");
            }
            System.out.println("Qué desea hacer?: Escribir el número para seleccionar");
            System.out.println("1.- Agregar nuevo producto: ");
            System.out.println("2.- Actualizar producto existente: ");
            System.out.println("3.- Buscar un producto: ");
            System.out.println("4.- Eliminar un producto: ");
            System.out.println("Otro.- Salir del programa: ");
            int opcionSeleccionada = sc.nextInt();
            switch (opcionSeleccionada) {
                case 1 -> {
                    if(productosTotales < capacidadTienda){
                        System.out.println("Ingrese el nombre del producto: ");
                        String nombre = sc.next();
                        System.out.println("Ingrese el precio del producto: ");
                        String precio = sc.next();
                        System.out.println("Ingrese la cantidad disponible del producto: ");
                        String cantidad = sc.next();
                        tienda[productosTotales][0] = nombre;
                        tienda[productosTotales][1] = precio;
                        tienda[productosTotales][2] = "Disponibles: " + cantidad;
                        productosTotales++;
                    }
                    else{
                        System.out.println("La tienda está llena. No se puede agregar más");
                    }       }
                case 2 -> {
                }
                case 3 -> {
                }
                case 4 -> {
                }
                default -> mostrarMenu = false;
            }
        }
    }

}
