package tema4;
import java.util.Scanner;
public class areavolumencilindro {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
    System.out.println("introduce el radio: ");
    double radio = sc.nextDouble();
    System.out.println("introduce la altura: ");
    double altura = sc.nextDouble();
    System.out.println("Que quieres calcular (area(1) o volumen(2)): ");
    int tipo = sc.nextInt();
    System.out.println();
    areavolumencilindro(radio, altura, tipo);
} public static void areavolumencilindro (double radio,double altura,int opciones){
    double volumen,area;
    switch (opciones){
        case 1-> {
        area = 2 * Math.PI * radio *(altura + radio);
            System.out.println("El area de este cilindro es: " + area);
        }
        case 2 ->{
            volumen = Math.PI * Math.pow(radio,2) * altura;
            System.out.println("El volumen de este cilindro es: " + volumen);   
        }    
        }
    }
    
    
}






        
    
    
    
