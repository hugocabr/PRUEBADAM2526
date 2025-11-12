package tema4;
import java.util.Scanner;
public class divisorespares {
 static boolean esPrimo(int num){
    boolean primo = true;
            int i = 2;
            if(num < 2){
                primo = false;
            }
   while (i < num && primo == true){
       if ( num % i == 0){
           primo = false;
       }
       i++;
   }
   return(primo);
 }static int NumDivisoresPrimos(int num){
     int contador = 0;
     for (int i = 2; i <= num;i++)
 if (esPrimo(i) && num % i == 0){   
     contador++;
 }         
 return(contador);
 
 }public static void main(String[] args) {
            System.out.println("Divisores de 24: " + NumDivisoresPrimos(24) ); 
 }
}

