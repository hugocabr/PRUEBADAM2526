package tema4;
import java.util.Scanner;
public class sumadigitos {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
    System.out.println("Dime un numero: ");
    int num = sc.nextInt();
    
if (num < 0 ){
    System.out.println("El numero tiene que ser positivo");     
} else {
     int resultado = sumadigitos(num);
     System.out.println("La suma de los digitos es:" + resultado);
  } 
}public static int sumadigitos(int num){
  if (num < 10){
      return num;
  } else {
    return (num % 10) + sumadigitos(num / 10);
    
  }   
}
}
