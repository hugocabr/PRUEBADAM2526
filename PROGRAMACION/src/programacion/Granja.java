    package programacion;
    import java.util.Scanner;

     public class Granja {
     public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Cunta cantidad se compra diariamente de comida: ");  
     double comidaDiaria = sc.nextDouble();
     System.out.println("Cuantos animales hay que alimentar: ");
     double numAnimales = sc.nextDouble();
     System.out.println("Cuantos kilos come de media un animal: ");
     double kilosPorAnimal = sc.nextDouble();
     if (numAnimales <= 0 || kilosPorAnimal <= 0) {
         System.out.println("Error no puede ser cero");
     } else {
         double comidaNecesaria = numAnimales * kilosPorAnimal;
         if (comidaDiaria >= comidaNecesaria){
     System.out.println("Hay comida necesaria");
         } else {
             double comidaPorAnimal = comidaDiaria / numAnimales;
             System.out.println("Hay comida necesaria");
         }
                double racionPorAnimal = comidaDiaria / numAnimales;
                System.out.println("Cada animal recibirá aproximadamente " + racionPorAnimal + " kilos.");
            }
        }

        
    }


