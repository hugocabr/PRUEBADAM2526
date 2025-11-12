    package programacion;
    import java.util.Scanner;

    public class Temperatura {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Que temperatura hace en el aula: "); 
    int temperatura = sc.nextInt();
    if (temperatura < 12){
        System.out.println("Hce mucho frio");
    } else if (temperatura < 22) {
        System.out.println("Hace frio");
    } else if (temperatura < 32 ) {
        System.out.println("Hace calor");
    }    else if (temperatura >=32 ) {
        System.out.println("Hace mucho calor");
    }
    }
    }

