package programacion.Tema3;
import java.util.Scanner;
public class multiplicacionimpares {
 public static void main(String[] args) {
int tabla;

 for ( tabla = 1; tabla <= 10; tabla++){
 if (tabla % 2 == 0){
 continue;
 }
  System.out.println("\n\nTabla del " + tabla);
for (int i = 1; i <=10; i++){
 int resultado = tabla * i;
 if (resultado % 2 != 0) {
 continue;
}  
    System.out.println(tabla + " x " + i + "=" + tabla *i);
  }
}
 }
}

