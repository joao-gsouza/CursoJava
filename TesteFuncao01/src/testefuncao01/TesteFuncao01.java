/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testefuncao01;

/**
 *
 * @author gui_j
 */
public class TesteFuncao01 {

    /**
     * @param args the command line arguments
     */
    
    static int soma(int a, int b){
        int s = a + b;
        return s;
    }
    
    public static void main(String[] args) {
        int s = soma(2,27);
        
        System.out.println("A soma é " + s);
    }
    
}
