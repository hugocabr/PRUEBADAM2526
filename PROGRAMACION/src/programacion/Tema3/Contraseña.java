package programacion.Tema3;
import java.util.Scanner;
public class Contraseña {
public static void main(String[] args) {
String Contrasena_correcta = "123";
    Scanner sc = new Scanner(System.in);
String Contrasena_ingresada = "";

while (!Contrasena_ingresada.equals(Contrasena_correcta)){
    System.out.println("Ingresa la contraseña: ");
Contrasena_ingresada = sc.nextLine();

if (!Contrasena_ingresada.equals(Contrasena_correcta)){
 System.out.println("Contraseña incorrecta,hazlo de nuevo: ");
}
}
 System.out.println("¡Contraseña correcta! Acceso concedido.");
}
}

 
 
