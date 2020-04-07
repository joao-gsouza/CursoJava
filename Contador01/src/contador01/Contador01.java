/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contador01;

/**
 *
 * @author gui_j
 */
public class Contador01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cc = 1;
        while(cc <=40){
            
            cc++;
            
            if(cc == 5 || cc == 7){
                continue;
            }
            if(cc == 10){
                break;
            }
            System.out.println("Cambalhota "+ cc);
        }
    }
    
}
