package tema4;
import java.util.Scanner;
public class distanciaeuclidea {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
    System.out.println("Cuanto vale x1: ");
            double x1 = sc.nextDouble();
        System.out.println("Cuanto vale y1: ");
                    double y1 = sc.nextDouble();
            System.out.println("cuanto vale x2: ");
                        double x2 = sc.nextDouble();
                System.out.println("cuanto vale y2: ");
                            double y2 = sc.nextDouble();
 double resultado = distancia(x1, y1, x2, y2);
        System.out.println("La distancia euclídea entre los puntos es: " + resultado);
    }public static double distancia(double x1, double y1, double x2, double y2) {
   return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));    
    } 
}

                