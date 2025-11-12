package programacion.Tema3;

import java.util.Scanner;

public class dado100 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Introduce el número de tiradas: ");
int numTiradas = sc.nextInt();
int contador = 0;
int pares = 0;
  int impares = 0;
int sumaPares = 0;
 int sumaImpares = 0;
do {
System.out.print("Introduce el valor de la tirada " + (contador + 1) + " (1-100): ");
 int tirada = sc.nextInt();
if (tirada < 1 || tirada > 100) {
System.out.println("Valor inválido. Debe estar entre 1 y 100.");
  continue; 
  }
 if (tirada % 2 == 0) {
pares++;
 sumaPares += tirada;   
} else {
impares++;
sumaImpares += tirada;
}
 contador++;
} while (contador < numTiradas);
 System.out.println("\nCantidad de pares: " + pares);
 System.out.println("Suma de pares: " + sumaPares);
System.out.println("Cantidad de impares: " + impares);
 System.out.println("Suma de impares: " + sumaImpares);
    }
}

