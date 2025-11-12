    package programacion.Tema3;
    import java.util.Scanner;
    public class guarismoaguarismo {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un numero: ");
    int num = sc.nextInt();
    while (num > 0){
     int unidad = num % 10;
    System.out.println(unidad);
    num = num / 10;
    }  
    }
    }

    
