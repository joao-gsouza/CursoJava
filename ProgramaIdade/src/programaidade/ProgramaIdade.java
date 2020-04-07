/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaidade;

import java.util.Scanner;

/**
 *
 * @author gui_j
 */
public class ProgramaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite seu ano de nascimento: ");
        int nasc = teclado.nextInt();
        int i = 2020 - nasc;
        
        System.out.println("Sua idade " + i);
        
        if (i>=18) {
            System.out.println("Maior de Idade");
        }else{
            System.out.println("Menor de Idade");
        }
        
    }
    
}
