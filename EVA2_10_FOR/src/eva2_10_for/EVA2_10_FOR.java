 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_10_for;

/**
 *
 * @author cmarq
 */
public class EVA2_10_FOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //IMPRIMIR LOS NUMEROS DEL 1 AL 20
        for (int i = 1; i <= 20; i++){
          System.out.print(i + " - ");
          //IMPRIMIR AL REVES (20 A 1)
        }
        //IMPRIMIR LOS PARES DE 0 100
        // 0 - 2 - 4 - 6 - 8 - ...98 - 100
        //+=, -=, *=, /=
        System.out.println("");
        for (int i = 0; i <= 100; i +=2 ){
        System.out.println(i + " - ");
        }
        //IMPRIMIR EN ORDEN INVERSO
        System.out.println("");
        for (int i = 100; i >= 0; i -=2){
         System.out.println(i + " - ");
    }
    }
    
}
