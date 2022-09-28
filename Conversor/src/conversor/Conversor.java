/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor;

import java.util.Scanner;

/**
 *
 * @author Alumno Mañana
 */
public class Conversor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lectura = new Scanner (System.in);
        int entero = Integer.parseInt(lectura.nextLine());
        System.out.println("entero = " + entero);
        String.valueOf(entero);
        
    }
    
}
