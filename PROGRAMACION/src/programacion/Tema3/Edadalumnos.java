    package programacion.Tema3;
    import java.util.Scanner;

    public class Edadalumnos {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int SumaEdades = 0;
    int NumeroAlumnos =  0;
    int ContadorMayorEdad = 0;
    double Media;
    System.out.println("Introduce tu edad: ");
    int edad = sc.nextInt();
    while (edad >= 0){
      SumaEdades += edad;
    NumeroAlumnos ++;
    if (edad >= 18){
        ContadorMayorEdad++;
    }
        System.out.println("Introduce tu edad: ");
        edad = sc.nextInt();
    }
    if (NumeroAlumnos > 0){
    Media = (double) SumaEdades / NumeroAlumnos;
    
        System.out.println("La suma de las edades: " + SumaEdades);
        System.out.println("La media es: " + Media);
        System.out.println("El numero de alumnos es: " + NumeroAlumnos);
        System.out.println("Los mayores de edad son: " + ContadorMayorEdad);
    }else {
      System.out.println("No se introdijeron edades validas");
    
    
    } 
    }
    }
    

    
    
    
    
    
    