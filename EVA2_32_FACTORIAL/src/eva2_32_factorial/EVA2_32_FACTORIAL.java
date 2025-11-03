/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_32_factorial;

import java.util.Scanner;

/**
 *
 * @author cmarq
 */
public class EVA2_32_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner (System.in); 
        System.out.println("Ingresa un numero para calcular el factorial: ");
        int numero = captu.nextInt();
        long factorial = 1;
        if (numero < 0) {
            System.out.println("El factorial no esta definido para numeros negativos");
        }else {
        for (int i = 1; i <= numero; i++) {
        factorial *= i;
        }
        }
        System.out.println("El factorial de numero " + numero + " es: " + factorial);
        
    }
    
}
