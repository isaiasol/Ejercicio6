/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioseismultiploocho;

import java.util.Scanner;

/**
 *
 * @author OrtizL
 */
public class EjercicioSeisMultiploOcho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String numero;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce un número entero");
        numero= teclado.nextLine();
        
        if (numero.matches("[0-9]*"))
        {        
            int numero2=Integer.parseInt(numero);
            if (numero2%8==0)
            {
                System.out.println("El número es múltiplo de 8");
            }
            else
            {
                System.out.println("El número no es múltiplo de 8");
            }
        }
        else
        {
            System.out.println("Introducir un valor numérico entero");
        }
    }
    
}
