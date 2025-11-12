
package programacion;


public class Ejemploswitch {

    public static void main(String[] args) {
        int a = 10;
        switch (a-2) {
            case 1:
                System.out.print("Hola ");
            case 5:
                System.out.print("Me ");
            case 8:
                System.out.print("Alegro ");
            case 9:
                System.out.print("De ");
            case 11:
                System.out.print("Conocerte ");
                    default:
                        System.out.print("Sin coincidencia ");
            
        }
        
    }
    
}
