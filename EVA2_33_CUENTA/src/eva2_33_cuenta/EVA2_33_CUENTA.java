/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_33_cuenta;

import java.util.Scanner;

/**
 *
 * @author cmarq
 */
public class EVA2_33_CUENTA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        double saldo = 1000000;

        while (saldo > 0) {
            System.out.printf("Saldo actual: $%.2f%n", saldo);
            System.out.print("¿Cuánto deseas retirar? $");

            if (captu.hasNextDouble()) {
                double retiro = captu.nextDouble();
                saldo -= retiro;

                if (saldo < 0) {
                    System.out.printf("¡Has sobregirado tu cuenta! Saldo actual: $%.2f%n", saldo);
                } else if (saldo == 0) {
                    System.out.println("Tu cuenta se ha agotado. Saldo: $0");
                }
            } else {
                System.out.println("Entrada inválida. Por favor ingresa una cantidad numérica.");
                captu.next();
            }
        }

        System.out.println("Operación finalizada.");
        
    }
}

    
    

