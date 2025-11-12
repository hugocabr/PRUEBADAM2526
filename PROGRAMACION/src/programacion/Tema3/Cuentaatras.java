package programacion.Tema3;
import java.util.Scanner;
public class Cuentaatras {
public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 int num;
System.out.println("Dime un num entero y positivo:");
 num = sc.nextInt();
 while (num < 0) {
 System.out.println("Por favor, introduce un número positivo:");
 num = sc.nextInt();
}
while (num >= 0) {
 System.out.println(num);
if (num == 0) {
System.out.println("Despegue");
}
num--;
}

}
}
    

    