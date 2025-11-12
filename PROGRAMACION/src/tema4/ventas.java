package tema4;

import java.util.Scanner;

public class ventas {

    static double totalVentas = 0;
    static int numeroVentas = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("==== MENÚ DE REGISTRO DE VENTAS ====");

            System.out.println("1. Anadir nueva venta");

            System.out.println("2. Ver total de ventas");

            System.out.println("3. Ver número de ventas");

            System.out.println("4. Salir");

            System.out.println("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    agregarVenta();
                    break;
                case 2:
                    mostrarTotalVentas();
                    break;
                case 3:
                    mostrarNumeroVentas();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida, inténtalo de nuevo.");
            }

        } while (opcion != 4);

    }

    public static void agregarVenta() {
        Scanner sc = new Scanner(System.in);
        double venta = sc.nextDouble();

        System.out.println("Introduce el valor de la venta: ");
        if (venta < 0) {
            System.out.println("Tiene que ser un numero positivo");
        } else {
            totalVentas += venta;
            numeroVentas++;
            System.out.println("Venta registrada.");

        }
    }

    public static void mostrarTotalVentas() {
        System.out.println("El total de las ventas es " + totalVentas);

    }

    public static void mostrarNumeroVentas() {
        System.out.println("El numero de ventas total es: " + numeroVentas);

    }
}
