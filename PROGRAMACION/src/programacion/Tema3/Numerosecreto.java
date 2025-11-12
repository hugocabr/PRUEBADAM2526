    package programacion.Tema3;
    import java.util.Scanner;

    public class Numerosecreto {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int NumSecreto = (int) (Math.random()* 100 +1);
    System.out.println("Introduzca un numero entre 1 y 100: ");
    int num = sc.nextInt();
    while (NumSecreto != num && num != -1){
        if (NumSecreto < num){
            System.out.println("Menor");  
        }else{             
           System.out.println("Mayor");
        
        }
        System.out.println("Introduze un numero: ");
         num = sc.nextInt();
    }
         if (NumSecreto == num) {
            System.out.println("Lo has conseguido");
        } else {
            System.out.println("No lo has conseguido");
        }
    }
    }
    

