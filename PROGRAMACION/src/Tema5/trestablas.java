/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tema5;

/**
 *
 * @author hucabr753
 */
public class trestablas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int a1[];
    a1 = new int[5];
    a1[0] = 1;
    a1[1] = 2;
    a1[2] = 3;
    a1[3] = 4;
    a1[4] = 5;
    double b1[];
    b1 = new double[5];
    b1[0] = 1.1;
    b1[1] = 2.1;
    b1[2] = 3.1;
    b1[3] = 4.1;
    b1[4] = 5.1;
    boolean c1[];
    c1 = new boolean[5];
    c1[0] = true;
    c1[1] = false;
    c1[2] = true;
    c1[3] = false;
    c1[4] = true;
       
for (int i = 0; i < a1.length; i++) {
            System.out.println("Bloque " + i + ":");
            System.out.println("Entero: " + a1[i]);
            System.out.println("Double: " + b1[i]);
            System.out.println("Boolean: " + c1[i]);
        }
    }
    
}
