/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_3_switch;

import java.util.Scanner;

/**
 *
 * @author cmarq
 */
public class EVA2_3_SWITCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner (System.in);
        String valor = "Lunes";
       System.out.println("Elige un dia de la semana: ");
        valor = captu.nextLine();
        switch (valor){
            case "Lunes" -> System.out.println(1);
            case "Martes" -> System.out.println(2);
            case "Miercoles" -> System.out.println(3);
            case "Jueves" -> System.out.println(4);
            case "Viernes" -> System.out.println(5);
            case "Sabado" -> System.out.println(6);
            case "Domingo" -> System.out.println(7);
            default -> System.out.println("VALOR INCORRECTO");
        }
       // double valorDouble = 5.5;
       //witch(valorDouble)
        //case 1.1:
        //System.out.println("10.1");
        //break;
        //case 5.5:
        //System.out.println("");
        //break:
        
        
            
        
        }
    }
    

