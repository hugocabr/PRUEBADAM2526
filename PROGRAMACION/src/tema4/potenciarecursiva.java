package tema4;
import java.util.Scanner;
public class potenciarecursiva {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la base (a): ");
        double a = sc.nextDouble();
        System.out.print("Introduce el exponente (n): ");
        int n = sc.nextInt();

        double resultado = potencia(a, n);
        System.out.println("Resultado recursivo: " + resultado);
    }public static double potencia(double a, int n) {
        if (n == 0) return 1;
        return a * potencia(a, n - 1);
    }
}

