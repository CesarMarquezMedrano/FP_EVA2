/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_5_arreglos_string;

import java.util.Scanner;

/**
 *
 * @author cmarq
 */
public class EVA2_5_ARREGLOS_STRING {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] a, b, c;
        int [] x, y, z;
        String cadena [] = new String[7];
        cadena [0] = "Lunes";
        cadena [1] = "Martes";
        cadena [2] = "Miercoles";
        cadena [3] = "Jueves";
        cadena [4] = "Viernes";
        cadena [5] = "Sabado";
        cadena [6] = "Domingo";
        Scanner captu = new Scanner (System.in);
        int dia;
        System.out.println("Dia de la semana (0 a 6)");
        dia = captu.nextInt();
        System.out.println(cadena[dia]);
        
    }
    
}
