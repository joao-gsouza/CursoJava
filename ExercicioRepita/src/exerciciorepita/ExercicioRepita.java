/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import javax.swing.JOptionPane;
/**
 *
 * @author gui_j
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, s= 0, cont = 0, impar = 0, par = 0, acima = 0, media = 0;
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Infome um numero:<br> (Valor 0 Interrompe)<html>"));
            
            if(n !=0){
            
                if(n%2 == 0){
                    par += 1;
                }else{
                    impar += 1;
                }

                if(n > 100){
                    acima += 1;
                }

                s += n;
                cont++;
            }
        }while(n != 0);
        media = s / cont;
        JOptionPane.showMessageDialog(null, "<html>Resultado Final <hr> <br>Total de Valores: " + cont + ""
                + "<br>Total de Par: "+par
                +"<br>Total de Impares: "+impar
                +"<br>Acma de 100: "+acima
                +"<br>Media dos valores: "+media+"</html>");
        
        
    }
    
}
