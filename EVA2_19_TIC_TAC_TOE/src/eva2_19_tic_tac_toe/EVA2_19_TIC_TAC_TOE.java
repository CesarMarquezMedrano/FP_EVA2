/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_19_tic_tac_toe;

import java.util.Scanner;

/**
 *
 * @author cmarq
 */
public class EVA2_19_TIC_TAC_TOE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int tictac[][] = new int [3][3];
         int fila, col, jug;
         Scanner captu = new Scanner (System.in);
         for (int i = 0; i < 10; i++){
             System.out.println("Introduce la jugada: fila");
             fila = captu.nextInt();
             System.out.println("Introduce la jugada: columna");
             col = captu.nextInt();
             System.out.println("jugador 1 o 2");
             jug = captu.nextInt();
             tictac[fila][col] = jug;
             
         }
         for(int i = 0; i < tictac.length; i++){
          for(int j  = 0; j < tictac[i].length; j++){
              System.out.print("{" + tictac[i][j] + "}");
             
             
                }
                }
         }
}
