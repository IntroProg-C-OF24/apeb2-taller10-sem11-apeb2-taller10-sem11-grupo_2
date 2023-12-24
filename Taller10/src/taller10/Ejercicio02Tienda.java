package taller10;

import java.util.Scanner;

/**
 *
 * Crea un programa que gestione el inventario de una tienda. Utiliza una matriz
 * bidimensional para almacenar los productos disponibles en la tienda, con
 * información como nombre, precio y cantidad. El programa debe permitir agregar
 * nuevos productos, actualizar existencias, buscar productos y eliminarlos.
 */
public class Ejercicio02Tienda {

    //Se las usa fuera ya que se separó parte del código en funciones: 
    static int capacidadTienda = 10;
    static String tienda[][] = new String[capacidadTienda][3];
    static Scanner sc = new Scanner(System.in);
    static boolean mostrarMenu = true;
    static int productosTotales = 1;
    
    public static void main(String[] args) {

        //Agregar un producto por defecto:
        tienda[0][0] = "Leche"; //Nombre
        tienda[0][1] = "$1.25"; //Precio
        tienda[0][2] = "Disponibles: 3"; //Cantidad:

        while (mostrarMenu) {
            System.out.println("Producto \tPrecio \t\t Cantidad:");
            imprimirMenu();
            int opcionSeleccionada = mostrarOpciones();
            ejecutarAccion(opcionSeleccionada);
        }
    }

    public static void ejecutarAccion(int accion) {
        switch (accion) {
            case 1:
               agregarProducto();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            default:
                mostrarMenu = false;
        }
    }

    public static int mostrarOpciones() {
        System.out.println("Qué desea hacer?: Escribir el número para seleccionar");
        System.out.println("1.- Agregar nuevo producto: ");
        System.out.println("2.- Actualizar producto existente: ");
        System.out.println("3.- Buscar un producto: ");
        System.out.println("4.- Eliminar un producto: ");
        System.out.println("Otro.- Salir del programa: ");
        return sc.nextInt();
    }

    public static void imprimirMenu() {
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
    }

    private static void agregarProducto() {
        if(productosTotales < capacidadTienda){
            System.out.println("Ingrese el nombre del producto: ");
            
            return;
        }
        
        System.out.println("La tienda está llena. No se puede agregar más");
    }
}
