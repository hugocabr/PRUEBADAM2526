
package tema4;
import java.util.Scanner;
public class mostrarnumero {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Introduze el primer numero: ");
    int a = sc.nextInt();
      System.out.println("Introduze el segundo numero: ");
  int b = sc.nextInt(); 
  }   public static void mostrarnumeros (int a,int b){
    int mayor = a > b ? a : b;
    int menor = a < b ? a : b;
 for (int i = menor; i <= mayor; i++){
     System.out.println("i");
 }   
}
}
