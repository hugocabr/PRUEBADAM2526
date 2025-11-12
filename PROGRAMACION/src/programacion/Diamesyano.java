package programacion;
import java.util.Scanner;

public class Diamesyano {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean Fechacorrecta = false;  

        System.out.print("Dime un dia: ");
        int dia = sc.nextInt();

        System.out.print("Dime un mes: ");
        int mes = sc.nextInt();

        System.out.print("Dime un año: ");
        int ano = sc.nextInt();

        int diasdelmes = 0;

        if (ano == 0) {
            Fechacorrecta = false;
        } else {
            boolean bisiesto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);

            if (mes == 2) {
                if (bisiesto) {
                    diasdelmes = 29;
                    System.out.println("El ano " + ano + " es bisiesto.");
                } else {
                    diasdelmes = 28;
                    System.out.println("El ano " + ano + " no es bisiesto.");
                }
            } else {
                switch (mes) {
                    case 4, 6, 9, 11 -> diasdelmes = 30;
                    case 1, 3, 5, 7, 8, 10, 12 -> diasdelmes = 31;
                    default -> diasdelmes = 0;
                }
            }

            if (dia >= 1 && dia <= diasdelmes && diasdelmes > 0) {
                Fechacorrecta = true;
            }
        }

        if (Fechacorrecta) {
            System.out.println("Fecha OK: " + dia + "/" + mes + "/" + ano);
        } else {
            System.out.println("Fecha incorrecta");
        }
    }
}

                

        
    


