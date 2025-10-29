/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_29_continue;

/**
 *
 * @author cmarq
 */
public class EVA2_29_CONTINUE {
    public static void main(String[] args) {
        // TODO code application logic here
        //continue --> detiene la iteracion (repeticion actual)
        for (int i = 0; i < 100; i++){
        int resi = i % 2;
        if (resi != 0 )
            continue;//aqui se interrumpe el ciclo
        System.out.println(i + " - ");
        }
    }
    
}
