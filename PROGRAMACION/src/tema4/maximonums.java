package tema4;
import java.util.Scanner;
public class maximonums {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        System.out.println("Dime el primer numero: ");
        int a = sc.nextInt();
        System.out.println("Dime el segundo numero: ");
        int b = sc.nextInt();
        System.out.println("Dime el tercer numero: ");
        int c = sc.nextInt();
        System.out.println("El maximo de los numeros es: " + maximonums(a,b,c));
    
    }     public static int maximonums (int a,int b,int c){
        int maximo;
        if (a > b && a > c){
            maximo = a;
                    } else if (b > a && b > c){
            maximo = b;
        } else{
                        maximo = c;
                    }
            return (maximo); 
    }
}
                            
                            
        
    

