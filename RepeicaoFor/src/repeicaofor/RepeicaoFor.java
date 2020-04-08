/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repeicaofor;

/**
 *
 * @author gui_j
 */
public class RepeicaoFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int cc = 0; cc <= 100; cc+=10) {
            for (int i = 0; i <= 10; i+=5) {
                System.out.println("Cambalhota " + cc +" " +i);
            }
        }
    }
    
}
