package tema4;
import java.util.Scanner;
public class sumadeventasydescuentos {
    public static double calcularTotal() {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuántos precios quieres introducir?: ");
        int cantidad = sc.nextInt();
        double total = 0;
        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Introduce el precio " + i + ": ");
            double precio = sc.nextDouble();

            if (precio < 0) {
                System.out.println("El precio no puede ser negativo. Intenta de nuevo.");
                i--; 
            } else {
                total = total + precio;
            }
        }
        return total;
    }
    public static double aplicarDescuento(double total) {
        if (total > 100) {
            System.out.println("Se aplicó un descuento del 10%");
            return total * 0.90;
        } else {
            System.out.println("No se aplicó ningún descuento.");
            return total;
        }
    }
    public static void main(String[] args) {
        double totalSinDescuento = calcularTotal();
        double totalConDescuento = aplicarDescuento(totalSinDescuento);
        System.out.println("\nEl total sin descuento es: " + totalSinDescuento + " euros");
        System.out.println("El total con descuento es: " + totalConDescuento + " euros");
    }
}
             

