package programacion.Tema3;
import java.util.Scanner;
public class Operaciones {
public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
System.out.println("Escoje una de estas tres opciones:");
System.out.println("1. Sumar");
System.out.println("2. Restar");
System.out.println("3. Multiplicar");
System.out.println("Introduce el primer num");
double num1 = sc.nextInt();
System.out.println("Introduce el segundo num");
double num2 = sc.nextInt();
System.out.println("Elige una opcion del (1-3): ");
double opcion = sc.nextInt();
if (opcion == 1){
    System.out.println("la suma es: " + (num1 + num2));
} else if (opcion == 2){
    System.out.println("la rests es: " + (num1 - num2));
} else if (opcion == 3){
    System.out.println("la multiplicacion es: " + (num1 * num2));
} else {
    System.out.println("Opcion no valida");
}
}
}
