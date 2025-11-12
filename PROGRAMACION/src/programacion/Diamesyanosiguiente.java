    package programacion;
    import java.util.Scanner;

    public class Diamesyanosiguiente {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Dime que dia es: ");
        int dia = sc.nextInt();
        System.out.println("Dime que mes es: ");
        int mes = sc.nextInt();
        System.out.println("Dime que ano es: ");
        int ano = sc.nextInt();
        int diasdelmes;
        diasdelmes = switch(mes){
    case 2 -> 28;
    case 4,6,9,11 -> 30;
    case 1,3,5,7,8,10,12 -> 31;
    default -> {
        System.out.println("Mes inválido.");
        yield 0;
    }
};
        dia++;
        if (dia > diasdelmes){
            dia = 1;
         mes++;
         if (mes>12) {
            mes = 1;
         ano++;
         }
        }
        if (ano == 0){
            ano = 1;
        }
        System.out.println(dia + "/" + mes + "/" + ano);
                }
    }
            
        
    
    
