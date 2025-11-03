/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_30_triangulos;

import java.util.Scanner;

/**
 *
 * @author cmarq
 */
public class EVA2_30_TRIANGULOS {
    public static void main(String[] args) {
        Scanner captu = new Scanner (System.in);
        int valor;
        System.out.println("Ingrese la base: ");
        valor = captu.nextInt();
        for (int i = 1; i <= valor; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); 
        }

        
    }
}
        
        
    
    

