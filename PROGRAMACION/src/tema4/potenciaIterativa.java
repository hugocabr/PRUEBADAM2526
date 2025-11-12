package tema4;
import java.util.Scanner;
public class potenciaIterativa {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        System.out.println("Dime la base: ");
        double base = sc.nextDouble();
        System.out.println("Dime el exponente: ");
        int exponente = sc.nextInt();
        double resultado = potencia(base,exponente);
        System.out.println("Resultado iterativo: " + resultado);
    
    }static double potencia(double base, int exponente) {
        double resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }
        return resultado;
    }
}