package programacion;
import java.util.Scanner;
public class Diamesyano {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Boolean Fechacorrecta;
        System.out.print("Dime un dia: ");
        Int dia = sc.nextInt();
        System.out.print("Dime un mes: ");
        Int mes = sc.nextInt();
        System.out.print("Dime un ano: ");
        Int año = sc.nextInt();
        if (año == 0){
            Fechacorrecta = false;
        } else {
            if (mes == 2 && (1 <= dia && dia <=28))
            Fechacorrecta = true;
        } else 
            if ((mes == 4|| mes == 6|| mes== 9|| mes == 11)
               && (1<= dia && dia <=30)) {
            Fechacorrecta = true;
        } else 
            if ((mes ==1|| mes == 3|| mes == 5 ||mes == 7|| mes == 8||mes == 10|| mes == 12)
               && (1<= dia && dia <=31)) {
               Fechacorrecta = true;
        } else {
            Fechacorrecta = false;
        }
    }
    if {
    System.out.println("Fecha OK:" + dia + "/" mes + "/" + ano);
} else {
    System.out.println("Fecha incorrecta");
}
}
}
}
