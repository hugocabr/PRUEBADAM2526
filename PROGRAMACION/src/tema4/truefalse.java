package tema4;
import java.util.Scanner;
public class truefalse {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 for(int i = 1; i <= 15;i++){
 if (esPrimo(i)){
     System.out.println(i + "es primo");
 }else{
          System.out.println(i + "no es primo");
 }
 }    
         
 } static boolean esPrimo(int num){
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
 }
}


    
     
     
     
 
     