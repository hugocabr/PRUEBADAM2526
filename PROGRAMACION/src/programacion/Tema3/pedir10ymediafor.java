package programacion.Tema3;

import java.util.Scanner;

public class pedir10ymediafor {
    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
 int numero;
 int suma = 0;
 int cantidad = 10;
 System.out.println("Dime 10 números enteros: ");
  for (int i = 1; i <= cantidad; i++) {
   System.out.print("Número " + i + ": ");
     numero = sc.nextInt();  
suma += numero;
        }
  double media = (double) suma / cantidad;  
        System.out.println("La media de los 10 números es: " + media);
    }
}
         
        
        

    
    
    
    
    
  
