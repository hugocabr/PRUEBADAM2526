    package programacion;
    import java.util.Scanner;

    public class Concierto {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce el aforomaximo: "); 
    int aforomaximo = sc.nextInt();
    System.out.println("Introduce el precioentrada: "); 
    int precioentrada = sc.nextInt();
    System.out.println("Introduce las entradasvendidas: "); 
    int entradasvendidas = sc.nextInt();
    if (entradasvendidas < (aforomaximo * 20 / 100)){
        System.out.println("Se ha cancelado el concierto");
    } else if (entradasvendidas < (aforomaximo * 50 / 100)){
            int precioRebajado = precioentrada - (precioentrada * 25 / 100);
            int total = entradasvendidas * precioRebajado;
            System.out.println("Se ha realizado una rebaja del 25%");
            System.out.println("Dinero recaudado: " + total + " euros");
        
        }

        
    }
}
