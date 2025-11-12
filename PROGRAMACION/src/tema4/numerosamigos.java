package tema4;
import java.util.Scanner;
public class numerosamigos {
 public static void main(String[] args) {
 int a = 220;
 int b = 284;        
System.out.println("¿Son amigos? " + sonAmigos(a, b));
     } static int sumadivisores (int n){
      int suma = 0;
      for (int i = 1; i < n; i++){
      if (n % i == 0) suma += i;                             
      }
      return suma;
                
     }public static boolean sonAmigos(int a, int b) {
        return sumadivisores(a) == b && sumadivisores(b) == a;
    }
}