package tema4;
import java.util.Scanner;
public class mostrarnpares {
    public static void muestraPares(int n){
    int contador = 0;
    int numero = 2;
    while (contador < n)      {
        System.out.println(numero); 
        numero = numero + 2;
        contador++;
    }
    }   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);               
        System.out.print("¿Cuántos números pares quieres ver? ");
        int cantidad = sc.nextInt();
        muestraPares(cantidad);
    }
}

  
    
        
