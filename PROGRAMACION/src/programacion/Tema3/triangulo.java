package programacion.Tema3;
import java.util.Scanner;
public class triangulo {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Dime un num: ");
int num = sc.nextInt();
for(int fila = 1; fila <= num; fila++) {        
 for(int espacio = 1; espacio <= num - fila; espacio++) {
System.out.print(" ");  
 }          
 for(int columna = 1; columna <= fila; columna++) {
System.out.print("* ");  
}
System.out.println(); 
}
}
}