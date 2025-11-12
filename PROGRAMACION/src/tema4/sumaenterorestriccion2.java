package tema4;
import java.util.InputMismatchException;
import java.util.Scanner;

public class sumaenterorestriccion2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer número: ");
        int num1 = leenumero(sc);

        System.out.println("Introduce el segundo número: ");
        int num2 = leenumero(sc);

        System.out.println("La suma de los dos números es: " + (num1 + num2));

        sc.close();
    }

    static int leenumero(Scanner sc) {
        boolean valido = false;
        int num = 0;

        while (!valido) {
            try {
                num = sc.nextInt();
                if (num < 0) {
                    throw new InputMismatchException();
                }
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: tienes que introducir un número entero positivo.\nIntroduce el número: ");
                sc.nextLine();
            }
        }

        return num;
    }
}


