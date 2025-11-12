package programacion;
import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu salario: ");
        int salario = sc.nextInt();

        if (salario < 1000) {
            System.out.println("Es MUY MALO");
        } else if (salario >= 3000) {
            System.out.println("El salario es MUY BUENO");
        } else if (salario >= 1500) {
            System.out.println("El salario es BUENO");
        } else {
            System.out.println("El salario es MALO");
        }
    }
}

        
    
   