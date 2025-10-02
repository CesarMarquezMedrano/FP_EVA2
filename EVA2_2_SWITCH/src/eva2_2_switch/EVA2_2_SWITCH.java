/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_2_switch;

import java.util.Scanner;

/**
 *
 * @author cmarq
 */
public class EVA2_2_SWITCH {

    public static void main(String[] args) {
        // SWITCH --> OPCION MULTIPLE
        Scanner captu = new Scanner (System.in);
        int dia;
        System.out.println("Dia de la semqana del 1 al 100");
        dia = captu.nextInt();
        /*
        
        */
        switch (dia){//OPCIONES --> CASOS
            case 1:
            System.out.println("Lunes");
            break; //FIN DEL CASO Y DEL SWITCH
            case 2:
            System.out.println("Martes");
            break;
            case 3:
            System.out.println("Miercoles");
            break;
            case 4:
            System.out.println("Jueves");
            break;
            case 5:
            System.out.println("Viernes");
            break;
            case 6:
            System.out.println("Sabado");
            break;
            case 7:
            System.out.println("Domingo");
            break;
            default: //OPCIONAL, SIEMPRE AL FINAL, NO NECESITA BREAK
           System.out.println("INCORRECTO");
        }
        }
            
        }
    
    

