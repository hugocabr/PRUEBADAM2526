    package programacion;
    import java.util.Scanner;

    public class Horaminutoysegundo {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Dime que hora es: ");
            int hora = sc.nextInt();
            System.out.println("Dime que minuto es: ");
            int minuto = sc.nextInt();
            System.out.println("Dime que segundo es: ");
            int segundo = sc.nextInt();
            segundo++;
            if (segundo>59) {
                segundo = 0;
            
            minuto++;
            if (minuto>59){
                minuto = 0;
           
            hora++;
            if (hora>23){
                hora = 00;
            }
            }
            }
            System.out.println("Hora + 1 segundo:" + hora + ":" + minuto + ":" + segundo);
        }
    }
            
            
