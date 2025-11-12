package tema4;

import java.util.Scanner;

public class horas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la primera hora: ");
        int hora1 = sc.nextInt();
        System.out.println("Dime los minutos de la primera hora: ");
        int minuto1 = sc.nextInt();
        System.out.println("Dime la segunda hora: ");
        int hora2 = sc.nextInt();
        System.out.println("Dime los minutos de la segunda hora: ");
        int minuto2 = sc.nextInt();
        int diferencia = diferenciaMin(hora1, minuto1, hora2, minuto2);
        System.out.println("La diferencia en minutos es " + diferencia);

    }

    static int diferenciaMin(int hora1, int minuto1, int hora2, int minuto2) {
        int totalMin1 = hora1 * 60 + minuto1;
        int totalMin2 = hora2 * 60 + minuto2;
        int resultado = totalMin1 - totalMin2;
        if (resultado < 0) {
            resultado = resultado * -1;

        }
        return resultado;
    }
}
