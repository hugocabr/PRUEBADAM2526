package tema4;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Sumaenterosrestriccion {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
boolean correcto = false;
while(!correcto){
try{
  System.out.println("Dime el primer numero entero: ");
    int num1 = sc.nextInt();
    if (num1 < 0){
        throw new InputMismatchException();
    }
    System.out.println("Dime el segundo numero entero: ");
    int num2 = sc.nextInt();
        if (num2 < 0){
        throw new InputMismatchException();
    }
int resultado = suma(num1,num2);
 System.out.println("La suma de " + num1 + " y " + num2 + " es: " + resultado);
} catch (InputMismatchException e) {
    System.out.println("Error introduzca de nuevo un numero: ");
       
} finally{
    System.out.println("Fin");
       
} 
}
}public static int suma(int a,int b){
    return a + b;   
}
}  




































