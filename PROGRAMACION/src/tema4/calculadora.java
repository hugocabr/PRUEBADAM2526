package tema4;
import java.util.Scanner;
public class calculadora {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            opcion = escribeMenu();

            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Introduce el primer número: ");
                double n1 = sc.nextDouble();
                System.out.print("Introduce el segundo número: ");
                double n2 = sc.nextDouble();

                double resultado = ejecutaOperacion(n1, n2, opcion);
                muestraResultado(resultado);

            } else if (opcion == 5) {
                System.out.println("FIN DEL PROGRAMA");
            } else {
                System.out.println("OPCIÓN NO VÁLIDA");
            }

        } while (opcion != 5);
    }

    static int escribeMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nCALCULADORA BÁSICA NÚMEROS REALES");
        System.out.println("Menú de operaciones:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Salir del programa");
        System.out.print("Elija una opción: ");
        return sc.nextInt();
    }

    static double suma(double a, double b) {
        return a + b;
    }

    static double resta(double a, double b) {
        return a - b;
    }

    static double multiplicacion(double a, double b) {
        return a * b;
    }

    static double division(double a, double b) {
        return a / b;
    }

    static double ejecutaOperacion(double a, double b, int operacion) {
        switch (operacion) {
            case 1: return suma(a, b);
            case 2: return resta(a, b);
            case 3: return multiplicacion(a, b);
            case 4: return division(a, b);
            default: return 0.0;
        }
    }

    static void muestraResultado(double resultado) {
        System.out.println("Resultado: " + resultado);
    }
}


  
