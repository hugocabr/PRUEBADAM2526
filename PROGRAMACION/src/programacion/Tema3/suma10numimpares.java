package programacion.Tema3;
import java.util.Scanner;

public class suma10numimpares {
 public static void main(String[] args) {
int suma = 0;
for ( int i = 1; i < 10;i++){
    int impar = 2 * i - 1;
    suma = suma + impar;
}
     System.out.println("la suma de los 10 primeros numeros impares es : " + suma);
 }
}