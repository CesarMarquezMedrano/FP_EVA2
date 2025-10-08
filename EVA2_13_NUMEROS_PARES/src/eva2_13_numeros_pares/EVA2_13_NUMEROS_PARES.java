/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_13_numeros_pares;

import java.util.Scanner;

/**
 *
 * @author cmarq
 */
public class EVA2_13_NUMEROS_PARES {

    public static void main(String[] args) {
        //3 50
        Scanner captu =new Scanner (System.in);
        int ini, fin;
        System.out.println("Inicio: ");
        ini = captu.nextInt();
        System.out.println("Fin: ");
        fin = captu.nextInt();
        for(int i = ini; i <= fin; i++){
        int res1 = i % 2;
        if (res1 == 0){
        System.out.println(i + " - ");
        }
        }
                
    
                }
    
}
