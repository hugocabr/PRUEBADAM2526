package programacion.Tema3;
import java.util.Scanner;

public class sumapares {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 int num;
 int sumaTotal = 0;
while (true) {
System.out.println("Dime un num entero y positivo: ");
 num = sc.nextInt();
if (num < 0) {
System.out.println("Programa finalizado:");
System.out.println("La suma total de los números pares introducidos es: " + sumaTotal);
break;
 }
int i = 1;
while (i <= num) {
 if (i % 2 == 0) {
sumaTotal += i;
}
i++;
 }
}
 }
}

   
    
    
    
    