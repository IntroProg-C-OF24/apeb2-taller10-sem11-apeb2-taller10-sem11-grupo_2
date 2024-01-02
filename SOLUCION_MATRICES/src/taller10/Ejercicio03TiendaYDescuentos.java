
package taller10;

import java.util.Scanner;
import java.util.ArrayList;

/**
Crea un programa que gestione el inventario de una tienda, así como la emisión de facturas. Utiliza una matriz bidimensional para almacenar los productos disponibles en la tienda, con información como nombre, precio y cantidad. El programa debe permitir facturar un producto dado su código, y unidades deseadas. Adicional se debe agregar a la factura al 12% del IVA, y si la compra superar los $100, se debe aplicar un descuento.

Nota: Considere la alternativa de inexistencias en Stop, para el caso, muestre la alerta respectiva. Crea
 */
public class Ejercicio03TiendaYDescuentos {
    public static void main(String[] args) {

    int capacidadTienda = 10;
    String tiendaProducto[][]= new String[capacidadTienda][1];
    double tiendaPrecio[][] = new double[capacidadTienda][3];
    Scanner sc = new Scanner(System.in);
    boolean mostrarMenu = true;
    int productosTotales = 1;
    double precioTotal= 0;
    double desc = 0.09;
    
    //Agregar un producto por defecto:
    tiendaProducto[0][0]= "Leche"; //Nombre
    tiendaPrecio[0][1] = 1.25; //Precio
    tiendaPrecio[0][2] = 3; //Cantidad:

            System.out.println("Producto \tPrecio \t\t Cantidad:");
            for (int i = 0; i < tiendaProducto.length; i++) {
            for (int j = 0; j < tiendaProducto[i].length; j++) {    
            // tiendaProducto[i].length
                if (tiendaProducto[i][j]!= null) {
                    System.out.print(tiendaProducto[i][j]+ "\t\t");
                    
                } else {
                    System.out.print("X \t\t");
                }
            }
            
            System.out.println("");
            for ( i = 0; i < tiendaPrecio.length; i++) {
            for (int j = 0; j < tiendaPrecio[i].length; j++) {

                if (tiendaPrecio[i][j] != 0.0) {
                    System.out.print(tiendaPrecio[i][j]+ "\t\t");
                    precioTotal = tiendaPrecio[i][1]*tiendaPrecio[i][2];
                    
                } else {
                    System.out.print("X \t\t");
                }
            }
            System.out.println("");
            }
            }
            System.out.println("Su precio total es: "+precioTotal);
            precioTotal+=(precioTotal*0.12);
            System.out.println("Aplicando el IVA: "+precioTotal);
            if (precioTotal>100) {
                precioTotal-=(precioTotal*desc);
            System.out.println("Gracias a su compra mayor a 100$, su total es de: "+precioTotal);
            }
            
        }
    }

    
