    package programacion.Tema3;
    import java.util.Random;
    public class dadobreakcontinue {
    public static void main(String[] args) {
Random dadobreakcontinue = new Random();
  int contador = 0;
 int elemlinea = 0; 
    while (true){
    int valor = dadobreakcontinue.nextInt(30) + 1;       
        if (valor >= 10 && valor <= 20){
            if (valor == 15){
                System.out.println("Se ha obtenido el num 15 se ha acabado el programa");
            break;           
            }
            continue;
        }
        System.out.print(valor + " ");
        contador ++;
        elemlinea ++;
        if (elemlinea == 5){
            System.out.println();
            elemlinea = 0;           
        }        
    }
System.out.println("\nTotal de números impresos: " + contador);
    }
}