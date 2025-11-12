package tema4;
import java.util.Scanner;
public class longitudareavolumencirculares {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
double radio; 
int opcion;

do{
    System.out.println("1. Longitud de la circunferencia");
    System.out.println("2. Área del círculo");
    System.out.println("3. Área de la esfera");
    System.out.println("4. Área del cilindro");
    System.out.println("5. Volumen de la esfera");
    System.out.println("6. Volumen del cilindro");
    System.out.println("7. Nuevo radio");
    System.out.println("8. Terminar");
    System.out.print("¿Qué opción deseas escoger (1-8)? ");
    opcion = sc.nextInt();
    System.out.print("Introduce el radio inicial: ");
    radio = sc.nextDouble();
 
            switch (opcion) {
                case 1:
                    System.out.println("Longitud de la circunferencia: " + longitudCircunferencia(radio));
                    break;
                case 2:
                    System.out.println("Área del círculo: " + areaCirculo(radio));
                    break;
                case 3:
                    System.out.println("Área de la esfera: " + areaEsfera(radio));
                    break;
                case 4:
                    System.out.print("Introduce la altura del cilindro: ");
                    double alturaCilindro = sc.nextDouble();
                    System.out.println("Área del cilindro: " + areaCilindro(radio, alturaCilindro));
                    break;
                case 5:
                    System.out.println("Volumen de la esfera: " + volumenEsfera(radio));
                    break;
                case 6:
                    System.out.print("Introduce la altura del cilindro: ");
                    double alturaVolumen = sc.nextDouble();
                    System.out.println("Volumen del cilindro: " + volumenCilindro(radio, alturaVolumen));
                    break;
                case 7:
                    System.out.print("Introduce el nuevo radio: ");
                    radio = sc.nextDouble();
                    break;
                case 8:
                    System.out.println("Programa terminado.");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 8);
    }

    public static double longitudCircunferencia(double radio) {
        return 2 * Math.PI * radio;
    }

    public static double areaCirculo(double radio) {
        return Math.PI * radio * radio;
    }

    public static double areaEsfera(double radio) {
        return 4 * Math.PI * radio * radio;
    }

    public static double areaCilindro(double radio, double h) {
        return 2 * Math.PI * radio * (radio + h);
    }

    public static double volumenEsfera(double radio) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
    }

    public static double volumenCilindro(double radio, double h) {
        return Math.PI * radio * radio * h;
    }
}