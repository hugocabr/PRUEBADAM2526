package programacion.Tema3;
import java.util.Scanner;

public class numeroysufactorial {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 int factorial;
 int num;
System.out.println("Dime un numero: ");
num = sc.nextInt();
factorial = 1;
for (int i = num; i > 0;i--){
    factorial = factorial * i;
}
     System.out.println(" El factorial de " + num + " es: " + factorial);
 }
}


