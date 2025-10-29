/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_28_buscar;

import java.util.Scanner;

/**
 *
 * @author cmarq
 */
public class EVA2_28_BUSCAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner (System.in);
        int valor;
        int valores[] = new int[10];
        for(int i = 0; i < valores.length; i ++){
           valores [i] = (int)(Math.random()* 100);
        }
        for (int i = 0; i < valores.length; i ++){
            System.out.println("{" + valores[i] + "]");
        }
        System.out.println("");
        System.out.println("Valor a buscar");
        valor = captu.nextInt();
        //BUSCAR
        for (int i = 0; i < valores.length; i++){
            if (valor == valores[i]){
                System.out.println("VALOR ENCONTRADO!!");
                System.out.println("POSICION: " + i);
                break;
            }
        
        }
    }
    
}
