
package programacion.Tema3;
import java.util.Scanner;
public class Triangulorectancgulo {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Dime un num: ");
int num = sc.nextInt();
for(int fila = 1;fila<= num;fila++){
for(int columna = fila;columna <=num;columna++){
System.out.print("*");
}
System.out.println("");
}
}
}