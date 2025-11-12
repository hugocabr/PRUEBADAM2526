package tema4;
import java.util.InputMismatchException;
import java.util.Scanner;

public class factorialrestriccion {
    public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
 boolean correcto = false;
  while (!correcto) {
  try {
 System.out.println("Introduce el primer número: ");
int num1 = sc.nextInt();
 if (num1 < 0) {
 throw new InputMismatchException();
}
int resultado = factorial(num1);
System.out.println("El factorial de " + num1 + " es: " + resultado);
correcto = true;
            } catch (InputMismatchException e) {
 System.out.println("Error: Introduzca de nuevo un número entero positivo.");
    sc.nextLine(); 
 } finally {
System.out.println("Fin");
            }
        }
    }
    public static int factorial(int num1) {
        if (num1 < 0) {
        throw new IllegalArgumentException("El número debe ser positivo");
        }
        int resultado = 1;
        for (int i = 1; i <= num1; i++) {
        resultado *= i;
        }
        return resultado;
    }
}